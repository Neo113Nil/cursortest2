package k0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class F extends E implements InterfaceC0061w {

    /* renamed from: d, reason: collision with root package name */
    public final Executor f883d;

    public F(Executor executor) {
        Method method;
        this.f883d = executor;
        Method method2 = p0.c.f1141a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = p0.c.f1141a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f883d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // k0.AbstractC0055p
    public final void d(W.i iVar, Runnable runnable) {
        try {
            this.f883d.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            K k2 = (K) iVar.k(C0056q.f936c);
            if (k2 != null) {
                k2.a(cancellationException);
            }
            AbstractC0063y.f951b.d(iVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F) && ((F) obj).f883d == this.f883d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f883d);
    }

    @Override // k0.AbstractC0055p
    public final String toString() {
        return this.f883d.toString();
    }
}
