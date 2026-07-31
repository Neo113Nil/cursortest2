package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class ar2 implements nb3<hs1> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd2 f2929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ox2 f2930b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cr2 f2931c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ er2 f2932d;

    ar2(er2 er2Var, bd2 bd2Var, ox2 ox2Var, cr2 cr2Var) {
        this.f2932d = er2Var;
        this.f2929a = bd2Var;
        this.f2930b = ox2Var;
        this.f2931c = cr2Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(hs1 hs1Var) {
        tq2 tq2Var;
        Executor executor;
        final tq2 tq2Var2;
        tq2 tq2Var3;
        qx2 qx2Var;
        hs1 hs1Var2 = hs1Var;
        synchronized (this.f2932d) {
            hf1 e7 = hs1Var2.e();
            tq2Var = this.f2932d.f4725d;
            e7.d(tq2Var);
            this.f2929a.a(hs1Var2);
            executor = this.f2932d.f4723b;
            tq2Var2 = this.f2932d.f4725d;
            tq2Var2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yq2
                @Override // java.lang.Runnable
                public final void run() {
                    tq2.this.m();
                }
            });
            tq2Var3 = this.f2932d.f4725d;
            tq2Var3.y();
            if (this.f2930b != null) {
                qx2Var = this.f2932d.f4728g;
                ox2 ox2Var = this.f2930b;
                ox2Var.d(hs1Var2.g().f4313b);
                ox2Var.e(hs1Var2.c().b());
                ox2Var.g(true);
                qx2Var.a(ox2Var.i());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        ep2 ep2Var;
        tq2 tq2Var;
        ls1 j7;
        qx2 qx2Var;
        Executor executor;
        ep2Var = this.f2932d.f4726e;
        ms1 ms1Var = (ms1) ep2Var.g();
        final cv b7 = ms1Var == null ? dt2.b(th, null) : ms1Var.a().a(th);
        synchronized (this.f2932d) {
            if (ms1Var != null) {
                ms1Var.b().d(b7);
                executor = this.f2932d.f4723b;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zq2
                    @Override // java.lang.Runnable
                    public final void run() {
                        tq2 tq2Var2;
                        ar2 ar2Var = ar2.this;
                        cv cvVar = b7;
                        tq2Var2 = ar2Var.f2932d.f4725d;
                        tq2Var2.d(cvVar);
                    }
                });
            } else {
                tq2Var = this.f2932d.f4725d;
                tq2Var.d(b7);
                j7 = this.f2932d.j(this.f2931c);
                j7.f().a().c().a();
            }
            zs2.b(b7.f3954f, th, "RewardedAdLoader.onFailure");
            if (this.f2930b != null) {
                qx2Var = this.f2932d.f4728g;
                ox2 ox2Var = this.f2930b;
                ox2Var.c(b7);
                ox2Var.g(false);
                qx2Var.a(ox2Var.i());
            }
            this.f2929a.zza();
        }
    }
}
