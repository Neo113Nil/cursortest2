package k1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e0 extends d0 implements w {

    /* renamed from: d, reason: collision with root package name */
    public final Executor f677d;

    public e0(Executor executor) {
        Method method;
        this.f677d = executor;
        Method method2 = p1.c.f1040a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = p1.c.f1040a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // k1.p
    public final void b(v0.h hVar, Runnable runnable) {
        try {
            this.f677d.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            q0 q0Var = (q0) hVar.j(q.f713c);
            if (q0Var != null) {
                q0Var.g(cancellationException);
            }
            y.f734b.b(hVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f677d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e0) && ((e0) obj).f677d == this.f677d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f677d);
    }

    @Override // k1.p
    public final String toString() {
        return this.f677d.toString();
    }
}
