package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class E0 extends B0 implements A0 {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f2726b;

    public E0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f2726b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        J0 j02 = new J0(Executors.callable(runnable, null));
        return new C0(j02, this.f2726b.schedule(j02, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
        D0 d02 = new D0(runnable);
        return new C0(d02, this.f2726b.scheduleAtFixedRate(d02, j3, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
        D0 d02 = new D0(runnable);
        return new C0(d02, this.f2726b.scheduleWithFixedDelay(d02, j3, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        J0 j02 = new J0(callable);
        return new C0(j02, this.f2726b.schedule(j02, j3, timeUnit));
    }
}
