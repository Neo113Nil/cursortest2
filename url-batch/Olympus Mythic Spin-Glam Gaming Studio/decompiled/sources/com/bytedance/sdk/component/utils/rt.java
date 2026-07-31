package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.safedk.android.internal.partials.PangleNetworkBridge;

/* loaded from: classes15.dex */
public class rt {
    private static final zmn zmn = new fs();

    private static class zmn {
        private zmn() {
        }

        public void zmn(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                PangleNetworkBridge.webviewLoadUrl(webView, str);
            } catch (Throwable unused) {
            }
        }
    }

    @TargetApi(19)
    private static class fs extends zmn {
        private fs() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.rt.zmn
        public void zmn(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                PangleNetworkBridge.webviewLoadUrl(webView, str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void zmn(WebView webView, String str) {
        zmn.zmn(webView, str);
    }
}
