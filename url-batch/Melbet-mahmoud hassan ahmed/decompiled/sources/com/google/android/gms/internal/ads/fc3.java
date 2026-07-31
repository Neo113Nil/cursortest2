package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class fc3 extends ja3 {

    /* renamed from: f, reason: collision with root package name */
    private final ExecutorService f5081f;

    fc3(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.f5081f = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f5081f.awaitTermination(j7, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5081f.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f5081f.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f5081f.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f5081f.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f5081f.shutdownNow();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f5081f);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
        sb.append(obj);
        sb.append("[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
