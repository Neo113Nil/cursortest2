package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class q82 implements nb3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f10609a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10610b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ rr2 f10611c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ur2 f10612d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ zx2 f10613e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ds2 f10614f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r82 f10615g;

    q82(r82 r82Var, long j7, String str, rr2 rr2Var, ur2 ur2Var, zx2 zx2Var, ds2 ds2Var) {
        this.f10615g = r82Var;
        this.f10609a = j7;
        this.f10610b = str;
        this.f10611c = rr2Var;
        this.f10612d = ur2Var;
        this.f10613e = zx2Var;
        this.f10614f = ds2Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void a(Object obj) {
        v3.d dVar;
        boolean z6;
        f52 f52Var;
        s82 s82Var;
        dVar = this.f10615g.f11052a;
        long a7 = dVar.a() - this.f10609a;
        r82.g(this.f10615g, this.f10610b, 0, a7, this.f10611c.f11374d0);
        z6 = this.f10615g.f11056e;
        if (z6) {
            s82Var = this.f10615g.f11053b;
            s82Var.a(this.f10612d, this.f10611c, 0, null, a7);
        }
        if (((Boolean) sw.c().b(m10.f8191e6)).booleanValue()) {
            f52Var = this.f10615g.f11057f;
            f52Var.d(this.f10611c, a7, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        v3.d dVar;
        boolean z6;
        cv cvVar;
        f52 f52Var;
        cy2 cy2Var;
        s82 s82Var;
        dVar = this.f10615g.f11052a;
        long a7 = dVar.a() - this.f10609a;
        int i7 = th instanceof TimeoutException ? 2 : th instanceof f82 ? 3 : th instanceof CancellationException ? 4 : th instanceof ps2 ? 5 : ((th instanceof fz1) && dt2.a(th).f3954f == 3) ? 1 : 6;
        r82.g(this.f10615g, this.f10610b, i7, a7, this.f10611c.f11374d0);
        z6 = this.f10615g.f11056e;
        if (z6) {
            s82Var = this.f10615g.f11053b;
            s82Var.a(this.f10612d, this.f10611c, i7, th instanceof e52 ? (e52) th : null, a7);
        }
        if (((Boolean) sw.c().b(m10.f8207g6)).booleanValue()) {
            cy2Var = this.f10615g.f11054c;
            zx2 zx2Var = this.f10613e;
            ds2 ds2Var = this.f10614f;
            rr2 rr2Var = this.f10611c;
            cy2Var.c(zx2Var.a(ds2Var, rr2Var, rr2Var.f11392o));
        }
        if (((Boolean) sw.c().b(m10.f8191e6)).booleanValue()) {
            cv a8 = dt2.a(th);
            int i8 = a8.f3954f;
            if ((i8 == 3 || i8 == 0) && (cvVar = a8.f3957i) != null && !cvVar.f3956h.equals("com.google.android.gms.ads")) {
                a8 = dt2.a(new e52(13, a8.f3957i));
            }
            f52Var = this.f10615g.f11057f;
            f52Var.d(this.f10611c, a7, a8);
        }
    }
}
