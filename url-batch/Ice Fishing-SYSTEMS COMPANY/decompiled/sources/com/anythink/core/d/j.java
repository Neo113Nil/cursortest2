package com.anythink.core.d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: m, reason: collision with root package name */
    private static String f17469m = "ofm_logger";

    /* renamed from: n, reason: collision with root package name */
    private static String f17470n = "ofm_tk_sw";

    /* renamed from: o, reason: collision with root package name */
    private static String f17471o = "ofm_da_sw";

    /* renamed from: p, reason: collision with root package name */
    private static String f17472p = "tk_address";

    /* renamed from: q, reason: collision with root package name */
    private static String f17473q = "tk_max_amount";

    /* renamed from: r, reason: collision with root package name */
    private static String f17474r = "tk_interval";

    /* renamed from: s, reason: collision with root package name */
    private static String f17475s = "da_rt_keys_ft";

    /* renamed from: t, reason: collision with root package name */
    private static String f17476t = "tk_no_t_ft";

    /* renamed from: u, reason: collision with root package name */
    private static String f17477u = "da_not_keys_ft";

    /* renamed from: v, reason: collision with root package name */
    private static String f17478v = "ofm_system";

    /* renamed from: w, reason: collision with root package name */
    private static String f17479w = "ofm_tid";

    /* renamed from: x, reason: collision with root package name */
    private static String f17480x = "ofm_firm_info";

    /* renamed from: y, reason: collision with root package name */
    private static String f17481y = "ofm_st_vt";

    /* renamed from: a, reason: collision with root package name */
    String f17482a = String.valueOf(hashCode());

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Object> f17483b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17484c;

    /* renamed from: d, reason: collision with root package name */
    private int f17485d;

    /* renamed from: e, reason: collision with root package name */
    private int f17486e;

    /* renamed from: f, reason: collision with root package name */
    private long f17487f;

    /* renamed from: g, reason: collision with root package name */
    private int f17488g;

    /* renamed from: h, reason: collision with root package name */
    private int f17489h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private int f17490j;

    /* renamed from: k, reason: collision with root package name */
    private long f17491k;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, String> f17492l;

    private Map<String, Object> b(String str) {
        try {
            Map<String, Object> map = this.f17483b;
            if (map != null) {
                return com.anythink.core.common.v.q.c(map.get(str).toString());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int c() {
        return this.f17486e;
    }

    private int d() {
        return this.f17488g;
    }

    private int e() {
        return this.f17489h;
    }

    private String f() {
        return this.i;
    }

    private int g() {
        return this.f17490j;
    }

    private long h() {
        return this.f17491k;
    }

    private Map<String, String> i() {
        return this.f17492l;
    }

    private String j() {
        return this.f17482a;
    }

    private boolean k() {
        return this.f17484c;
    }

    public final long a() {
        return this.f17487f;
    }

    public static j a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            j jVar = new j();
            JSONObject jSONObject = new JSONObject(str);
            jVar.f17485d = jSONObject.optInt(f17478v);
            jVar.f17486e = jSONObject.optInt(f17479w);
            jVar.f17487f = jSONObject.optLong(f17481y);
            jVar.f17483b = com.anythink.core.common.v.q.c(jSONObject.optString(f17480x));
            JSONObject optJSONObject = jSONObject.optJSONObject(f17469m);
            if (optJSONObject != null) {
                jVar.f17488g = optJSONObject.optInt(f17470n);
                jVar.f17489h = optJSONObject.optInt(f17471o);
                jVar.i = optJSONObject.optString(f17472p);
                jVar.f17490j = optJSONObject.optInt(f17473q);
                jVar.f17491k = optJSONObject.optLong(f17474r);
                try {
                    JSONObject jSONObject2 = new JSONObject(optJSONObject.optString(f17476t));
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    jVar.f17492l = hashMap;
                } catch (Throwable unused) {
                }
            }
            return jVar;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static j c(String str) {
        try {
            j jVar = new j();
            JSONObject jSONObject = new JSONObject(str);
            jVar.f17484c = true;
            jVar.f17485d = jSONObject.optInt(f17478v);
            jVar.f17483b = com.anythink.core.common.v.q.c(jSONObject.optString(f17480x));
            jVar.f17488g = 1;
            jVar.f17489h = 1;
            return jVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int b() {
        return this.f17485d;
    }
}
