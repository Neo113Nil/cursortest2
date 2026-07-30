package com.anythink.expressad.video.signal.a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.e.g;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.module.AnythinkVideoView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: n, reason: collision with root package name */
    private static final String f21984n = "onVideoStatusNotify";

    /* renamed from: o, reason: collision with root package name */
    private static final String f21985o = "onJSClick";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21986p = "onVideoProgressNotify";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21987q = "webviewshow";

    /* renamed from: r, reason: collision with root package name */
    private static final String f21988r = "showDataInfo";

    /* renamed from: s, reason: collision with root package name */
    private static final String f21989s = "portrait";

    /* renamed from: t, reason: collision with root package name */
    private static final String f21990t = "landscape";

    /* renamed from: u, reason: collision with root package name */
    private WebView f21991u;

    public l(WebView webView) {
        this.f21991u = webView;
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a() {
        super.a();
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f21991u);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i) {
        super.a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21991u, f21984n, encodeToString);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i, String str) {
        super.a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21991u, f21985o, encodeToString);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(AnythinkVideoView.a aVar) {
        super.a(aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(g.a.f13106C, a(aVar.f21853a, aVar.f21854b));
            jSONObject.put("time", String.valueOf(aVar.f21853a));
            jSONObject.put("duration", String.valueOf(aVar.f21854b));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21991u, f21986p, encodeToString);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private static String a(int i, int i4) {
        if (i4 != 0) {
            double d2 = i / i4;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(v.a(Double.valueOf(d2)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i4);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(Object obj) {
        String str;
        super.a(obj);
        if (obj != null && (obj instanceof String)) {
            str = Base64.encodeToString(obj.toString().getBytes(), 2);
        } else {
            str = "";
        }
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f21991u, f21987q, str);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i, int i4, int i9, int i10) {
        super.a(i, i4, i9, i10);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = f21990t;
            if (i != 2 ? i4 != 2 : i4 == 1) {
                str = f21989s;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i9);
            jSONObject2.put("screen_height", i10);
            jSONObject.put("data", jSONObject2);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21991u, f21988r, encodeToString);
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        }
    }
}
