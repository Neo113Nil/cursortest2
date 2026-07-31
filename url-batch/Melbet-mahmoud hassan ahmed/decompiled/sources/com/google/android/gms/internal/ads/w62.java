package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class w62 implements a52<t41> {

    /* renamed from: a, reason: collision with root package name */
    private final r51 f13729a;

    /* renamed from: b, reason: collision with root package name */
    private final c62 f13730b;

    /* renamed from: c, reason: collision with root package name */
    private final dc3 f13731c;

    /* renamed from: d, reason: collision with root package name */
    private final xa1 f13732d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f13733e;

    public w62(r51 r51Var, c62 c62Var, xa1 xa1Var, ScheduledExecutorService scheduledExecutorService, dc3 dc3Var) {
        this.f13729a = r51Var;
        this.f13730b = c62Var;
        this.f13732d = xa1Var;
        this.f13733e = scheduledExecutorService;
        this.f13731c = dc3Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<t41> a(final ds2 ds2Var, final rr2 rr2Var) {
        return this.f13731c.E(new Callable() { // from class: com.google.android.gms.internal.ads.u62
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w62.this.c(ds2Var, rr2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        return ds2Var.f4312a.f2953a.a() != null && this.f13730b.b(ds2Var, rr2Var);
    }

    final /* synthetic */ t41 c(final ds2 ds2Var, final rr2 rr2Var) {
        return this.f13729a.b(new l71(ds2Var, rr2Var, null), new g61(ds2Var.f4312a.f2953a.a(), new Runnable() { // from class: com.google.android.gms.internal.ads.t62
            @Override // java.lang.Runnable
            public final void run() {
                w62.this.f(ds2Var, rr2Var);
            }
        })).zza();
    }

    final /* synthetic */ void f(ds2 ds2Var, rr2 rr2Var) {
        rb3.r(rb3.o(this.f13730b.a(ds2Var, rr2Var), rr2Var.O, TimeUnit.SECONDS, this.f13733e), new v62(this), this.f13731c);
    }
}
