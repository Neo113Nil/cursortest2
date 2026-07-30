package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Jv {

    /* renamed from: a, reason: collision with root package name */
    public final Ev f25847a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f25848b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public volatile ScheduledFuture f25849c;

    /* renamed from: d, reason: collision with root package name */
    public final Hv f25850d;

    public Jv(Ev ev, ScheduledExecutorService scheduledExecutorService, long j9, Hv hv) {
        this.f25850d = hv;
        this.f25847a = ev;
        if (j9 > 0) {
            this.f25849c = scheduledExecutorService.schedule(new RunnableC3771q0(this, ev, hv, 9), j9, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        if (this.f25848b.compareAndSet(false, true)) {
            if (this.f25849c != null) {
                this.f25849c.cancel(false);
            }
            this.f25847a.b(this.f25850d, false);
        }
    }
}
