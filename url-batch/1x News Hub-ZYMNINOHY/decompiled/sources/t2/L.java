package t2;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class L extends K implements A {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f10387c;

    public L(Executor executor) {
        Method method;
        this.f10387c = executor;
        Method method2 = y2.c.f10837a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = y2.c.f10837a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // t2.AbstractC1208s
    public final void c(d2.h hVar, Runnable runnable) {
        try {
            this.f10387c.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            U u3 = (U) hVar.h(C1209t.f10441b);
            if (u3 != null) {
                u3.b(cancellationException);
            }
            D.f10378b.c(hVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f10387c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof L) && ((L) obj).f10387c == this.f10387c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10387c);
    }

    @Override // t2.AbstractC1208s
    public final String toString() {
        return this.f10387c.toString();
    }
}
