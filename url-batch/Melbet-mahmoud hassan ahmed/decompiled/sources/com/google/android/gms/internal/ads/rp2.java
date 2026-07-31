package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class rp2 implements nb3<ij1> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd2 f11316a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ox2 f11317b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gk1 f11318c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ sp2 f11319d;

    rp2(sp2 sp2Var, bd2 bd2Var, ox2 ox2Var, gk1 gk1Var) {
        this.f11319d = sp2Var;
        this.f11316a = bd2Var;
        this.f11317b = ox2Var;
        this.f11318c = gk1Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(ij1 ij1Var) {
        qx2 qx2Var;
        Executor executor;
        Executor executor2;
        lc2 lc2Var;
        tq2 tq2Var;
        ij1 ij1Var2 = ij1Var;
        synchronized (this.f11319d) {
            this.f11319d.f11911i = null;
            e10<Boolean> e10Var = m10.X5;
            if (((Boolean) sw.c().b(e10Var)).booleanValue()) {
                hf1 e7 = ij1Var2.e();
                lc2Var = this.f11319d.f11906d;
                e7.a(lc2Var);
                tq2Var = this.f11319d.f11907e;
                e7.d(tq2Var);
            }
            this.f11316a.a(ij1Var2);
            if (((Boolean) sw.c().b(e10Var)).booleanValue()) {
                executor = this.f11319d.f11904b;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.np2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc2 lc2Var2;
                        lc2Var2 = rp2.this.f11319d.f11906d;
                        lc2Var2.m();
                    }
                });
                executor2 = this.f11319d.f11904b;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.op2
                    @Override // java.lang.Runnable
                    public final void run() {
                        tq2 tq2Var2;
                        tq2Var2 = rp2.this.f11319d.f11907e;
                        tq2Var2.m();
                    }
                });
            }
            if (this.f11317b != null) {
                qx2Var = this.f11319d.f11909g;
                ox2 ox2Var = this.f11317b;
                ox2Var.d(ij1Var2.g().f4313b);
                ox2Var.e(ij1Var2.c().b());
                ox2Var.g(true);
                qx2Var.a(ox2Var.i());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        qx2 qx2Var;
        Executor executor;
        Executor executor2;
        final cv a7 = this.f11318c.a().a(th);
        synchronized (this.f11319d) {
            this.f11319d.f11911i = null;
            this.f11318c.b().d(a7);
            if (((Boolean) sw.c().b(m10.X5)).booleanValue()) {
                executor = this.f11319d.f11904b;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pp2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc2 lc2Var;
                        rp2 rp2Var = rp2.this;
                        cv cvVar = a7;
                        lc2Var = rp2Var.f11319d.f11906d;
                        lc2Var.d(cvVar);
                    }
                });
                executor2 = this.f11319d.f11904b;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qp2
                    @Override // java.lang.Runnable
                    public final void run() {
                        tq2 tq2Var;
                        rp2 rp2Var = rp2.this;
                        cv cvVar = a7;
                        tq2Var = rp2Var.f11319d.f11907e;
                        tq2Var.d(cvVar);
                    }
                });
            }
            zs2.b(a7.f3954f, th, "InterstitialAdLoader.onFailure");
            if (this.f11317b != null) {
                qx2Var = this.f11319d.f11909g;
                ox2 ox2Var = this.f11317b;
                ox2Var.c(a7);
                ox2Var.g(false);
                qx2Var.a(ox2Var.i());
            }
            this.f11316a.zza();
        }
    }
}
