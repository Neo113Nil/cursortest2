package n6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import u6.C0953e;
import u6.ExecutorC0952d;

/* loaded from: classes.dex */
public final class S extends Q implements InterfaceC0765C {

    /* renamed from: i, reason: collision with root package name */
    public final Executor f7030i;

    public S(Executor executor) {
        this.f7030i = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // n6.AbstractC0786t
    public final void E(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f7030i.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            X x7 = (X) coroutineContext.g(C0787u.f7085e);
            if (x7 != null) {
                x7.d(cancellationException);
            }
            C0953e c0953e = F.f7011a;
            ExecutorC0952d.f8106i.E(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f7030i;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof S) && ((S) obj).f7030i == this.f7030i;
    }

    @Override // n6.InterfaceC0765C
    public final void h(long j, C0775h c0775h) {
        Executor executor = this.f7030i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            F.a aVar = new F.a(this, 21, c0775h);
            CoroutineContext coroutineContext = c0775h.f7063m;
            try {
                scheduledFuture = scheduledExecutorService.schedule(aVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                X x7 = (X) coroutineContext.g(C0787u.f7085e);
                if (x7 != null) {
                    x7.d(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0775h.v(new C0772e(0, scheduledFuture));
        } else {
            RunnableC0763A.f7006r.h(j, c0775h);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7030i);
    }

    @Override // n6.InterfaceC0765C
    public final H s(long j, r0 r0Var, CoroutineContext coroutineContext) {
        Executor executor = this.f7030i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(r0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                X x7 = (X) coroutineContext.g(C0787u.f7085e);
                if (x7 != null) {
                    x7.d(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new G(scheduledFuture) : RunnableC0763A.f7006r.s(j, r0Var, coroutineContext);
    }

    @Override // n6.AbstractC0786t
    public final String toString() {
        return this.f7030i.toString();
    }
}
