package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.o;

/* loaded from: classes10.dex */
class d {
    private final com.applovin.impl.sdk.k a;
    private final WebViewRenderProcessClient b = new a();

    class a extends WebViewRenderProcessClient {
        a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.a.O();
                if (o.a()) {
                    d.this.a.O().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    d(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    WebViewRenderProcessClient a() {
        return this.b;
    }
}
