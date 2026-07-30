package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fj0 extends ej0 implements m90 {
    public final Executor o;

    public fj0(Executor executor) {
        this.o = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.m90
    public final ec0 A(long j, tx2 tx2Var, CoroutineContext coroutineContext) {
        Executor executor = this.o;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(tx2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                l41.t(coroutineContext, cancellationException);
            }
        }
        return scheduledFuture != null ? new dc0(scheduledFuture) : y70.x.A(j, tx2Var, coroutineContext);
    }

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.o.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            l41.t(coroutineContext, cancellationException);
            t80 t80Var = vb0.a;
            j80.o.N(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.o;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fj0) && ((fj0) obj).o == this.o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.o);
    }

    @Override // defpackage.m90
    public final void n(long j, fs fsVar) {
        Executor executor = this.o;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            iu0 iu0Var = new iu0(12, this, fsVar);
            CoroutineContext coroutineContext = fsVar.q;
            try {
                scheduledFuture = scheduledExecutorService.schedule(iu0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                l41.t(coroutineContext, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            fsVar.x(new as(0, scheduledFuture));
        } else {
            y70.x.n(j, fsVar);
        }
    }

    @Override // defpackage.t40
    public final String toString() {
        return this.o.toString();
    }
}
