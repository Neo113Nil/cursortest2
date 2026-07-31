package com.bytedance.sdk.openadsdk.core;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* loaded from: classes14.dex */
public class oub {
    public static void zmn(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}
