package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.aq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class v extends a {

    /* renamed from: A, reason: collision with root package name */
    public static final int f14893A = 21;

    /* renamed from: B, reason: collision with root package name */
    public static final int f14894B = 22;

    /* renamed from: C, reason: collision with root package name */
    public static final int f14895C = 23;

    /* renamed from: D, reason: collision with root package name */
    public static final int f14896D = 24;

    /* renamed from: E, reason: collision with root package name */
    public static final int f14897E = 25;

    /* renamed from: F, reason: collision with root package name */
    public static final int f14898F = 26;

    /* renamed from: G, reason: collision with root package name */
    public static final int f14899G = 27;

    /* renamed from: H, reason: collision with root package name */
    public static final int f14900H = 28;
    private static final String J = "v";

    /* renamed from: a, reason: collision with root package name */
    public static final int f14901a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14902b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14903c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14904d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14905e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14906f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14907g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14908h = 8;
    public static final int i = 9;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14909j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14910k = 11;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14911l = 12;

    /* renamed from: u, reason: collision with root package name */
    public static final int f14912u = 13;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14913v = 15;

    /* renamed from: w, reason: collision with root package name */
    public static final int f14914w = 16;

    /* renamed from: x, reason: collision with root package name */
    public static final int f14915x = 18;

    /* renamed from: y, reason: collision with root package name */
    public static final int f14916y = 19;

    /* renamed from: z, reason: collision with root package name */
    public static final int f14917z = 20;

    /* renamed from: K, reason: collision with root package name */
    private Context f14919K;

    /* renamed from: N, reason: collision with root package name */
    private List<com.anythink.core.common.h.o> f14922N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.core.common.h.o f14923O;

    /* renamed from: P, reason: collision with root package name */
    private int f14924P;

    /* renamed from: I, reason: collision with root package name */
    boolean f14918I = false;

    /* renamed from: L, reason: collision with root package name */
    private String f14920L = com.anythink.core.common.d.t.b().p();

    /* renamed from: M, reason: collision with root package name */
    private String f14921M = com.anythink.core.common.d.t.b().q();

    public v(Context context, int i4, List<com.anythink.core.common.h.o> list) {
        this.f14919K = context;
        this.f14924P = i4;
        this.f14922N = list;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        com.anythink.core.common.h.o oVar = this.f14923O;
        if (oVar != null) {
            return oVar.f14190b.aP;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.h();
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
        JSONObject f6 = super.f();
        try {
            e6.put("app_id", this.f14920L);
            e6.put(e.f14784S, this.f14924P);
            Iterator<String> keys = f6.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e6.put(next, f6.opt(next));
            }
            Map<String, Object> m8 = com.anythink.core.common.d.t.b().m();
            if (m8 != null && m8.size() > 0) {
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
        return e6;
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        JSONObject jSONObject = new JSONObject();
        String a9 = com.anythink.core.common.v.k.a(e().toString());
        JSONArray jSONArray = new JSONArray();
        List<com.anythink.core.common.h.o> list = this.f14922N;
        if (list != null) {
            Iterator<com.anythink.core.common.h.o> it = list.iterator();
            while (it.hasNext()) {
                JSONObject a10 = it.next().a();
                a(a10);
                jSONArray.put(a10);
            }
        } else {
            com.anythink.core.common.h.o oVar = this.f14923O;
            if (oVar != null) {
                JSONObject a11 = oVar.a();
                a(a11);
                jSONArray.put(a11);
            }
        }
        String a12 = com.anythink.core.common.v.k.a(jSONArray.toString());
        StringBuilder sb = new StringBuilder();
        AbstractC5051n.j(sb, this.f14921M, "api_ver=1.0&common=", a9, "&data=");
        sb.append(a12);
        String c4 = com.anythink.core.common.v.o.c(sb.toString());
        try {
            jSONObject.put(e.Y, a9);
            jSONObject.put("data", a12);
            jSONObject.put(e.f14781P, j.e.f12593a);
            jSONObject.put("sign", c4);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f14920L;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f14919K;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f14921M;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final int l() {
        return 6;
    }

    @Override // com.anythink.core.common.m.a
    public final boolean p() {
        return true;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    private void a(JSONObject jSONObject) {
        if (!this.f14918I || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(e.f14785T, 1);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        List<com.anythink.core.common.h.o> list = this.f14922N;
        com.anythink.core.common.u.e.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), b(), (String) null, String.valueOf(list != null ? list.size() : 1), "0", (ATAdRequest) null);
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
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
        this.f14918I = true;
        String g9 = g();
        this.f14918I = false;
        com.anythink.core.common.t.a().a(1, b(), jSONObject2, g9, aq.a(1000));
    }
}
