package Y0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class J extends I implements InterfaceC0130y {

    /* renamed from: g, reason: collision with root package name */
    public final Executor f1170g;

    public J(Executor executor) {
        Method method;
        this.f1170g = executor;
        Method method2 = d1.c.f2069a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = d1.c.f2069a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // Y0.AbstractC0124s
    public final void c(H0.i iVar, Runnable runnable) {
        try {
            this.f1170g.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            P p2 = (P) iVar.k(C0125t.f1230f);
            if (p2 != null) {
                p2.a(cancellationException);
            }
            B.f1160b.c(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f1170g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J) && ((J) obj).f1170g == this.f1170g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1170g);
    }

    @Override // Y0.AbstractC0124s
    public final String toString() {
        return this.f1170g.toString();
    }
}
