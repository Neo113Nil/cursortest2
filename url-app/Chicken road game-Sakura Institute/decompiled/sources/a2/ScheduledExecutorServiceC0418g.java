package a2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: a2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC0418g implements ScheduledExecutorService {

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f4932d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f4933e;

    public ScheduledExecutorServiceC0418g(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f4932d = executorService;
        this.f4933e = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j4, TimeUnit timeUnit) {
        return this.f4932d.awaitTermination(j4, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4932d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f4932d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f4932d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f4932d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f4932d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
        return new ScheduledFutureC0420i(new C0413b(this, runnable, j4, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        return new ScheduledFutureC0420i(new C0415d(this, runnable, j4, j5, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        return new ScheduledFutureC0420i(new C0415d(this, runnable, j4, j5, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f4932d.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f4932d.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f4932d.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j4, TimeUnit timeUnit) {
        return new ScheduledFutureC0420i(new C0413b(this, callable, j4, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f4932d.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f4932d.submit(runnable);
    }
}
