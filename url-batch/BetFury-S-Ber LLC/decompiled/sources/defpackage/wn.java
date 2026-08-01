package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wn extends vn implements fj {
    public final Executor h;

    public wn(Executor executor) {
        this.h = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.tg
    public final void O(qg qgVar, Runnable runnable) {
        try {
            this.h.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            bi.m(qgVar, cancellationException);
            si siVar = ik.a;
            ii.h.O(qgVar, runnable);
        }
    }

    @Override // defpackage.vn
    public final Executor R() {
        return this.h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.h;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wn) && ((wn) obj).h == this.h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.h);
    }

    @Override // defpackage.fj
    public final nk i(long j, ii0 ii0Var, qg qgVar) {
        Executor executor = this.h;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(ii0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                bi.m(qgVar, cancellationException);
            }
        }
        return scheduledFuture != null ? new mk(scheduledFuture) : fi.o.i(j, ii0Var, qgVar);
    }

    @Override // defpackage.tg
    public final String toString() {
        return this.h.toString();
    }
}
