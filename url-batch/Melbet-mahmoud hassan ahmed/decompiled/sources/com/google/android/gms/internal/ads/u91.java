package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u91 implements va1, zh1, vf1, mb1 {

    /* renamed from: f, reason: collision with root package name */
    private final ob1 f12703f;

    /* renamed from: g, reason: collision with root package name */
    private final rr2 f12704g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f12705h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f12706i;

    /* renamed from: j, reason: collision with root package name */
    private final kc3<Boolean> f12707j = kc3.E();

    /* renamed from: k, reason: collision with root package name */
    private ScheduledFuture<?> f12708k;

    public u91(ob1 ob1Var, rr2 rr2Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f12703f = ob1Var;
        this.f12704g = rr2Var;
        this.f12705h = scheduledExecutorService;
        this.f12706i = executor;
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final synchronized void M0(cv cvVar) {
        if (this.f12707j.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f12708k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f12707j.x(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void b() {
        if (((Boolean) sw.c().b(m10.f8202g1)).booleanValue()) {
            rr2 rr2Var = this.f12704g;
            if (rr2Var.V == 2) {
                if (rr2Var.f11395r == 0) {
                    this.f12703f.zza();
                } else {
                    rb3.r(this.f12707j, new t91(this), this.f12706i);
                    this.f12708k = this.f12705h.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.s91
                        @Override // java.lang.Runnable
                        public final void run() {
                            u91.this.f();
                        }
                    }, this.f12704g.f11395r, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vf1
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void e() {
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            if (this.f12707j.isDone()) {
                return;
            }
            this.f12707j.w(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf1
    public final synchronized void g() {
        if (this.f12707j.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f12708k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f12707j.w(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void h(mj0 mj0Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void n() {
        int i7 = this.f12704g.V;
        if (i7 == 0 || i7 == 1) {
            this.f12703f.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void t() {
    }
}
