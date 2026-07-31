package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nd1 extends lg1<od1> {

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f9046g;

    /* renamed from: h, reason: collision with root package name */
    private final v3.d f9047h;

    /* renamed from: i, reason: collision with root package name */
    private long f9048i;

    /* renamed from: j, reason: collision with root package name */
    private long f9049j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9050k;

    /* renamed from: l, reason: collision with root package name */
    private ScheduledFuture<?> f9051l;

    public nd1(ScheduledExecutorService scheduledExecutorService, v3.d dVar) {
        super(Collections.emptySet());
        this.f9048i = -1L;
        this.f9049j = -1L;
        this.f9050k = false;
        this.f9046g = scheduledExecutorService;
        this.f9047h = dVar;
    }

    private final synchronized void U0(long j7) {
        ScheduledFuture<?> scheduledFuture = this.f9051l;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f9051l.cancel(true);
        }
        this.f9048i = this.f9047h.a() + j7;
        this.f9051l = this.f9046g.schedule(new md1(this, null), j7, TimeUnit.MILLISECONDS);
    }

    public final synchronized void S0(int i7) {
        if (i7 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i7);
        if (this.f9050k) {
            long j7 = this.f9049j;
            if (j7 <= 0 || millis >= j7) {
                millis = j7;
            }
            this.f9049j = millis;
            return;
        }
        long a7 = this.f9047h.a();
        long j8 = this.f9048i;
        if (a7 > j8 || j8 - this.f9047h.a() > millis) {
            U0(millis);
        }
    }

    public final synchronized void a() {
        if (this.f9050k) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f9051l;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.f9049j = -1L;
        } else {
            this.f9051l.cancel(true);
            this.f9049j = this.f9048i - this.f9047h.a();
        }
        this.f9050k = true;
    }

    public final synchronized void c() {
        if (this.f9050k) {
            if (this.f9049j > 0 && this.f9051l.isCancelled()) {
                U0(this.f9049j);
            }
            this.f9050k = false;
        }
    }

    public final synchronized void zza() {
        this.f9050k = false;
        U0(0L);
    }
}
