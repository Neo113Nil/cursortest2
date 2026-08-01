package r1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class G extends F implements InterfaceC0372w {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f4042c;

    public G(Executor executor) {
        Method method;
        this.f4042c = executor;
        Method method2 = w1.c.f4468a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = w1.c.f4468a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // r1.AbstractC0366p
    public final void D(a1.i iVar, Runnable runnable) {
        try {
            this.f4042c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            AbstractC0369t.a(iVar, cancellationException);
            AbstractC0375z.f4101b.D(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f4042c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && ((G) obj).f4042c == this.f4042c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4042c);
    }

    @Override // r1.AbstractC0366p
    public final String toString() {
        return this.f4042c.toString();
    }
}
