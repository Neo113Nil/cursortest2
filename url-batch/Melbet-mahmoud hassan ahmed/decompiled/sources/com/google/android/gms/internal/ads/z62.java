package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z62 extends wj0 implements hc1 {

    /* renamed from: f, reason: collision with root package name */
    private xj0 f14975f;

    /* renamed from: g, reason: collision with root package name */
    private gc1 f14976g;

    /* renamed from: h, reason: collision with root package name */
    private aj1 f14977h;

    @Override // com.google.android.gms.internal.ads.hc1
    public final synchronized void C5(gc1 gc1Var) {
        this.f14976g = gc1Var;
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void G0(x3.a aVar, int i7) {
        gc1 gc1Var = this.f14976g;
        if (gc1Var != null) {
            gc1Var.d(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void S1(x3.a aVar, int i7) {
        aj1 aj1Var = this.f14977h;
        if (aj1Var != null) {
            String valueOf = String.valueOf(((u92) aj1Var).f12711c.f4071a);
            io0.g(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void U(x3.a aVar) {
        Executor executor;
        aj1 aj1Var = this.f14977h;
        if (aj1Var != null) {
            executor = ((u92) aj1Var).f12712d.f13772b;
            final ds2 ds2Var = ((u92) aj1Var).f12709a;
            final rr2 rr2Var = ((u92) aj1Var).f12710b;
            final d52 d52Var = ((u92) aj1Var).f12711c;
            final u92 u92Var = (u92) aj1Var;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.t92
                @Override // java.lang.Runnable
                public final void run() {
                    u92 u92Var2 = u92.this;
                    ds2 ds2Var2 = ds2Var;
                    rr2 rr2Var2 = rr2Var;
                    d52 d52Var2 = d52Var;
                    w92 w92Var = u92Var2.f12712d;
                    w92.e(ds2Var2, rr2Var2, d52Var2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void Y(x3.a aVar) {
        gc1 gc1Var = this.f14976g;
        if (gc1Var != null) {
            gc1Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void d0(x3.a aVar) {
        xj0 xj0Var = this.f14975f;
        if (xj0Var != null) {
            ((v92) xj0Var).f13168f.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void f6(x3.a aVar, yj0 yj0Var) {
        xj0 xj0Var = this.f14975f;
        if (xj0Var != null) {
            ((v92) xj0Var).f13171i.q0(yj0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void g0(x3.a aVar) {
        xj0 xj0Var = this.f14975f;
        if (xj0Var != null) {
            ((v92) xj0Var).f13170h.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void n4(x3.a aVar) {
        xj0 xj0Var = this.f14975f;
        if (xj0Var != null) {
            ((v92) xj0Var).f13170h.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void p0(x3.a aVar) {
        xj0 xj0Var = this.f14975f;
        if (xj0Var != null) {
            xj0Var.p0(aVar);
        }
    }

    public final synchronized void t6(xj0 xj0Var) {
        this.f14975f = xj0Var;
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void u0(x3.a aVar) {
        xj0 xj0Var = this.f14975f;
        if (xj0Var != null) {
            ((v92) xj0Var).f13171i.c();
        }
    }

    public final synchronized void u6(aj1 aj1Var) {
        this.f14977h = aj1Var;
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final synchronized void zze(x3.a aVar) {
        xj0 xj0Var = this.f14975f;
        if (xj0Var != null) {
            ((v92) xj0Var).f13169g.M();
        }
    }
}
