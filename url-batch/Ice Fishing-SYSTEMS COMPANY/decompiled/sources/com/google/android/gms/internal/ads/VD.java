package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class VD extends PA implements ScheduledFuture, J3.a, Future {

    /* renamed from: U, reason: collision with root package name */
    public final AbstractC3354iD f28224U;

    /* renamed from: V, reason: collision with root package name */
    public final ScheduledFuture f28225V;

    public VD(AbstractC3354iD abstractC3354iD, ScheduledFuture scheduledFuture) {
        super(27);
        this.f28224U = abstractC3354iD;
        this.f28225V = scheduledFuture;
    }

    @Override // J3.a
    public final void c(Runnable runnable, Executor executor) {
        this.f28224U.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        boolean cancel = this.f28224U.cancel(z8);
        if (cancel) {
            this.f28225V.cancel(z8);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f28225V.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f28224U.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f28225V.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f28224U.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f28224U.isDone();
    }

    @Override // com.google.android.gms.internal.ads.PA
    public final /* synthetic */ Object q() {
        return this.f28224U;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f28224U.get(j9, timeUnit);
    }
}
