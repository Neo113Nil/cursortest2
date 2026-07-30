package M0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class J extends I implements InterfaceC0066y {

    /* renamed from: g, reason: collision with root package name */
    public final Executor f627g;

    public J(Executor executor) {
        Method method;
        this.f627g = executor;
        Method method2 = R0.c.f900a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = R0.c.f900a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // M0.AbstractC0060s
    public final void c(w0.i iVar, Runnable runnable) {
        try {
            this.f627g.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            P p2 = (P) iVar.f(C0061t.f687f);
            if (p2 != null) {
                p2.a(cancellationException);
            }
            B.f617b.c(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f627g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J) && ((J) obj).f627g == this.f627g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f627g);
    }

    @Override // M0.AbstractC0060s
    public final String toString() {
        return this.f627g.toString();
    }
}
