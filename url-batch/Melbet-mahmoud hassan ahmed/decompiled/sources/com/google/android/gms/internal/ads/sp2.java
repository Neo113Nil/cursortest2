package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sp2 implements cd2<ij1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11903a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f11904b;

    /* renamed from: c, reason: collision with root package name */
    private final bw0 f11905c;

    /* renamed from: d, reason: collision with root package name */
    private final lc2 f11906d;

    /* renamed from: e, reason: collision with root package name */
    private final tq2 f11907e;

    /* renamed from: f, reason: collision with root package name */
    private i20 f11908f;

    /* renamed from: g, reason: collision with root package name */
    private final qx2 f11909g;

    /* renamed from: h, reason: collision with root package name */
    private final is2 f11910h;

    /* renamed from: i, reason: collision with root package name */
    private cc3<ij1> f11911i;

    public sp2(Context context, Executor executor, bw0 bw0Var, lc2 lc2Var, tq2 tq2Var, is2 is2Var) {
        this.f11903a = context;
        this.f11904b = executor;
        this.f11905c = bw0Var;
        this.f11906d = lc2Var;
        this.f11910h = is2Var;
        this.f11907e = tq2Var;
        this.f11909g = bw0Var.b();
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final boolean a(kv kvVar, String str, ad2 ad2Var, bd2<? super ij1> bd2Var) {
        gk1 d7;
        ox2 p7 = ox2.p(this.f11903a, 7, 4, kvVar);
        if (str == null) {
            io0.d("Ad unit ID should not be null for interstitial ad.");
            this.f11904b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mp2
                @Override // java.lang.Runnable
                public final void run() {
                    sp2.this.g();
                }
            });
            if (p7 != null) {
                qx2 qx2Var = this.f11909g;
                p7.g(false);
                qx2Var.a(p7.i());
            }
            return false;
        }
        if (zza()) {
            if (p7 != null) {
                qx2 qx2Var2 = this.f11909g;
                p7.g(false);
                qx2Var2.a(p7.i());
            }
            return false;
        }
        if (((Boolean) sw.c().b(m10.A6)).booleanValue() && kvVar.f7648k) {
            this.f11905c.s().l(true);
        }
        pv pvVar = ((lp2) ad2Var).f8042a;
        is2 is2Var = this.f11910h;
        is2Var.H(str);
        is2Var.G(pvVar);
        is2Var.d(kvVar);
        ks2 f7 = is2Var.f();
        if (((Boolean) sw.c().b(m10.X5)).booleanValue()) {
            fk1 n7 = this.f11905c.n();
            fa1 fa1Var = new fa1();
            fa1Var.c(this.f11903a);
            fa1Var.f(f7);
            n7.t(fa1Var.g());
            mg1 mg1Var = new mg1();
            mg1Var.m(this.f11906d, this.f11904b);
            mg1Var.n(this.f11906d, this.f11904b);
            n7.j(mg1Var.q());
            n7.k(new ua2(this.f11908f));
            d7 = n7.d();
        } else {
            mg1 mg1Var2 = new mg1();
            tq2 tq2Var = this.f11907e;
            if (tq2Var != null) {
                mg1Var2.h(tq2Var, this.f11904b);
                mg1Var2.i(this.f11907e, this.f11904b);
                mg1Var2.e(this.f11907e, this.f11904b);
            }
            fk1 n8 = this.f11905c.n();
            fa1 fa1Var2 = new fa1();
            fa1Var2.c(this.f11903a);
            fa1Var2.f(f7);
            n8.t(fa1Var2.g());
            mg1Var2.m(this.f11906d, this.f11904b);
            mg1Var2.h(this.f11906d, this.f11904b);
            mg1Var2.i(this.f11906d, this.f11904b);
            mg1Var2.e(this.f11906d, this.f11904b);
            mg1Var2.d(this.f11906d, this.f11904b);
            mg1Var2.o(this.f11906d, this.f11904b);
            mg1Var2.n(this.f11906d, this.f11904b);
            mg1Var2.l(this.f11906d, this.f11904b);
            mg1Var2.f(this.f11906d, this.f11904b);
            n8.j(mg1Var2.q());
            n8.k(new ua2(this.f11908f));
            d7 = n8.d();
        }
        z71<ij1> a7 = d7.a();
        cc3<ij1> h7 = a7.h(a7.i());
        this.f11911i = h7;
        rb3.r(h7, new rp2(this, bd2Var, p7, d7), this.f11904b);
        return true;
    }

    final /* synthetic */ void g() {
        this.f11906d.d(dt2.d(6, null, null));
    }

    public final void h(i20 i20Var) {
        this.f11908f = i20Var;
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final boolean zza() {
        cc3<ij1> cc3Var = this.f11911i;
        return (cc3Var == null || cc3Var.isDone()) ? false : true;
    }
}
