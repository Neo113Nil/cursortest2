package k2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Q extends P implements B {

    /* renamed from: f, reason: collision with root package name */
    public final Executor f5330f;

    public Q(Executor executor) {
        this.f5330f = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // k2.AbstractC0546s
    public final void P(P1.i iVar, Runnable runnable) {
        try {
            this.f5330f.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            X x3 = (X) iVar.k(C0547t.f5390e);
            if (x3 != null) {
                x3.a(cancellationException);
            }
            r2.e eVar = E.f5312a;
            r2.d.f7321f.P(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f5330f;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && ((Q) obj).f5330f == this.f5330f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5330f);
    }

    @Override // k2.B
    public final G i(long j3, r0 r0Var, P1.i iVar) {
        Executor executor = this.f5330f;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(r0Var, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                X x3 = (X) iVar.k(C0547t.f5390e);
                if (x3 != null) {
                    x3.a(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new F(scheduledFuture) : RunnableC0553z.f5410m.i(j3, r0Var, iVar);
    }

    @Override // k2.AbstractC0546s
    public final String toString() {
        return this.f5330f.toString();
    }

    @Override // k2.B
    public final void u(long j3, C0536h c0536h) {
        Executor executor = this.f5330f;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new a1.x(this, 1, c0536h), j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                X x3 = (X) c0536h.f5365h.k(C0547t.f5390e);
                if (x3 != null) {
                    x3.a(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0536h.u(new C0533e(0, scheduledFuture));
        } else {
            RunnableC0553z.f5410m.u(j3, c0536h);
        }
    }
}
