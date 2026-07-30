package com.anythink.core.common.m;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14816a = "custom";

    /* renamed from: b, reason: collision with root package name */
    private static final String f14817b = "f";

    /* renamed from: c, reason: collision with root package name */
    private String f14818c;

    /* renamed from: d, reason: collision with root package name */
    private String f14819d;

    /* renamed from: e, reason: collision with root package name */
    private String f14820e;

    /* renamed from: f, reason: collision with root package name */
    private Context f14821f;

    /* renamed from: g, reason: collision with root package name */
    private long f14822g;

    /* renamed from: h, reason: collision with root package name */
    private long f14823h;
    private Map<String, Object> i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, String> f14824j;

    /* renamed from: k, reason: collision with root package name */
    private String f14825k;

    public f(Context context, com.anythink.core.common.h.v vVar) {
        if (vVar == null) {
            return;
        }
        this.i = com.anythink.core.common.d.t.b().m();
        this.f14818c = vVar.a();
        this.f14819d = vVar.b();
        this.f14821f = context;
        this.f14824j = vVar.d();
        this.f14820e = vVar.c();
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        if (!TextUtils.isEmpty(this.f14825k)) {
            return this.f14825k;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.b();
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        try {
            return g().getBytes(com.anythink.expressad.foundation.g.a.bR);
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final boolean d_() {
        return true;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        Object obj;
        JSONObject e6 = super.e();
        try {
            e6.put("app_id", this.f14818c);
            e6.put("nw_ver", com.anythink.core.common.v.m.g());
            String C7 = com.anythink.core.common.d.t.b().C();
            if (!TextUtils.isEmpty(C7)) {
                e6.put("sy_id", C7);
            }
            String D8 = com.anythink.core.common.d.t.b().D();
            if (TextUtils.isEmpty(D8)) {
                com.anythink.core.common.d.t.b().k(com.anythink.core.common.d.t.b().B());
                e6.put("bk_id", com.anythink.core.common.d.t.b().B());
            } else {
                e6.put("bk_id", D8);
            }
            JSONObject a9 = e.a();
            if (a9 != null) {
                e6.put("custom", a9);
            }
            e6.put("deny", com.anythink.core.common.v.m.q(com.anythink.core.common.d.t.b().g()));
            if (com.anythink.core.common.d.t.b().z()) {
                e6.put("is_test", 1);
            }
            com.anythink.core.common.c.b.a();
            e6.put("pil_offset", com.anythink.core.common.c.b.b());
            Map<String, String> map = this.f14824j;
            if (map != null && map.size() != 0) {
                try {
                    e6.put("cached", new JSONObject(this.f14824j));
                } catch (Throwable unused) {
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                com.anythink.core.common.j.a.a().a(jSONObject);
                if (jSONObject.length() > 0) {
                    e6.put(e.bg, jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            e6.putOpt(e.bh, 1);
            if (!TextUtils.isEmpty(this.f14820e)) {
                e6.put(e.bm, this.f14820e);
            }
            e6.put(e.bp, com.anythink.core.common.d.t.b().E());
            Pair<Integer, List<String>> I2 = com.anythink.core.common.d.t.b().I();
            if (I2 != null && (obj = I2.first) != null) {
                e6.put(e.bq, ((Integer) obj).intValue());
            }
        } catch (JSONException unused3) {
        }
        return e6;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject f() {
        return super.f();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f14818c;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f14821f;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f14819d;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public int l() {
        return 187;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.f14676b, this.f14818c);
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f12548a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        this.f14822g = System.currentTimeMillis();
        this.f14823h = SystemClock.elapsedRealtime();
        super.a(i, qVar);
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        com.anythink.core.common.u.e.a("app", adError.getPlatformCode(), adError.getPlatformMSG(), b(), "", "", "", (ATAdRequest) null);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (this.i != null) {
                    jSONObject.put("custom", new JSONObject(this.i));
                }
            }
        } catch (Exception unused) {
        }
        com.anythink.core.common.u.e.a("app", (String) null, this.f14822g, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f14823h, (ATAdRequest) null);
        return obj;
    }

    public final f a(String str) {
        this.f14825k = str;
        return this;
    }
}
