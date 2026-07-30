package com.anythink.expressad.foundation.h;

import android.content.Context;
import com.anythink.core.common.h.by;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    private static final String f19750A = "landscape";

    /* renamed from: z, reason: collision with root package name */
    private static final String f19751z = "portrait";

    /* renamed from: d, reason: collision with root package name */
    public String f19755d;

    /* renamed from: e, reason: collision with root package name */
    public String f19756e;

    /* renamed from: g, reason: collision with root package name */
    public String f19758g;

    /* renamed from: h, reason: collision with root package name */
    public String f19759h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f19760j;

    /* renamed from: k, reason: collision with root package name */
    public String f19761k;

    /* renamed from: l, reason: collision with root package name */
    public String f19762l;

    /* renamed from: m, reason: collision with root package name */
    public String f19763m;

    /* renamed from: n, reason: collision with root package name */
    public String f19764n;

    /* renamed from: o, reason: collision with root package name */
    public String f19765o;

    /* renamed from: p, reason: collision with root package name */
    public String f19766p;

    /* renamed from: q, reason: collision with root package name */
    public String f19767q;

    /* renamed from: r, reason: collision with root package name */
    public String f19768r;

    /* renamed from: s, reason: collision with root package name */
    public String f19769s;

    /* renamed from: t, reason: collision with root package name */
    public String f19770t;

    /* renamed from: u, reason: collision with root package name */
    public String f19771u;

    /* renamed from: v, reason: collision with root package name */
    public int f19772v;

    /* renamed from: w, reason: collision with root package name */
    public String f19773w;

    /* renamed from: x, reason: collision with root package name */
    public String f19774x;

    /* renamed from: y, reason: collision with root package name */
    public JSONObject f19775y;

    /* renamed from: c, reason: collision with root package name */
    public String f19754c = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: a, reason: collision with root package name */
    public String f19752a = n.c();

    /* renamed from: b, reason: collision with root package name */
    public String f19753b = n.d();

    /* renamed from: f, reason: collision with root package name */
    public String f19757f = com.anythink.core.common.v.m.f();

    public c(Context context) {
        this.f19755d = com.anythink.core.common.v.m.d(context);
        int b9 = n.b();
        this.f19758g = String.valueOf(b9);
        this.f19759h = n.a(context, b9);
        this.i = com.anythink.core.common.v.m.h();
        this.f19760j = com.anythink.expressad.foundation.b.a.c().g();
        this.f19761k = com.anythink.expressad.foundation.b.a.c().f();
        this.f19762l = String.valueOf(v.f(context));
        this.f19763m = String.valueOf(v.e(context));
        this.f19768r = String.valueOf(v.c(context));
        this.f19769s = com.anythink.expressad.foundation.b.a.c().j().toString();
        this.f19771u = com.anythink.core.common.v.m.b();
        this.f19772v = com.anythink.core.common.o.a().c();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f19764n = f19750A;
        } else {
            this.f19764n = f19751z;
        }
        com.anythink.core.common.d.s c4 = com.anythink.core.common.d.t.b().c();
        String[] split = (c4 != null ? c4.fillCDataParam("at_device1|||at_device2|||at_device3") : "|||").split("\\|\\|\\|");
        if (split != null) {
            this.f19756e = split.length > 0 ? split[0] : "";
            this.f19773w = split.length > 1 ? split[1] : "";
            this.f19767q = split.length > 2 ? split[2] : "";
        }
        this.f19765o = com.anythink.expressad.foundation.g.a.cs;
        this.f19766p = com.anythink.expressad.foundation.g.a.ct;
        this.f19770t = n.f();
        this.f19774x = d.a();
        this.f19775y = b();
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(n.j());
            jSONObject.put("cid", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(n.g());
            jSONObject.put("dmt", sb2.toString());
            jSONObject.put("dmf", n.h());
            jSONObject.put(com.anythink.expressad.f.a.b.dy, n.i());
            jSONObject.put(com.anythink.core.common.v.k.b("aW1laQ=="), this.f19756e);
            jSONObject.put(com.anythink.core.common.v.k.b("bWFj"), this.f19773w);
            jSONObject.put("oaid", this.f19767q);
            jSONObject.put("android_id", this.f19755d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f19752a);
            jSONObject.put("system_version", this.f19753b);
            jSONObject.put("network_type", this.f19758g);
            jSONObject.put("network_type_str", this.f19759h);
            jSONObject.put("device_ua", this.i);
            by R8 = com.anythink.core.common.d.t.b().R();
            if (R8 != null) {
                jSONObject.put("has_wx", R8.a());
                jSONObject.put("integrated_wx", R8.b());
                StringBuilder sb = new StringBuilder();
                sb.append(R8.c());
                jSONObject.put("opensdk_ver", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(R8.d());
                jSONObject.put("wx_api_ver", sb2.toString());
            }
            jSONObject.put("brand", this.f19771u);
            jSONObject.put("mnc", com.anythink.core.common.v.m.c(com.anythink.core.common.d.t.b().g()));
            jSONObject.put("mcc", com.anythink.core.common.v.m.b(com.anythink.core.common.d.t.b().g()));
            jSONObject.put("plantform", this.f19754c);
            jSONObject.put(com.anythink.core.common.v.k.b("ZGV2aWNlX2ltZWk="), this.f19756e);
            jSONObject.put("android_id", this.f19755d);
            jSONObject.put("google_ad_id", this.f19757f);
            jSONObject.put("oaid", this.f19767q);
            jSONObject.put("az_aid_info", this.f19774x);
            jSONObject.put("appkey", this.f19760j);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f22565u, this.f19761k);
            jSONObject.put("screen_width", this.f19762l);
            jSONObject.put("screen_height", this.f19763m);
            jSONObject.put("orientation", this.f19764n);
            jSONObject.put("scale", this.f19768r);
            jSONObject.put("b", this.f19765o);
            jSONObject.put("c", this.f19766p);
            jSONObject.put("web_env", this.f19769s);
            jSONObject.put("f", this.f19770t);
            jSONObject.put("misk_spt", this.f19772v);
            if (n.k() != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(n.k());
                jSONObject.put("tun", sb3.toString());
            }
            jSONObject.put("dvi", com.anythink.core.express.a.a.a(this.f19775y.toString()));
            boolean b9 = com.anythink.core.common.v.p.b();
            jSONObject.put(com.anythink.expressad.foundation.g.f.h.b.f19514d, (com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p()).C() == 2 && b9) ? "1" : "0");
            return jSONObject;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return jSONObject;
        }
    }
}
