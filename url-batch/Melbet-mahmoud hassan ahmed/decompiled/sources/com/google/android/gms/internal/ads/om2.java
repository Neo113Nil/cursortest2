package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class om2 implements nb3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd2 f9718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ox2 f9719b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ qm2 f9720c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ rm2 f9721d;

    om2(rm2 rm2Var, bd2 bd2Var, ox2 ox2Var, qm2 qm2Var) {
        this.f9721d = rm2Var;
        this.f9718a = bd2Var;
        this.f9719b = ox2Var;
        this.f9720c = qm2Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        qx2 qx2Var;
        in2 in2Var;
        v61 v61Var = (v61) obj;
        synchronized (this.f9721d) {
            this.f9721d.f11259i = null;
            if (((Boolean) sw.c().b(m10.W5)).booleanValue()) {
                hf1 e7 = v61Var.e();
                in2Var = this.f9721d.f11254d;
                e7.b(in2Var);
            }
            this.f9718a.a(v61Var);
            if (this.f9719b != null) {
                qx2Var = this.f9721d.f11257g;
                ox2 ox2Var = this.f9719b;
                ox2Var.d(v61Var.g().f4313b);
                ox2Var.e(v61Var.c().b());
                ox2Var.g(true);
                qx2Var.a(ox2Var.i());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        ep2 ep2Var;
        in2 in2Var;
        ca1 l7;
        qx2 qx2Var;
        Executor executor;
        ep2Var = this.f9721d.f11255e;
        b41 b41Var = (b41) ep2Var.g();
        final cv b7 = b41Var == null ? dt2.b(th, null) : b41Var.a().a(th);
        synchronized (this.f9721d) {
            this.f9721d.f11259i = null;
            if (b41Var != null) {
                b41Var.c().d(b7);
                if (((Boolean) sw.c().b(m10.W5)).booleanValue()) {
                    executor = this.f9721d.f11252b;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nm2
                        @Override // java.lang.Runnable
                        public final void run() {
                            in2 in2Var2;
                            om2 om2Var = om2.this;
                            cv cvVar = b7;
                            in2Var2 = om2Var.f9721d.f11254d;
                            in2Var2.d(cvVar);
                        }
                    });
                }
            } else {
                in2Var = this.f9721d.f11254d;
                in2Var.d(b7);
                l7 = this.f9721d.l(this.f9720c);
                ((b41) l7.f()).a().c().a();
            }
            zs2.b(b7.f3954f, th, "AppOpenAdLoader.onFailure");
            this.f9718a.zza();
            if (this.f9719b != null) {
                qx2Var = this.f9721d.f11257g;
                ox2 ox2Var = this.f9719b;
                ox2Var.c(b7);
                ox2Var.g(false);
                qx2Var.a(ox2Var.i());
            }
        }
    }
}
