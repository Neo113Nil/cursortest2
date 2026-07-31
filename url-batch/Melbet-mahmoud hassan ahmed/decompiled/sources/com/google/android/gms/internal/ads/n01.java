package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n01 extends ey {

    /* renamed from: f, reason: collision with root package name */
    private final Context f8847f;

    /* renamed from: g, reason: collision with root package name */
    private final po0 f8848g;

    /* renamed from: h, reason: collision with root package name */
    private final rt1 f8849h;

    /* renamed from: i, reason: collision with root package name */
    private final c52<at2, z62> f8850i;

    /* renamed from: j, reason: collision with root package name */
    private final hb2 f8851j;

    /* renamed from: k, reason: collision with root package name */
    private final cy1 f8852k;

    /* renamed from: l, reason: collision with root package name */
    private final pm0 f8853l;

    /* renamed from: m, reason: collision with root package name */
    private final xt1 f8854m;

    /* renamed from: n, reason: collision with root package name */
    private final uy1 f8855n;

    /* renamed from: o, reason: collision with root package name */
    private final u30 f8856o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8857p = false;

    n01(Context context, po0 po0Var, rt1 rt1Var, c52<at2, z62> c52Var, hb2 hb2Var, cy1 cy1Var, pm0 pm0Var, xt1 xt1Var, uy1 uy1Var, u30 u30Var) {
        this.f8847f = context;
        this.f8848g = po0Var;
        this.f8849h = rt1Var;
        this.f8850i = c52Var;
        this.f8851j = hb2Var;
        this.f8852k = cy1Var;
        this.f8853l = pm0Var;
        this.f8854m = xt1Var;
        this.f8855n = uy1Var;
        this.f8856o = u30Var;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void D3(m90 m90Var) {
        this.f8852k.r(m90Var);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final synchronized void F0(boolean z6) {
        y2.t.s().c(z6);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void I5(x3.a aVar, String str) {
        if (aVar == null) {
            io0.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) x3.b.O0(aVar);
        if (context == null) {
            io0.d("Context is null. Failed to open debug menu.");
            return;
        }
        a3.x xVar = new a3.x(context);
        xVar.n(str);
        xVar.o(this.f8848g.f10301f);
        xVar.r();
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void O3(String str, x3.a aVar) {
        String str2;
        Runnable runnable;
        m10.c(this.f8847f);
        if (((Boolean) sw.c().b(m10.D2)).booleanValue()) {
            y2.t.q();
            str2 = a3.g2.d0(this.f8847f);
        } else {
            str2 = "";
        }
        boolean z6 = true;
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean booleanValue = ((Boolean) sw.c().b(m10.A2)).booleanValue();
        e10<Boolean> e10Var = m10.E0;
        boolean booleanValue2 = booleanValue | ((Boolean) sw.c().b(e10Var)).booleanValue();
        if (((Boolean) sw.c().b(e10Var)).booleanValue()) {
            final Runnable runnable2 = (Runnable) x3.b.O0(aVar);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.m01
                @Override // java.lang.Runnable
                public final void run() {
                    final n01 n01Var = n01.this;
                    final Runnable runnable3 = runnable2;
                    wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l01
                        @Override // java.lang.Runnable
                        public final void run() {
                            n01.this.s6(runnable3);
                        }
                    });
                }
            };
        } else {
            z6 = booleanValue2;
            runnable = null;
        }
        if (z6) {
            y2.t.b().a(this.f8847f, this.f8848g, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void Q(String str) {
        this.f8851j.f(str);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final synchronized void U4(float f7) {
        y2.t.s().d(f7);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void Y3(qy qyVar) {
        this.f8855n.g(qyVar, ty1.API);
    }

    final void a() {
        if (y2.t.p().h().I()) {
            if (y2.t.t().j(this.f8847f, y2.t.p().h().j(), this.f8848g.f10301f)) {
                return;
            }
            y2.t.p().h().R(false);
            y2.t.p().h().P("");
        }
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final synchronized float b() {
        return y2.t.s().a();
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final String d() {
        return this.f8848g.f10301f;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final List<f90> e() {
        return this.f8852k.f();
    }

    final /* synthetic */ void g() {
        this.f8856o.a(new ci0());
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void h() {
        this.f8852k.k();
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final synchronized void i() {
        if (this.f8857p) {
            io0.g("Mobile ads is initialized already.");
            return;
        }
        m10.c(this.f8847f);
        y2.t.p().q(this.f8847f, this.f8848g);
        y2.t.d().i(this.f8847f);
        this.f8857p = true;
        this.f8852k.q();
        this.f8851j.d();
        if (((Boolean) sw.c().b(m10.B2)).booleanValue()) {
            this.f8854m.c();
        }
        this.f8855n.f();
        if (((Boolean) sw.c().b(m10.P6)).booleanValue()) {
            wo0.f13894a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.j01
                @Override // java.lang.Runnable
                public final void run() {
                    n01.this.a();
                }
            });
        }
        if (((Boolean) sw.c().b(m10.r7)).booleanValue()) {
            wo0.f13894a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.k01
                @Override // java.lang.Runnable
                public final void run() {
                    n01.this.g();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void j1(n00 n00Var) {
        this.f8853l.v(this.f8847f, n00Var);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void l4(dd0 dd0Var) {
        this.f8849h.c(dd0Var);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final synchronized void l5(String str) {
        m10.c(this.f8847f);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) sw.c().b(m10.A2)).booleanValue()) {
                y2.t.b().a(this.f8847f, this.f8848g, str, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final synchronized boolean q() {
        return y2.t.s().e();
    }

    final void s6(Runnable runnable) {
        r3.o.e("Adapters must be initialized on the main thread.");
        Map<String, yc0> e7 = y2.t.p().h().e().e();
        if (e7.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                io0.h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f8849h.d()) {
            HashMap hashMap = new HashMap();
            Iterator<yc0> it = e7.values().iterator();
            while (it.hasNext()) {
                for (xc0 xc0Var : it.next().f14607a) {
                    String str = xc0Var.f14132k;
                    for (String str2 : xc0Var.f14124c) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    d52<at2, z62> a7 = this.f8850i.a(str3, jSONObject);
                    if (a7 != null) {
                        at2 at2Var = a7.f4072b;
                        if (!at2Var.a() && at2Var.C()) {
                            at2Var.m(this.f8847f, a7.f4073c, (List) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            io0.b(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (ps2 e8) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    io0.h(sb.toString(), e8);
                }
            }
        }
    }
}
