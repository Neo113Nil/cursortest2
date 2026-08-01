package com.bytedance.sdk.component.utils;

import android.webkit.WebView;

/* compiled from: LoadUrlUtils.java */
/* loaded from: classes.dex */
public class kj {
    private static final pvs pvs = new icD();

    /* compiled from: LoadUrlUtils.java */
    private static class pvs {
        private pvs() {
        }

        public void pvs(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: LoadUrlUtils.java */
    private static class icD extends pvs {
        private icD() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.kj.pvs
        public void pvs(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            boolean z = false;
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    z = true;
                } catch (Throwable th) {
                    boolean z2 = th instanceof IllegalStateException;
                }
            }
            if (z) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void pvs(WebView webView, String str) {
        pvs.pvs(webView, str);
    }
}
