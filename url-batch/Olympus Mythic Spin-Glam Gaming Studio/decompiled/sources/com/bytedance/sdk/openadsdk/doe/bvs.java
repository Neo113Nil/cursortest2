package com.bytedance.sdk.openadsdk.doe;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes5.dex */
public class bvs {
    private static void fs(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            nps.zmn("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void zmn(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            nps.zmn("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void zmn(WebView webView) {
        if (webView == null) {
            return;
        }
        fs(webView);
        WebSettings settings = webView.getSettings();
        zmn(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            nps.zmn("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            nps.zmn("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z = i >= 28;
        try {
        } catch (Throwable th3) {
            nps.zmn("WebViewSettings", "setLayerType error", th3);
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
