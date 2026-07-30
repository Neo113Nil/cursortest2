package com.anythink.core.common.q;

import android.content.Context;
import com.anythink.basead.exoplayer.f;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.n;
import com.anythink.core.common.i;
import com.anythink.core.common.m.b.g;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.o;
import com.anythink.core.d.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class d extends com.anythink.core.common.m.a {

    /* renamed from: b, reason: collision with root package name */
    private Context f16169b;

    /* renamed from: c, reason: collision with root package name */
    private int f16170c;

    /* renamed from: f, reason: collision with root package name */
    private String f16173f;

    /* renamed from: g, reason: collision with root package name */
    private n f16174g;

    /* renamed from: h, reason: collision with root package name */
    private l f16175h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f16176j;

    /* renamed from: a, reason: collision with root package name */
    boolean f16168a = false;

    /* renamed from: d, reason: collision with root package name */
    private String f16171d = t.b().p();

    /* renamed from: e, reason: collision with root package name */
    private String f16172e = t.b().q();

    public d(Context context, int i, String str, n nVar, l lVar, String str2, String str3) {
        this.f16169b = context;
        this.f16170c = i;
        this.f16174g = nVar;
        this.f16175h = lVar;
        this.i = str2;
        this.f16176j = str3;
        this.f16173f = str;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        i.a();
        return i.g();
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
        return com.anythink.core.common.m.a.b(g());
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e6 = super.e();
        JSONObject f6 = super.f();
        try {
            e6.put("app_id", this.f16171d);
            Iterator<String> keys = f6.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e6.put(next, f6.opt(next));
            }
            Map<String, Object> m8 = t.b().m();
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
        String a9 = k.a(e().toString());
        StringBuilder sb = new StringBuilder();
        AbstractC5051n.j(sb, this.f16172e, "api_ver=2.0&common=", a9, "&data=");
        sb.append(this.f16173f);
        sb.append("&ss_a=");
        sb.append(this.f16170c);
        String c4 = o.c(sb.toString());
        try {
            jSONObject.put(com.anythink.core.common.m.e.Y, a9);
            jSONObject.put("ss_a", this.f16170c);
            jSONObject.put("data", this.f16173f);
            jSONObject.put(com.anythink.core.common.m.e.f14781P, j.e.f12594b);
            jSONObject.put("sign", c4);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f16171d;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f16169b;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f16172e;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(g.f14685l);
    }

    @Override // com.anythink.core.common.m.a
    public final String o() {
        return j.e.f12594b;
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f12548a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        try {
            if (ErrorCode.httpStatuException.equals(adError.getCode())) {
                com.anythink.core.common.u.e.a("1004658", this.i, this.f16176j, this.f16174g, this.f16175h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else if (this.f16168a) {
                com.anythink.core.common.u.e.a("1004658", this.i, this.f16176j, this.f16174g, this.f16175h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else {
                this.f16168a = true;
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.q.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        dVar.a(0, ((com.anythink.core.common.m.a) dVar).f14568r);
                    }
                }, f.f7344a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }
}
