package c7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s0 extends r0 implements d0 {

    /* renamed from: h, reason: collision with root package name */
    public final Executor f1740h;

    public s0(Executor executor) {
        this.f1740h = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // c7.d0
    public final i0 U(long j8, r1 r1Var, h6.i iVar) {
        Executor executor = this.f1740h;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(r1Var, j8, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                x0 x0Var = (x0) iVar.u(u.f1748g);
                if (x0Var != null) {
                    x0Var.c(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new h0(scheduledFuture) : b0.f1672o.U(j8, r1Var, iVar);
    }

    @Override // c7.t
    public final void V(h6.i iVar, Runnable runnable) {
        try {
            this.f1740h.execute(runnable);
        } catch (RejectedExecutionException e9) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e9);
            x0 x0Var = (x0) iVar.u(u.f1748g);
            if (x0Var != null) {
                x0Var.c(cancellationException);
            }
            j7.e eVar = g0.f1696a;
            j7.d.f5151h.V(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f1740h;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s0) && ((s0) obj).f1740h == this.f1740h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1740h);
    }

    @Override // c7.d0
    public final void k(long j8, h hVar) {
        Executor executor = this.f1740h;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            b3.z zVar = new b3.z(this, 1, hVar);
            h6.i iVar = hVar.f1702j;
            try {
                scheduledFuture = scheduledExecutorService.schedule(zVar, j8, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                x0 x0Var = (x0) iVar.u(u.f1748g);
                if (x0Var != null) {
                    x0Var.c(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            hVar.u(new e(0, scheduledFuture));
        } else {
            b0.f1672o.k(j8, hVar);
        }
    }

    @Override // c7.t
    public final String toString() {
        return this.f1740h.toString();
    }
}
