package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class gc3<V> extends lb3<V> implements ScheduledFuture<V> {

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledFuture<?> f5558g;

    public gc3(cc3<V> cc3Var, ScheduledFuture<?> scheduledFuture) {
        super(cc3Var);
        this.f5558g = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean cancel = f().cancel(z6);
        if (cancel) {
            this.f5558g.cancel(z6);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f5558g.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f5558g.getDelay(timeUnit);
    }
}
