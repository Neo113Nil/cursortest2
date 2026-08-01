package com.bytedance.sdk.openadsdk.kj;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: PlayableWebSettings.java */
/* loaded from: classes2.dex */
public class Mxy {
    private static void icD(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            yiw.pvs("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void pvs(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            yiw.pvs("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void pvs(WebView webView) {
        icD(webView);
        WebSettings settings = webView.getSettings();
        pvs(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            yiw.pvs("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            yiw.pvs("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z = Build.VERSION.SDK_INT >= 28;
        try {
        } catch (Throwable th3) {
            yiw.pvs("WebViewSettings", "setLayerType error", th3);
        }
        if (!z) {
            webView.setLayerType(0, null);
        } else {
            if (z) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
