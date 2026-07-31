package com.iab.omid.library.ironsrc.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.internal.g;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f14579g;

    /* renamed from: h, reason: collision with root package name */
    private Long f14580h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f14581i;

    /* renamed from: j, reason: collision with root package name */
    private final String f14582j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.ironsrc.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0142b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f14584a;

        RunnableC0142b() {
            this.f14584a = b.this.f14579g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14584a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f14580h = null;
        this.f14581i = map;
        this.f14582j = str2;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0142b(), Math.max(4000 - (this.f14580h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f14580h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f14579g = null;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    void j() {
        WebView webView = new WebView(g.b().a());
        this.f14579g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f14579g.getSettings().setAllowContentAccess(false);
        this.f14579g.getSettings().setAllowFileAccess(false);
        this.f14579g.setWebViewClient(new a());
        a(this.f14579g);
        h.a().c(this.f14579g, this.f14582j);
        for (String str : this.f14581i.keySet()) {
            h.a().d(this.f14579g, this.f14581i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f14580h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
