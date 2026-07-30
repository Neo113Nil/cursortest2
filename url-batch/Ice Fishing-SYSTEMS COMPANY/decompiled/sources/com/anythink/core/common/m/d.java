package com.anythink.core.common.m;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.aq;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    Context f14720a;

    /* renamed from: b, reason: collision with root package name */
    int f14721b;

    /* renamed from: e, reason: collision with root package name */
    List<String> f14724e;

    /* renamed from: f, reason: collision with root package name */
    int f14725f;

    /* renamed from: g, reason: collision with root package name */
    boolean f14726g = false;

    /* renamed from: c, reason: collision with root package name */
    String f14722c = com.anythink.core.common.d.t.b().p();

    /* renamed from: d, reason: collision with root package name */
    String f14723d = com.anythink.core.common.d.t.b().q();

    public d(Context context, int i, List<String> list) {
        this.f14720a = context;
        this.f14724e = list;
        this.f14721b = list.size();
        this.f14725f = i;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return a.b(g());
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e6 = super.e();
        if (e6 != null) {
            try {
                e6.put("app_id", this.f14722c);
                e6.put("nw_ver", com.anythink.core.common.v.m.g());
                Map<String, Object> m8 = com.anythink.core.common.d.t.b().m();
                if (m8 != null) {
                    try {
                        if (m8.size() > 0) {
                            JSONObject jSONObject = new JSONObject();
                            for (String str : m8.keySet()) {
                                Object obj = m8.get(str);
                                if (obj != null) {
                                    jSONObject.put(str, obj.toString());
                                }
                            }
                            e6.put("custom", jSONObject);
                        }
                    } catch (Throwable unused) {
                    }
                }
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f14724e;
                if (list != null && list.size() > 0) {
                    for (String str2 : this.f14724e) {
                        if (!TextUtils.isEmpty(str2)) {
                            jSONArray.put(new JSONObject(str2));
                        }
                    }
                }
                e6.put("data", jSONArray);
            } catch (Exception unused2) {
            }
        }
        return e6;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject f() {
        JSONObject f6 = super.f();
        if (f6 != null) {
            try {
                f6.put(e.f14784S, this.f14725f);
            } catch (Exception unused) {
            }
        }
        return f6;
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f14722c;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f14720a;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f14723d;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final int l() {
        return 4;
    }

    @Override // com.anythink.core.common.m.a
    public final boolean p() {
        return true;
    }

    public final void s() {
        this.f14726g = true;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        if (!TextUtils.isEmpty(b())) {
            super.a(i, qVar);
        } else if (qVar != null) {
            qVar.onLoadFinish(i, Integer.valueOf(this.f14721b));
        }
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.i();
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return Integer.valueOf(this.f14721b);
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
        if (this.f14726g) {
            JSONObject jSONObject = new JSONObject();
            Map<String, String> c4 = c();
            if (c4 != null) {
                try {
                    for (String str : c4.keySet()) {
                        jSONObject.put(str, c4.get(str));
                    }
                } catch (Exception unused) {
                }
            }
            String jSONObject2 = jSONObject.toString();
            String g9 = g();
            com.anythink.core.common.t.a().a(1, b(), jSONObject2, g9, aq.a(1001));
        }
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bR);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
