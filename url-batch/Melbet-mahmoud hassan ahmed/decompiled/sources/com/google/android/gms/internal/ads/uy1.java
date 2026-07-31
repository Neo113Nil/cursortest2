package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uy1 implements dz1, fy1 {

    /* renamed from: a, reason: collision with root package name */
    private final cz1 f13024a;

    /* renamed from: b, reason: collision with root package name */
    private final ez1 f13025b;

    /* renamed from: c, reason: collision with root package name */
    private final gy1 f13026c;

    /* renamed from: d, reason: collision with root package name */
    private final py1 f13027d;

    /* renamed from: e, reason: collision with root package name */
    private final ey1 f13028e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13029f;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13035l;

    /* renamed from: m, reason: collision with root package name */
    private int f13036m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13037n;

    /* renamed from: h, reason: collision with root package name */
    private String f13031h = "{}";

    /* renamed from: i, reason: collision with root package name */
    private String f13032i = "";

    /* renamed from: j, reason: collision with root package name */
    private long f13033j = Long.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    private qy1 f13034k = qy1.NONE;

    /* renamed from: o, reason: collision with root package name */
    private ty1 f13038o = ty1.UNKNOWN;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, List<iy1>> f13030g = new HashMap();

    uy1(cz1 cz1Var, ez1 ez1Var, gy1 gy1Var, Context context, po0 po0Var, py1 py1Var) {
        this.f13024a = cz1Var;
        this.f13025b = ez1Var;
        this.f13026c = gy1Var;
        this.f13028e = new ey1(context);
        this.f13029f = po0Var.f10301f;
        this.f13027d = py1Var;
        y2.t.t().g(this);
    }

    private final synchronized JSONObject o() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, List<iy1>> entry : this.f13030g.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (iy1 iy1Var : entry.getValue()) {
                if (iy1Var.b()) {
                    jSONArray.put(iy1Var.a());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void p() {
        this.f13037n = true;
        this.f13027d.c();
        this.f13024a.d(this);
        this.f13025b.c(this);
        this.f13026c.c(this);
        v(y2.t.p().h().o());
    }

    private final void q() {
        y2.t.p().h().X(c());
    }

    private final synchronized void r(qy1 qy1Var, boolean z6) {
        if (this.f13034k == qy1Var) {
            return;
        }
        if (m()) {
            t();
        }
        this.f13034k = qy1Var;
        if (m()) {
            u();
        }
        if (z6) {
            q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x000b, B:12:0x001d, B:14:0x0027, B:16:0x0036, B:22:0x002b, B:24:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void s(boolean z6, boolean z7) {
        if (this.f13035l == z6) {
            return;
        }
        this.f13035l = z6;
        if (z6) {
            if (!((Boolean) sw.c().b(m10.P6)).booleanValue() || !y2.t.t().l()) {
                u();
                if (z7) {
                    return;
                }
                q();
                return;
            }
        }
        if (!m()) {
            t();
        }
        if (z7) {
        }
    }

    private final synchronized void t() {
        qy1 qy1Var = qy1.NONE;
        int ordinal = this.f13034k.ordinal();
        if (ordinal == 1) {
            this.f13025b.a();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f13026c.a();
        }
    }

    private final synchronized void u() {
        qy1 qy1Var = qy1.NONE;
        int ordinal = this.f13034k.ordinal();
        if (ordinal == 1) {
            this.f13025b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f13026c.b();
        }
    }

    private final synchronized void v(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            s(jSONObject.optBoolean("isTestMode", false), false);
            r(qy1.b(jSONObject.optString("gesture", "NONE")), false);
            this.f13031h = jSONObject.optString("networkExtras", "{}");
            this.f13033j = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final qy1 a() {
        return this.f13034k;
    }

    public final synchronized String b() {
        if (((Boolean) sw.c().b(m10.A6)).booleanValue() && m()) {
            if (this.f13033j < y2.t.a().b() / 1000) {
                this.f13031h = "{}";
                this.f13033j = Long.MAX_VALUE;
                return "";
            }
            if (this.f13031h.equals("{}")) {
                return "";
            }
            return this.f13031h;
        }
        return "";
    }

    public final synchronized String c() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f13035l);
            jSONObject.put("gesture", this.f13034k);
            if (this.f13033j > y2.t.a().b() / 1000) {
                jSONObject.put("networkExtras", this.f13031h);
                jSONObject.put("networkExtrasExpirationSecs", this.f13033j);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.f13029f);
            jSONObject.put("adapters", this.f13027d.a());
            if (this.f13033j < y2.t.a().b() / 1000) {
                this.f13031h = "{}";
            }
            jSONObject.put("networkExtras", this.f13031h);
            jSONObject.put("adSlots", o());
            jSONObject.put("appInfo", this.f13028e.a());
            String c7 = y2.t.p().h().e().c();
            if (!TextUtils.isEmpty(c7)) {
                jSONObject.put("cld", new JSONObject(c7));
            }
            if (((Boolean) sw.c().b(m10.Q6)).booleanValue() && !TextUtils.isEmpty(this.f13032i)) {
                String valueOf = String.valueOf(this.f13032i);
                io0.b(valueOf.length() != 0 ? "Policy violation data: ".concat(valueOf) : new String("Policy violation data: "));
                jSONObject.put("policyViolations", new JSONObject(this.f13032i));
            }
            if (((Boolean) sw.c().b(m10.P6)).booleanValue()) {
                jSONObject.put("openAction", this.f13038o);
                jSONObject.put("gesture", this.f13034k);
            }
        } catch (JSONException e7) {
            y2.t.p().r(e7, "Inspector.toJson");
            io0.h("Ad inspector encountered an error", e7);
        }
        return jSONObject;
    }

    public final synchronized void e(String str, iy1 iy1Var) {
        if (((Boolean) sw.c().b(m10.A6)).booleanValue() && m()) {
            if (this.f13036m >= ((Integer) sw.c().b(m10.C6)).intValue()) {
                io0.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f13030g.containsKey(str)) {
                this.f13030g.put(str, new ArrayList());
            }
            this.f13036m++;
            this.f13030g.get(str).add(iy1Var);
        }
    }

    public final void f() {
        if (((Boolean) sw.c().b(m10.A6)).booleanValue()) {
            if (((Boolean) sw.c().b(m10.P6)).booleanValue() && y2.t.p().h().I()) {
                p();
                return;
            }
            String o7 = y2.t.p().h().o();
            if (TextUtils.isEmpty(o7)) {
                return;
            }
            try {
                if (new JSONObject(o7).optBoolean("isTestMode", false)) {
                    p();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void g(qy qyVar, ty1 ty1Var) {
        if (!m()) {
            try {
                qyVar.V2(dt2.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                io0.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) sw.c().b(m10.A6)).booleanValue()) {
            this.f13038o = ty1Var;
            this.f13024a.f(qyVar, new u70(this));
            return;
        } else {
            try {
                qyVar.V2(dt2.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                io0.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void h(String str, long j7) {
        this.f13031h = str;
        this.f13033j = j7;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z6) {
        if (!this.f13037n) {
            if (z6) {
                p();
                if (!this.f13035l) {
                    u();
                    return;
                }
            }
            if (m()) {
                return;
            }
            t();
        }
    }

    public final void j(qy1 qy1Var) {
        r(qy1Var, true);
    }

    public final synchronized void k(String str) {
        this.f13032i = str;
    }

    public final void l(boolean z6) {
        if (!this.f13037n && z6) {
            p();
        }
        s(z6, true);
    }

    public final synchronized boolean m() {
        if (((Boolean) sw.c().b(m10.P6)).booleanValue()) {
            return this.f13035l || y2.t.t().l();
        }
        return this.f13035l;
    }

    public final synchronized boolean n() {
        return this.f13035l;
    }
}
