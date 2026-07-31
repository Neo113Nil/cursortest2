package k0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class F extends E implements InterfaceC0063w {

    /* renamed from: d, reason: collision with root package name */
    public final Executor f830d;

    public F(Executor executor) {
        Method method;
        this.f830d = executor;
        Method method2 = p0.c.f1133a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = p0.c.f1133a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f830d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // k0.AbstractC0057p
    public final void d(W.i iVar, Runnable runnable) {
        try {
            this.f830d.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            K k2 = (K) iVar.k(C0058q.f883c);
            if (k2 != null) {
                k2.a(cancellationException);
            }
            AbstractC0065y.f898b.d(iVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F) && ((F) obj).f830d == this.f830d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f830d);
    }

    @Override // k0.AbstractC0057p
    public final String toString() {
        return this.f830d.toString();
    }
}
