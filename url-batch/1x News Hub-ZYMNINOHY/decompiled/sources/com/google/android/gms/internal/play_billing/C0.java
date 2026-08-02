package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class C0 extends AbstractC0216d1 implements ScheduledFuture, InterfaceFutureC0277y0, Future {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0245n0 f2715b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledFuture f2716c;

    public C0(AbstractC0245n0 abstractC0245n0, ScheduledFuture scheduledFuture) {
        super(4);
        this.f2715b = abstractC0245n0;
        this.f2716c = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0277y0
    public final void a(Runnable runnable, Executor executor) {
        this.f2715b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = this.f2715b.cancel(z);
        if (cancel) {
            this.f2716c.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f2716c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f2715b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2716c.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2715b.f2890a instanceof C0212c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2715b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f2715b.get(j3, timeUnit);
    }
}
