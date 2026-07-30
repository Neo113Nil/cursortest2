package com.anythink.expressad.advanced.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.by;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f17868a = "BaseDeviceInfo";

    /* renamed from: e, reason: collision with root package name */
    public String f17872e;

    /* renamed from: f, reason: collision with root package name */
    public String f17873f;

    /* renamed from: h, reason: collision with root package name */
    public String f17875h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f17876j;

    /* renamed from: k, reason: collision with root package name */
    public String f17877k;

    /* renamed from: l, reason: collision with root package name */
    public String f17878l;

    /* renamed from: m, reason: collision with root package name */
    public String f17879m;

    /* renamed from: n, reason: collision with root package name */
    public String f17880n;

    /* renamed from: o, reason: collision with root package name */
    public String f17881o;

    /* renamed from: p, reason: collision with root package name */
    public String f17882p;

    /* renamed from: q, reason: collision with root package name */
    public String f17883q;

    /* renamed from: r, reason: collision with root package name */
    public String f17884r;

    /* renamed from: s, reason: collision with root package name */
    public String f17885s;

    /* renamed from: t, reason: collision with root package name */
    public int f17886t;

    /* renamed from: u, reason: collision with root package name */
    public int f17887u;

    /* renamed from: d, reason: collision with root package name */
    public String f17871d = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: b, reason: collision with root package name */
    public String f17869b = n.c();

    /* renamed from: c, reason: collision with root package name */
    public String f17870c = n.d();

    /* renamed from: g, reason: collision with root package name */
    public String f17874g = m.f();

    public b(Context context) {
        this.f17873f = m.d(context);
        int b9 = n.b();
        this.i = String.valueOf(b9);
        this.f17876j = n.a(context, b9);
        this.f17877k = m.h();
        this.f17878l = com.anythink.expressad.foundation.b.a.c().g();
        this.f17879m = com.anythink.expressad.foundation.b.a.c().f();
        this.f17880n = String.valueOf(v.f(context));
        this.f17881o = String.valueOf(v.e(context));
        this.f17883q = String.valueOf(v.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f17882p = "landscape";
        } else {
            this.f17882p = "portrait";
        }
        s c4 = t.b().c();
        String fillCDataParam = c4 != null ? c4.fillCDataParam("at_device1|||at_device2|||at_device3") : "";
        if (TextUtils.isEmpty(fillCDataParam)) {
            this.f17872e = "";
            this.f17875h = "";
        } else {
            String[] split = fillCDataParam.split("\\|\\|\\|");
            try {
                this.f17872e = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.f17875h = split[2];
            } catch (Throwable unused2) {
            }
        }
        this.f17884r = n.f();
        this.f17885s = com.anythink.expressad.foundation.h.d.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f17869b);
            jSONObject.put("system_version", this.f17870c);
            jSONObject.put("network_type", this.i);
            jSONObject.put("network_type_str", this.f17876j);
            jSONObject.put("device_ua", this.f17877k);
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
            jSONObject.put("plantform", this.f17871d);
            jSONObject.put(k.b("ZGV2aWNlX2ltZWk="), this.f17872e);
            jSONObject.put("android_id", this.f17873f);
            jSONObject.put("google_ad_id", this.f17874g);
            jSONObject.put("oaid", this.f17875h);
            jSONObject.put("appkey", this.f17878l);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f22565u, this.f17879m);
            jSONObject.put("screen_width", this.f17880n);
            jSONObject.put("screen_height", this.f17881o);
            jSONObject.put("orientation", this.f17882p);
            jSONObject.put("scale", this.f17883q);
            if (n.k() != 0) {
                jSONObject.put("tun", n.k());
            }
            jSONObject.put("f", this.f17884r);
            if (!ATSDK.isCnSDK()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObject;
    }
}
