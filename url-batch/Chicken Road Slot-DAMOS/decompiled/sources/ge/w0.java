package ge;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 extends v0 implements f0 {

    /* renamed from: i, reason: collision with root package name */
    public final Executor f4411i;

    public w0(Executor executor) {
        Method method;
        this.f4411i = executor;
        Method method2 = le.a.f5963a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = le.a.f5963a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f4411i.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            a0.g(coroutineContext, cancellationException);
            ne.e eVar = k0.f4372a;
            ne.d.f7275i.L(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f4411i;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w0) && ((w0) obj).f4411i == this.f4411i;
    }

    @Override // ge.f0
    public final void h(long j, h hVar) {
        Executor executor = this.f4411i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            f8.j0 j0Var = new f8.j0(8, this, hVar);
            CoroutineContext coroutineContext = hVar.f4357s;
            try {
                scheduledFuture = scheduledExecutorService.schedule(j0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e2);
                a0.g(coroutineContext, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            hVar.v(new e(0, scheduledFuture));
        } else {
            b0.f4334x.h(j, hVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4411i);
    }

    @Override // ge.f0
    public final m0 i(long j, w1 w1Var, CoroutineContext coroutineContext) {
        Executor executor = this.f4411i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(w1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e2);
                a0.g(coroutineContext, cancellationException);
            }
        }
        return scheduledFuture != null ? new l0(scheduledFuture) : b0.f4334x.i(j, w1Var, coroutineContext);
    }

    @Override // ge.t
    public final String toString() {
        return this.f4411i.toString();
    }
}
