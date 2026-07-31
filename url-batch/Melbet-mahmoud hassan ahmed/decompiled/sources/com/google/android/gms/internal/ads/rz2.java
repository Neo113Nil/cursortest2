package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rz2 extends oz2 {

    /* renamed from: d, reason: collision with root package name */
    private WebView f11579d;

    /* renamed from: e, reason: collision with root package name */
    private Long f11580e = null;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, vy2> f11581f;

    public rz2(Map<String, vy2> map, String str) {
        this.f11581f = map;
    }

    @Override // com.google.android.gms.internal.ads.oz2
    public final void c() {
        super.c();
        new Handler().postDelayed(new qz2(this), Math.max(4000 - (this.f11580e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f11580e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f11579d = null;
    }

    @Override // com.google.android.gms.internal.ads.oz2
    public final void f(py2 py2Var, ny2 ny2Var) {
        JSONObject jSONObject = new JSONObject();
        Map<String, vy2> i7 = ny2Var.i();
        for (String str : i7.keySet()) {
            sz2.g(jSONObject, str, i7.get(str));
        }
        g(py2Var, ny2Var, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.oz2
    public final void j() {
        WebView webView = new WebView(ez2.b().a());
        this.f11579d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        i(this.f11579d);
        WebView webView2 = this.f11579d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator<String> it = this.f11581f.keySet().iterator();
        if (!it.hasNext()) {
            this.f11580e = Long.valueOf(System.nanoTime());
        } else {
            this.f11581f.get(it.next());
            throw null;
        }
    }
}
