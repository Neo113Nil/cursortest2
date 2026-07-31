package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jb1 extends lg1<za1> implements za1 {

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f7064g;

    /* renamed from: h, reason: collision with root package name */
    private ScheduledFuture<?> f7065h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7066i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7067j;

    public jb1(ib1 ib1Var, Set<hi1<za1>> set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f7066i = false;
        this.f7064g = scheduledExecutorService;
        this.f7067j = ((Boolean) sw.c().b(m10.i7)).booleanValue();
        D0(ib1Var, executor);
    }

    public final void S0() {
        if (this.f7067j) {
            this.f7065h = this.f7064g.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.db1
                @Override // java.lang.Runnable
                public final void run() {
                    jb1.this.c();
                }
            }, ((Integer) sw.c().b(m10.j7)).intValue(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void a() {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.cb1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((za1) obj).a();
            }
        });
    }

    final /* synthetic */ void c() {
        synchronized (this) {
            io0.d("Timeout waiting for show call succeed to be called.");
            r0(new ok1("Timeout for show call succeed."));
            this.f7066i = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void d(final cv cvVar) {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.ab1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((za1) obj).d(cv.this);
            }
        });
    }

    public final synchronized void g() {
        if (this.f7067j) {
            ScheduledFuture<?> scheduledFuture = this.f7065h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void r0(final ok1 ok1Var) {
        if (this.f7067j) {
            if (this.f7066i) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f7065h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.bb1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((za1) obj).r0(ok1.this);
            }
        });
    }
}
