package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: A, reason: collision with root package name */
    public static final String f16753A = "it_src";

    /* renamed from: a, reason: collision with root package name */
    public static final String f16754a = "platform";

    /* renamed from: b, reason: collision with root package name */
    public static final String f16755b = "os_vn";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16756c = "os_vc";

    /* renamed from: d, reason: collision with root package name */
    public static final String f16757d = "package_name";

    /* renamed from: e, reason: collision with root package name */
    public static final String f16758e = "app_vn";

    /* renamed from: f, reason: collision with root package name */
    public static final String f16759f = "app_vc";

    /* renamed from: g, reason: collision with root package name */
    public static final String f16760g = "brand";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16761h = "model";
    public static final String i = "screen";

    /* renamed from: j, reason: collision with root package name */
    public static final String f16762j = "network_type";

    /* renamed from: k, reason: collision with root package name */
    public static final String f16763k = "mnc";

    /* renamed from: l, reason: collision with root package name */
    public static final String f16764l = "mcc";

    /* renamed from: m, reason: collision with root package name */
    public static final String f16765m = "language";

    /* renamed from: n, reason: collision with root package name */
    public static final String f16766n = "timezone";

    /* renamed from: o, reason: collision with root package name */
    public static final String f16767o = "sdk_ver";

    /* renamed from: p, reason: collision with root package name */
    public static final String f16768p = "gp_ver";

    /* renamed from: q, reason: collision with root package name */
    public static final String f16769q = "nw_ver";

    /* renamed from: r, reason: collision with root package name */
    public static final String f16770r = "ua";

    /* renamed from: s, reason: collision with root package name */
    public static final String f16771s = "orient";

    /* renamed from: t, reason: collision with root package name */
    public static final String f16772t = "system";

    /* renamed from: u, reason: collision with root package name */
    public static final String f16773u = "android_id";

    /* renamed from: v, reason: collision with root package name */
    public static final String f16774v = "gaid";

    /* renamed from: w, reason: collision with root package name */
    public static final String f16775w = "channel";

    /* renamed from: x, reason: collision with root package name */
    public static final String f16776x = "sub_channel";

    /* renamed from: y, reason: collision with root package name */
    public static final String f16777y = "upid";

    /* renamed from: z, reason: collision with root package name */
    public static final String f16778z = "ps_id";

    public static JSONObject a() {
        JSONObject b9 = b();
        JSONObject c4 = c();
        try {
            b9.put("app_id", com.anythink.core.common.d.t.b().p());
            Iterator<String> keys = c4.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b9.put(next, c4.opt(next));
            }
        } catch (JSONException unused) {
        }
        return b9;
    }

    private static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Context g9 = com.anythink.core.common.d.t.b().g();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", m.e());
            jSONObject.put("os_vc", m.d());
            jSONObject.put("package_name", m.m(g9));
            jSONObject.put("app_vn", m.i(g9));
            jSONObject.put("app_vc", m.h(g9));
            jSONObject.put("brand", m.b());
            jSONObject.put("model", m.a());
            jSONObject.put("screen", m.l(g9));
            jSONObject.put("network_type", String.valueOf(m.o(g9)));
            jSONObject.put("mnc", m.c(g9));
            jSONObject.put("mcc", m.b(g9));
            jSONObject.put("language", m.e(g9));
            jSONObject.put("timezone", m.c());
            jSONObject.put("sdk_ver", p.a());
            jSONObject.put("gp_ver", m.p(g9));
            jSONObject.put("ua", m.h());
            jSONObject.put("orient", m.f(g9));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(com.anythink.core.common.d.t.b().n())) {
                jSONObject.put("channel", com.anythink.core.common.d.t.b().n());
            }
            if (!TextUtils.isEmpty(com.anythink.core.common.d.t.b().o())) {
                jSONObject.put("sub_channel", com.anythink.core.common.d.t.b().o());
            }
            jSONObject.put("upid", com.anythink.core.common.d.t.b().B());
            jSONObject.put("ps_id", com.anythink.core.common.d.t.b().r());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject c() {
        String R8;
        Context g9 = com.anythink.core.common.d.t.b().g();
        JSONObject jSONObject = new JSONObject();
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(g9));
        if (k6 != null) {
            try {
                R8 = k6.R();
            } catch (Exception unused) {
            }
        } else {
            R8 = "";
        }
        boolean z8 = true;
        if (!TextUtils.isEmpty(R8)) {
            try {
                JSONObject jSONObject2 = new JSONObject(R8);
                if (!jSONObject2.isNull("a")) {
                    if (jSONObject2.optInt("a") != 1) {
                        z8 = false;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("android_id", z8 ? m.d(g9) : "");
        jSONObject.put("gaid", m.f());
        com.anythink.core.common.d.s c4 = com.anythink.core.common.d.t.b().c();
        if (c4 != null) {
            c4.fillRequestData(jSONObject, k6);
        }
        if (ATSDK.isCnSDK()) {
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String n9 = m.n(g9);
        jSONObject.put("it_src", TextUtils.isEmpty(n9) ? "" : n9);
        return jSONObject;
    }
}
