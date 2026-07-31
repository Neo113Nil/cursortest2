package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class pz2 extends oz2 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public pz2(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        i(webView);
    }
}
