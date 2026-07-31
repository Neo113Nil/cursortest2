package com.iab.omid.library.startio.publisher;

import android.content.Context;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.VerificationScriptResource;
import com.iab.omid.library.startio.internal.g;
import com.iab.omid.library.startio.internal.h;
import com.iab.omid.library.startio.utils.f;
import com.onesignal.debug.internal.crash.AnrConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {
    private WebView g;
    private Long h;
    private final Map i;
    private final String j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return com.iab.omid.library.startio.webviewclient.a.a(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return com.iab.omid.library.startio.webviewclient.a.a(str);
        }
    }

    /* renamed from: com.iab.omid.library.startio.publisher.b$b, reason: collision with other inner class name */
    class C0016b extends WebViewClient {
        C0016b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f51a;

        c() {
            this.f51a = b.this.g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f51a.destroy();
        }
    }

    public b(String str, Map map, String str2) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        new StringBuilder("WebView renderer gone: ").append(renderProcessGoneDetail.toString()).append(" for WebView: ").append(webView);
        if (getWebView() == webView) {
            a((WebView) null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    private boolean a(boolean z, Context context) {
        return !z && com.iab.omid.library.startio.attestation.c.a(context).b();
    }

    private WebViewClient c(boolean z) {
        return z ? k() : j();
    }

    private WebViewClient j() {
        return new C0016b();
    }

    private WebViewClient k() {
        return new a();
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.startio.utils.c.a(jSONObject, str, ((VerificationScriptResource) injectedResourcesMap.get(str)).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new c(), Math.max(4000 - (this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.h.longValue(), TimeUnit.NANOSECONDS)), AnrConstants.DEFAULT_CHECK_INTERVAL_MS));
        this.g = null;
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        l();
    }

    void l() {
        Context a2 = g.b().a();
        WebView webView = new WebView(a2);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(c(a(com.iab.omid.library.startio.attestation.g.a(this.g), a2)));
        a(this.g);
        h.a().c(this.g, this.j);
        for (String str : this.i.keySet()) {
            h.a().d(this.g, ((VerificationScriptResource) this.i.get(str)).getResourceUrl().toExternalForm(), str);
        }
        this.h = Long.valueOf(f.b());
    }
}
