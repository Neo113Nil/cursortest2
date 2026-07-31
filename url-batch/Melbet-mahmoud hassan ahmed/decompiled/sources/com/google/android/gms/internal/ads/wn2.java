package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wn2 implements cd2<t41> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13876a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f13877b;

    /* renamed from: c, reason: collision with root package name */
    private final bw0 f13878c;

    /* renamed from: d, reason: collision with root package name */
    private final lc2 f13879d;

    /* renamed from: e, reason: collision with root package name */
    private final qc2 f13880e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f13881f;

    /* renamed from: g, reason: collision with root package name */
    private i20 f13882g;

    /* renamed from: h, reason: collision with root package name */
    private final nd1 f13883h;

    /* renamed from: i, reason: collision with root package name */
    private final qx2 f13884i;

    /* renamed from: j, reason: collision with root package name */
    private final is2 f13885j;

    /* renamed from: k, reason: collision with root package name */
    private cc3<t41> f13886k;

    public wn2(Context context, Executor executor, pv pvVar, bw0 bw0Var, lc2 lc2Var, qc2 qc2Var, is2 is2Var) {
        this.f13876a = context;
        this.f13877b = executor;
        this.f13878c = bw0Var;
        this.f13879d = lc2Var;
        this.f13880e = qc2Var;
        this.f13885j = is2Var;
        this.f13883h = bw0Var.m();
        this.f13884i = bw0Var.b();
        this.f13881f = new FrameLayout(context);
        is2Var.G(pvVar);
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final boolean a(kv kvVar, String str, ad2 ad2Var, bd2<? super t41> bd2Var) {
        q51 l7;
        q41 q41Var;
        ox2 p7 = ox2.p(this.f13876a, 7, 3, kvVar);
        if (str == null) {
            io0.d("Ad unit ID should not be null for banner ad.");
            this.f13877b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sn2
                @Override // java.lang.Runnable
                public final void run() {
                    wn2.this.k();
                }
            });
            if (p7 != null) {
                qx2 qx2Var = this.f13884i;
                p7.g(false);
                qx2Var.a(p7.i());
            }
            return false;
        }
        if (zza()) {
            if (p7 != null) {
                qx2 qx2Var2 = this.f13884i;
                p7.g(false);
                qx2Var2.a(p7.i());
            }
            return false;
        }
        if (((Boolean) sw.c().b(m10.A6)).booleanValue() && kvVar.f7648k) {
            this.f13878c.s().l(true);
        }
        is2 is2Var = this.f13885j;
        is2Var.H(str);
        is2Var.d(kvVar);
        ks2 f7 = is2Var.f();
        if (g30.f5439c.e().booleanValue() && this.f13885j.v().f10386p) {
            lc2 lc2Var = this.f13879d;
            if (lc2Var != null) {
                lc2Var.d(dt2.d(7, null, null));
            }
            if (p7 != null) {
                qx2 qx2Var3 = this.f13884i;
                p7.g(false);
                qx2Var3.a(p7.i());
            }
            return false;
        }
        if (((Boolean) sw.c().b(m10.V5)).booleanValue()) {
            l7 = this.f13878c.l();
            fa1 fa1Var = new fa1();
            fa1Var.c(this.f13876a);
            fa1Var.f(f7);
            l7.p(fa1Var.g());
            mg1 mg1Var = new mg1();
            mg1Var.m(this.f13879d, this.f13877b);
            mg1Var.n(this.f13879d, this.f13877b);
            l7.s(mg1Var.q());
            l7.q(new ua2(this.f13882g));
            l7.g(new yk1(cn1.f3879h, null));
            l7.m(new p61(this.f13883h));
            q41Var = new q41(this.f13881f);
        } else {
            l7 = this.f13878c.l();
            fa1 fa1Var2 = new fa1();
            fa1Var2.c(this.f13876a);
            fa1Var2.f(f7);
            l7.p(fa1Var2.g());
            mg1 mg1Var2 = new mg1();
            mg1Var2.m(this.f13879d, this.f13877b);
            mg1Var2.d(this.f13879d, this.f13877b);
            mg1Var2.d(this.f13880e, this.f13877b);
            mg1Var2.o(this.f13879d, this.f13877b);
            mg1Var2.g(this.f13879d, this.f13877b);
            mg1Var2.h(this.f13879d, this.f13877b);
            mg1Var2.i(this.f13879d, this.f13877b);
            mg1Var2.e(this.f13879d, this.f13877b);
            mg1Var2.n(this.f13879d, this.f13877b);
            mg1Var2.l(this.f13879d, this.f13877b);
            l7.s(mg1Var2.q());
            l7.q(new ua2(this.f13882g));
            l7.g(new yk1(cn1.f3879h, null));
            l7.m(new p61(this.f13883h));
            q41Var = new q41(this.f13881f);
        }
        l7.h(q41Var);
        r51 i7 = l7.i();
        z71<t41> d7 = i7.d();
        cc3<t41> h7 = d7.h(d7.i());
        this.f13886k = h7;
        rb3.r(h7, new vn2(this, bd2Var, p7, i7), this.f13877b);
        return true;
    }

    public final ViewGroup c() {
        return this.f13881f;
    }

    public final is2 g() {
        return this.f13885j;
    }

    final /* synthetic */ void k() {
        this.f13879d.d(dt2.d(6, null, null));
    }

    public final void l() {
        this.f13883h.S0(60);
    }

    public final void m(ww wwVar) {
        this.f13880e.a(wwVar);
    }

    public final void n(od1 od1Var) {
        this.f13883h.D0(od1Var, this.f13877b);
    }

    public final void o(i20 i20Var) {
        this.f13882g = i20Var;
    }

    public final boolean p() {
        Object parent = this.f13881f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        y2.t.q();
        return a3.g2.B(view, view.getContext());
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final boolean zza() {
        cc3<t41> cc3Var = this.f13886k;
        return (cc3Var == null || cc3Var.isDone()) ? false : true;
    }
}
