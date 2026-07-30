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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ow extends nw implements xq {
    public final Executor g;

    public ow(Executor executor) {
        this.g = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.xq
    public final void c(long j, tf tfVar) {
        Executor executor = this.g;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            lf lfVar = new lf(this, 4, tfVar);
            CoroutineContext coroutineContext = tfVar.i;
            try {
                scheduledFuture = scheduledExecutorService.schedule(lfVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                t80.j(coroutineContext, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            tfVar.z(new pf(0, scheduledFuture));
        } else {
            up.p.c(j, tfVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.xq
    public final rs e(long j, ni1 ni1Var, CoroutineContext coroutineContext) {
        Executor executor = this.g;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(ni1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                t80.j(coroutineContext, cancellationException);
            }
        }
        return scheduledFuture != null ? new qs(scheduledFuture) : up.p.e(j, ni1Var, coroutineContext);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ow) && ((ow) obj).g == this.g;
    }

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.g.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            t80.j(coroutineContext, cancellationException);
            nq nqVar = ls.a;
            fq.g.f(coroutineContext, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.g);
    }

    @Override // defpackage.ln
    public final String toString() {
        return this.g.toString();
    }
}
