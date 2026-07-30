package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: g, reason: collision with root package name */
    private static final String f21959g = "orientation";

    /* renamed from: h, reason: collision with root package name */
    private static final String f21960h = "onSystemPause";
    private static final String i = "onSystemResume";

    /* renamed from: j, reason: collision with root package name */
    private static final String f21961j = "onSystemDestory";

    /* renamed from: k, reason: collision with root package name */
    private static final String f21962k = "onSystemBackPressed";

    /* renamed from: l, reason: collision with root package name */
    private static final String f21963l = "portrait";

    /* renamed from: m, reason: collision with root package name */
    private static final String f21964m = "landscape";

    /* renamed from: n, reason: collision with root package name */
    private WebView f21965n;

    /* renamed from: o, reason: collision with root package name */
    private int f21966o = 0;

    public h(WebView webView) {
        this.f21965n = webView;
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a() {
        super.a();
        this.f21966o = 1;
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f21965n, "onSystemPause", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void b() {
        super.b();
        this.f21966o = 0;
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f21965n, "onSystemResume", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void c() {
        super.c();
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f21965n, "onSystemDestory", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void g() {
        super.g();
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f21965n, f21962k, "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final int h() {
        return this.f21966o;
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", f21964m);
            } else {
                jSONObject.put("orientation", f21963l);
            }
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21965n, "orientation", encodeToString);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a(int i4) {
        super.a(i4);
        this.f21966o = i4;
    }
}
