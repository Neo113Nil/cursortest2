package x3;

import f3.InterfaceC0430h;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: x3.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536K extends AbstractC1535J implements InterfaceC1565z {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16000c;

    public C1536K(Executor executor) {
        Method method;
        this.f16000c = executor;
        Method method2 = C3.c.f286a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = C3.c.f286a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f16000c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1536K) && ((C1536K) obj).f16000c == this.f16000c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f16000c);
    }

    @Override // x3.AbstractC1558s
    public final void s(InterfaceC0430h interfaceC0430h, Runnable runnable) {
        try {
            this.f16000c.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            T t4 = (T) interfaceC0430h.n(C1559t.f16059b);
            if (t4 != null) {
                t4.b(cancellationException);
            }
            AbstractC1528C.f15990b.s(interfaceC0430h, runnable);
        }
    }

    @Override // x3.AbstractC1558s
    public final String toString() {
        return this.f16000c.toString();
    }
}
