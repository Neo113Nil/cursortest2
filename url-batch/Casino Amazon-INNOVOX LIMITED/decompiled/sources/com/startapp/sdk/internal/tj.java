package com.startapp.sdk.internal;

import android.os.Build;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class tj extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26 || !renderProcessGoneDetail.didCrash()) {
            return false;
        }
        Log.e("StartAppSDK", "WebView render process crashed");
        return true;
    }
}
