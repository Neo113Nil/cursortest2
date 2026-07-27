package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class C0 extends AbstractC0325d1 implements ScheduledFuture, InterfaceFutureC0386y0, Future {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0354n0 f5031b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledFuture f5032c;

    public C0(AbstractC0354n0 abstractC0354n0, ScheduledFuture scheduledFuture) {
        super(4);
        this.f5031b = abstractC0354n0;
        this.f5032c = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0386y0
    public final void b(Runnable runnable, Executor executor) {
        this.f5031b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = this.f5031b.cancel(z);
        if (cancel) {
            this.f5032c.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f5032c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5031b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f5032c.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5031b.f5216a instanceof C0324d0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5031b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.f5031b.get(j2, timeUnit);
    }
}
