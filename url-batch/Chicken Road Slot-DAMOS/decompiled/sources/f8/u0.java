package f8;

import com.google.android.gms.internal.measurement.xc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u0 extends AbstractExecutorService implements ScheduledExecutorService, ExecutorService, AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f4185d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f4186e;

    public u0(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.f4185d = scheduledExecutorService;
        this.f4186e = scheduledExecutorService;
    }

    public final ListenableFuture a(xc xcVar) {
        return (ListenableFuture) super.submit(xcVar);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f4185d.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ScheduledExecutorService scheduledExecutorService;
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = (scheduledExecutorService = this.f4185d).isTerminated())) {
            return;
        }
        shutdown();
        boolean z10 = false;
        while (!isTerminated) {
            try {
                isTerminated = scheduledExecutorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4185d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f4185d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f4185d.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new z0(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        z0 z0Var = new z0(Executors.callable(runnable, null));
        return new s0(z0Var, this.f4186e.schedule(z0Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j3, TimeUnit timeUnit) {
        t0 t0Var = new t0(runnable);
        return new s0(t0Var, this.f4186e.scheduleAtFixedRate(t0Var, j, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j3, TimeUnit timeUnit) {
        t0 t0Var = new t0(runnable);
        return new s0(t0Var, this.f4186e.scheduleWithFixedDelay(t0Var, j, j3, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f4185d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f4185d.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f4185d);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + String.valueOf(obj).length() + 2);
        sb2.append(obj);
        sb2.append("[");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new z0(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        z0 z0Var = new z0(callable);
        return new s0(z0Var, this.f4186e.schedule(z0Var, j, timeUnit));
    }
}
