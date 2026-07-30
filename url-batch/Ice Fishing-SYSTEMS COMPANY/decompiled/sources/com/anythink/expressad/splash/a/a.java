package com.anythink.expressad.splash.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.by;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.h.d;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public String f20624d;

    /* renamed from: e, reason: collision with root package name */
    public String f20625e;

    /* renamed from: g, reason: collision with root package name */
    public String f20627g;

    /* renamed from: h, reason: collision with root package name */
    public String f20628h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f20629j;

    /* renamed from: k, reason: collision with root package name */
    public String f20630k;

    /* renamed from: l, reason: collision with root package name */
    public String f20631l;

    /* renamed from: m, reason: collision with root package name */
    public String f20632m;

    /* renamed from: n, reason: collision with root package name */
    public String f20633n;

    /* renamed from: o, reason: collision with root package name */
    public String f20634o;

    /* renamed from: p, reason: collision with root package name */
    public String f20635p;

    /* renamed from: q, reason: collision with root package name */
    public String f20636q;

    /* renamed from: r, reason: collision with root package name */
    public String f20637r;

    /* renamed from: c, reason: collision with root package name */
    public String f20623c = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: a, reason: collision with root package name */
    public String f20621a = n.c();

    /* renamed from: b, reason: collision with root package name */
    public String f20622b = n.d();

    /* renamed from: f, reason: collision with root package name */
    public String f20626f = m.f();

    public a(Context context) {
        this.f20625e = m.d(context);
        int b9 = n.b();
        this.f20628h = String.valueOf(b9);
        this.i = n.a(context, b9);
        this.f20629j = m.h();
        this.f20630k = com.anythink.expressad.foundation.b.a.c().g();
        this.f20631l = com.anythink.expressad.foundation.b.a.c().f();
        this.f20632m = String.valueOf(v.f(context));
        this.f20633n = String.valueOf(v.e(context));
        this.f20635p = String.valueOf(v.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f20634o = "landscape";
        } else {
            this.f20634o = "portrait";
        }
        s c4 = t.b().c();
        String fillCDataParam = c4 != null ? c4.fillCDataParam("at_device1|||at_device2|||at_device3") : "";
        if (TextUtils.isEmpty(fillCDataParam)) {
            this.f20624d = "";
            this.f20627g = "";
        } else {
            String[] split = fillCDataParam.split("\\|\\|\\|");
            try {
                this.f20624d = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.f20627g = split[2];
            } catch (Throwable unused2) {
            }
        }
        this.f20636q = n.f();
        this.f20637r = d.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f20621a);
            jSONObject.put("system_version", this.f20622b);
            jSONObject.put("network_type", this.f20628h);
            jSONObject.put("network_type_str", this.i);
            jSONObject.put("device_ua", this.f20629j);
            by R8 = t.b().R();
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
            jSONObject.put("mnc", m.c(t.b().g()));
            jSONObject.put("mcc", m.b(t.b().g()));
            jSONObject.put("plantform", this.f20623c);
            jSONObject.put(k.b("ZGV2aWNlX2ltZWk="), this.f20624d);
            jSONObject.put("android_id", this.f20625e);
            jSONObject.put("google_ad_id", this.f20626f);
            jSONObject.put("oaid", this.f20627g);
            jSONObject.put("az_aid_info", this.f20637r);
            jSONObject.put("appkey", this.f20630k);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f22565u, this.f20631l);
            jSONObject.put("screen_width", this.f20632m);
            jSONObject.put("screen_height", this.f20633n);
            jSONObject.put("orientation", this.f20634o);
            jSONObject.put("scale", this.f20635p);
            if (n.k() != 0) {
                jSONObject.put("tun", n.k());
            }
            jSONObject.put("f", this.f20636q);
            return jSONObject;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return jSONObject;
        }
    }
}
