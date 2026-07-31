package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n31 implements so {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f8909a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.d f8910b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture<?> f8911c;

    /* renamed from: d, reason: collision with root package name */
    private long f8912d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f8913e = -1;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f8914f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8915g = false;

    public n31(ScheduledExecutorService scheduledExecutorService, v3.d dVar) {
        this.f8909a = scheduledExecutorService;
        this.f8910b = dVar;
        y2.t.c().c(this);
    }

    final synchronized void a() {
        if (this.f8915g) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f8911c;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f8913e = -1L;
        } else {
            this.f8911c.cancel(true);
            this.f8913e = this.f8912d - this.f8910b.a();
        }
        this.f8915g = true;
    }

    final synchronized void b() {
        ScheduledFuture<?> scheduledFuture;
        if (this.f8915g) {
            if (this.f8913e > 0 && (scheduledFuture = this.f8911c) != null && scheduledFuture.isCancelled()) {
                this.f8911c = this.f8909a.schedule(this.f8914f, this.f8913e, TimeUnit.MILLISECONDS);
            }
            this.f8915g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void c(boolean z6) {
        if (z6) {
            b();
        } else {
            a();
        }
    }

    public final synchronized void d(int i7, Runnable runnable) {
        this.f8914f = runnable;
        long j7 = i7;
        this.f8912d = this.f8910b.a() + j7;
        this.f8911c = this.f8909a.schedule(runnable, j7, TimeUnit.MILLISECONDS);
    }
}
