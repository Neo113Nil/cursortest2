package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Iu implements InterfaceC4156x8 {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f25651n;

    /* renamed from: u, reason: collision with root package name */
    public final SD f25652u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f25653v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public boolean f25654w = false;

    public Iu(ScheduledExecutorService scheduledExecutorService, SD sd) {
        this.f25651n = scheduledExecutorService;
        this.f25652u = sd;
    }

    public final synchronized void a(Runnable runnable, long j9) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f25654w) {
                    p2.j.f39798C.f39807g.i(this);
                    this.f25654w = true;
                }
                p2.j.f39798C.f39810k.getClass();
                Hu hu = new Hu(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j9));
                ScheduledFuture<?> schedule = this.f25651n.schedule(new RunnableC3376ij(27, hu), j9, timeUnit);
                hu.f25444c = schedule;
                this.f25653v.put(schedule, hu);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4156x8
    public final void i0(boolean z8) {
        if (z8) {
            this.f25652u.execute(new RunnableC3376ij(28, this));
        }
    }
}
