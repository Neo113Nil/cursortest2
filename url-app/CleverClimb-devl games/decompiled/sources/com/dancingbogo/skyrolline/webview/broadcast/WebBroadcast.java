package com.dancingbogo.skyrolline.webview.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dancingbogo.skyrolline.util.b;
import com.dancingbogo.skyrolline.webview.ui.WebViewActivity;

/* loaded from: classes2.dex */
public class WebBroadcast extends BroadcastReceiver {
    public static void a(Context context, String str) {
        b.b("lottery", "WebBroadcast.getPropsCallback");
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.WebBroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("get_prop_callback", true);
        intent.putExtra("key_data_json", str);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, String str) {
        b.b("lottery", "WebBroadcast.getPropsCallback");
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.WebBroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("get_items_info_callback", true);
        intent.putExtra("key_data_json", str);
        context.sendBroadcast(intent);
    }

    public static void c(Context context, String str) {
        b.b("lottery", "WebBroadcast.canShowAdCallback");
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.WebBroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("can_show_ad", true);
        intent.putExtra("key_data_json", str);
        context.sendBroadcast(intent);
    }

    public static void d(Context context, String str) {
        b.b("lottery", "WebBroadcast.callbackAd");
        Intent intent = new Intent();
        intent.setAction("com.dancingbogo.skyrolline.webview.broadcast.WebBroadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("callback_ad", true);
        intent.putExtra("key_data_json", str);
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WebViewActivity b2 = WebViewActivity.b();
        b.b("lottery", "WebBroadcast.onReceive   webViewActivity:" + b2);
        if (b2 == null || b2.isFinishing()) {
            return;
        }
        if (intent.getBooleanExtra("get_prop_callback", false)) {
            b.b("lottery", "WebBroadcast.onReceive GET_PROP_CALLBACK  webViewActivity:" + b2);
            if (b2 != null) {
                b2.a().h(intent.getStringExtra("key_data_json"));
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("get_items_info_callback", false)) {
            b.b("lottery", "WebBroadcast.onReceive GET_PROP_CALLBACK  webViewActivity:" + b2);
            if (b2 != null) {
                b2.a().i(intent.getStringExtra("key_data_json"));
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("can_show_ad", false)) {
            b.b("lottery", "WebBroadcast.onReceive CAN_SHOW_AD  webViewActivity:" + b2);
            if (b2 != null) {
                b2.a().j(intent.getStringExtra("key_data_json"));
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("callback_ad", false)) {
            b.b("lottery", "WebBroadcast.onReceive CALLBACK_AD  webViewActivity:" + b2);
            if (b2 != null) {
                b2.a().k(intent.getStringExtra("key_data_json"));
            }
        }
    }
}
