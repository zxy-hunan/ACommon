package com.xy.acommon

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tamsiree.rxkit.RxTimeTool
import com.tamsiree.rxkit.RxTool
import com.tamsiree.rxkit.view.RxToast
import com.xy.acommon.ui.theme.ACommonTheme

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RxTool.init(this)
        setContent {
            ACommonTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "TestActivity",
            modifier = modifier
        )
        Row() {
//            RxToast.showToast(RxTool.Md5("123456"))
            Column {
                Text(text = RxTool.Md5("123456"))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = RxTimeTool.curTimeString)
                }
                TextField(value = "test", onValueChange = {

                })
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ACommonTheme {
        Greeting("Android")
    }
}