package com.tapjoy.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class du extends dt {
    @SuppressLint({"SetJavaScriptEnabled"})
    public du(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
