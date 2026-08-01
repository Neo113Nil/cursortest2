package s1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class F extends E implements InterfaceC0338v {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f4013c;

    public F(Executor executor) {
        Method method;
        this.f4013c = executor;
        Method method2 = w1.c.f4493a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = w1.c.f4493a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f4013c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F) && ((F) obj).f4013c == this.f4013c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4013c);
    }

    @Override // s1.AbstractC0332o
    public final void r(b1.j jVar, Runnable runnable) {
        try {
            this.f4013c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            AbstractC0335s.a(jVar, cancellationException);
            AbstractC0341y.f4073b.r(jVar, runnable);
        }
    }

    @Override // s1.AbstractC0332o
    public final String toString() {
        return this.f4013c.toString();
    }
}
