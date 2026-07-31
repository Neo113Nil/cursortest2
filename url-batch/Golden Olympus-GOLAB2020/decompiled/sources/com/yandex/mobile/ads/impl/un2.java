package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class un2 extends AbstractC2178q8 {

    /* renamed from: f, reason: collision with root package name */
    private WebView f33213f;

    /* renamed from: g, reason: collision with root package name */
    private Long f33214g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, ta2> f33215h;

    /* renamed from: i, reason: collision with root package name */
    private final String f33216i;

    final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final WebView f33217b;

        a(un2 un2Var) {
            this.f33217b = un2Var.f33213f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33217b.destroy();
        }
    }

    public un2(String str, Map map) {
        this.f33215h = map;
        this.f33216i = str;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2178q8
    public final void b() {
        super.b();
        new Handler().postDelayed(new a(this), Math.max(4000 - (this.f33214g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f33214g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f33213f = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2178q8
    public final void a() {
        WebView webView = new WebView(ho2.a().b());
        this.f33213f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f33213f);
        WebView webView2 = this.f33213f;
        String str = this.f33216i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String str2 : this.f33215h.keySet()) {
            String externalForm = this.f33215h.get(str2).a().toExternalForm();
            WebView webView3 = this.f33213f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f33214g = Long.valueOf(System.nanoTime());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2178q8
    public final void a(ln2 ln2Var, C2109n8 c2109n8) {
        JSONObject jSONObject = new JSONObject();
        Map<String, ta2> d4 = c2109n8.d();
        for (String str : d4.keySet()) {
            yn2.a(jSONObject, str, d4.get(str));
        }
        a(ln2Var, c2109n8, jSONObject);
    }
}
