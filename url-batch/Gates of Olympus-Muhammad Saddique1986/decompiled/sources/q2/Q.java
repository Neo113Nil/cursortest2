package q2;

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
    public final Executor f7869f;

    public Q(Executor executor) {
        this.f7869f = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // q2.AbstractC0831s
    public final void D(V1.i iVar, Runnable runnable) {
        try {
            this.f7869f.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            X x3 = (X) iVar.v(C0832t.f7929e);
            if (x3 != null) {
                x3.a(cancellationException);
            }
            x2.e eVar = E.f7851a;
            x2.d.f10346f.D(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f7869f;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && ((Q) obj).f7869f == this.f7869f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7869f);
    }

    @Override // q2.B
    public final void q(long j3, C0821h c0821h) {
        Executor executor = this.f7869f;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new c1.z(this, 1, c0821h), j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                X x3 = (X) c0821h.f7904h.v(C0832t.f7929e);
                if (x3 != null) {
                    x3.a(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0821h.w(new C0818e(0, scheduledFuture));
        } else {
            RunnableC0838z.f7950m.q(j3, c0821h);
        }
    }

    @Override // q2.AbstractC0831s
    public final String toString() {
        return this.f7869f.toString();
    }

    @Override // q2.B
    public final G u(long j3, r0 r0Var, V1.i iVar) {
        Executor executor = this.f7869f;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(r0Var, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                X x3 = (X) iVar.v(C0832t.f7929e);
                if (x3 != null) {
                    x3.a(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new F(scheduledFuture) : RunnableC0838z.f7950m.u(j3, r0Var, iVar);
    }
}
