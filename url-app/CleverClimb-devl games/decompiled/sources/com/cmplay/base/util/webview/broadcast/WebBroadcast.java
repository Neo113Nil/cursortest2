package com.cmplay.base.util.webview.broadcast;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmplay.base.util.h;
import com.cmplay.base.util.webview.ui.WebViewActivity;

/* loaded from: classes.dex */
public class WebBroadcast extends BroadcastReceiver {
    public static final String ACTION = "com.cmplay.base.util.webview.broadcast.WebBroadcast";
    public static final String HIDE_WEBVIEW_CLOSE_BTN = "hide_webview_close_btn";
    public static final String KEY_SHOW_VALUE = "key_show_value";

    public static void HideWebViewCloseBtn(Activity activity, boolean z) {
        Intent intent = new Intent();
        intent.setAction(ACTION);
        intent.setPackage(activity.getPackageName());
        intent.putExtra(HIDE_WEBVIEW_CLOSE_BTN, true);
        intent.putExtra("show_value", z);
        activity.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WebViewActivity webViewActivityRef = WebViewActivity.getWebViewActivityRef();
        h.a("closeBtn", "WebBroadcast.onReceive   webViewActivity:" + webViewActivityRef);
        if (webViewActivityRef == null || webViewActivityRef.isFinishing() || !intent.getBooleanExtra(HIDE_WEBVIEW_CLOSE_BTN, false)) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra(KEY_SHOW_VALUE, false);
        h.a("closeBtn", "WebBroadcast.onReceive CALLBACK_AD  webViewActivity:" + webViewActivityRef + "    show:" + booleanExtra);
        if (webViewActivityRef == null || webViewActivityRef.getLayout() == null) {
            return;
        }
        if (booleanExtra) {
            webViewActivityRef.getLayout().showCloseBtn();
        } else {
            webViewActivityRef.getLayout().hideCloseBtn();
        }
    }
}
