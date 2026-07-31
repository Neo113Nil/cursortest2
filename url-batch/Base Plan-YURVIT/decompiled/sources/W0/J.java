package W0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class J extends I implements InterfaceC0084y {

    /* renamed from: g, reason: collision with root package name */
    public final Executor f916g;

    public J(Executor executor) {
        Method method;
        this.f916g = executor;
        Method method2 = b1.c.f1742a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = b1.c.f1742a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // W0.AbstractC0078s
    public final void c(G0.i iVar, Runnable runnable) {
        try {
            this.f916g.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            P p2 = (P) iVar.m(C0079t.f974f);
            if (p2 != null) {
                p2.b(cancellationException);
            }
            B.f906b.c(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f916g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J) && ((J) obj).f916g == this.f916g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f916g);
    }

    @Override // W0.AbstractC0078s
    public final String toString() {
        return this.f916g.toString();
    }
}
