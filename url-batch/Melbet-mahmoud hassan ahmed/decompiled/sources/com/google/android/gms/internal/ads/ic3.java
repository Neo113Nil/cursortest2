package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class ic3 extends fc3 implements ScheduledExecutorService {

    /* renamed from: g, reason: collision with root package name */
    final ScheduledExecutorService f6606g;

    ic3(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f6606g = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        rc3 F = rc3.F(runnable, null);
        return new gc3(F, this.f6606g.schedule(F, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j7, TimeUnit timeUnit) {
        rc3 rc3Var = new rc3(callable);
        return new gc3(rc3Var, this.f6606g.schedule(rc3Var, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        hc3 hc3Var = new hc3(runnable);
        return new gc3(hc3Var, this.f6606g.scheduleAtFixedRate(hc3Var, j7, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        hc3 hc3Var = new hc3(runnable);
        return new gc3(hc3Var, this.f6606g.scheduleWithFixedDelay(hc3Var, j7, j8, timeUnit));
    }
}
