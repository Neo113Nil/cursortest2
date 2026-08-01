package o1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class F extends E implements InterfaceC0302v {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3310c;

    public F(Executor executor) {
        Method method;
        this.f3310c = executor;
        Method method2 = s1.c.f3644a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = s1.c.f3644a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f3310c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F) && ((F) obj).f3310c == this.f3310c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3310c);
    }

    @Override // o1.AbstractC0296o
    public final String toString() {
        return this.f3310c.toString();
    }

    @Override // o1.AbstractC0296o
    public final void y(X0.i iVar, Runnable runnable) {
        try {
            this.f3310c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            AbstractC0299s.a(iVar, cancellationException);
            AbstractC0305y.f3370b.y(iVar, runnable);
        }
    }
}
