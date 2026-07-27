package W2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class W extends V implements E {

    /* renamed from: i, reason: collision with root package name */
    public final Executor f4243i;

    public W(Executor executor) {
        this.f4243i = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f4243i;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof W) && ((W) obj).f4243i == this.f4243i;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4243i);
    }

    @Override // W2.E
    public final void n(long j4, C0286h c0286h) {
        Executor executor = this.f4243i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new G1.n(5, (Object) this, (Object) c0286h, false), j4, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e4);
                InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) c0286h.f4266k.k(C0299v.f4296e);
                if (interfaceC0280c0 != null) {
                    interfaceC0280c0.a(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0286h.w(new C0283e(0, scheduledFuture));
        } else {
            C.f4219p.n(j4, c0286h);
        }
    }

    @Override // W2.E
    public final L p(long j4, w0 w0Var, CoroutineContext coroutineContext) {
        Executor executor = this.f4243i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(w0Var, j4, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e4);
                InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e);
                if (interfaceC0280c0 != null) {
                    interfaceC0280c0.a(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new K(scheduledFuture) : C.f4219p.p(j4, w0Var, coroutineContext);
    }

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f4243i.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e);
            if (interfaceC0280c0 != null) {
                interfaceC0280c0.a(cancellationException);
            }
            d3.e eVar = J.f4225a;
            d3.d.f6116i.t(coroutineContext, runnable);
        }
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        return this.f4243i.toString();
    }
}
