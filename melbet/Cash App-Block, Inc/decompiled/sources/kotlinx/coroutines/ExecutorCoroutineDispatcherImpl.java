package kotlinx.coroutines;

import com.google.mlkit.common.sdkinternal.zzb;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ConcurrentKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {
    public final Executor executor;

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        Method method;
        this.executor = executor;
        Method method2 = ConcurrentKt.REMOVE_FUTURE_ON_CANCEL;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = ConcurrentKt.REMOVE_FUTURE_ON_CANCEL) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.executor;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            JobKt.cancel(coroutineContext, JobKt.CancellationException("The task was rejected", e));
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler.INSTANCE.dispatch(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).executor == this.executor;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final Executor getExecutor() {
        return this.executor;
    }

    public final int hashCode() {
        return System.identityHashCode(this.executor);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.executor;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                JobKt.cancel(coroutineContext, JobKt.CancellationException("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new DisposableFutureHandle(scheduledFuture) : DefaultExecutor.INSTANCE.invokeOnTimeout(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        Executor executor = this.executor;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            zzb zzbVar = new zzb(this, cancellableContinuationImpl, false, 22);
            CoroutineContext coroutineContext = cancellableContinuationImpl.context;
            try {
                scheduledFuture = scheduledExecutorService.schedule(zzbVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                JobKt.cancel(coroutineContext, JobKt.CancellationException("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            cancellableContinuationImpl.invokeOnCancellationImpl(new CancelFutureOnCancel(scheduledFuture));
        } else {
            DefaultExecutor.INSTANCE.scheduleResumeAfterDelay(j, cancellableContinuationImpl);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.executor.toString();
    }
}
