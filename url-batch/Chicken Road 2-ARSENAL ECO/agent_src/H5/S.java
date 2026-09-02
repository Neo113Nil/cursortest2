package H5;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class S extends Q implements C {

    /* renamed from: h, reason: collision with root package name */
    public final Executor f1047h;

    public S(Executor executor) {
        Method method;
        this.f1047h = executor;
        Method method2 = M5.c.f1589a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = M5.c.f1589a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // H5.AbstractC0161v
    public final void F(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        try {
            this.f1047h.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            X x6 = (X) interfaceC0569i.m(C0162w.f1110g);
            if (x6 != null) {
                x6.d(cancellationException);
            }
            F.f1029c.F(interfaceC0569i, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f1047h;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // H5.C
    public final void e(long j4, C0147g c0147g) {
        Executor executor = this.f1047h;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            A.a aVar = new A.a(this, 2, c0147g);
            InterfaceC0569i interfaceC0569i = c0147g.f1079j;
            try {
                scheduledFuture = scheduledExecutorService.schedule(aVar, j4, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e4);
                X x6 = (X) interfaceC0569i.m(C0162w.f1110g);
                if (x6 != null) {
                    x6.d(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0147g.t(new C0145e(0, scheduledFuture));
        } else {
            A.f1022o.e(j4, c0147g);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof S) && ((S) obj).f1047h == this.f1047h;
    }

    @Override // H5.C
    public final H g(long j4, s0 s0Var, InterfaceC0569i interfaceC0569i) {
        Executor executor = this.f1047h;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(s0Var, j4, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e4);
                X x6 = (X) interfaceC0569i.m(C0162w.f1110g);
                if (x6 != null) {
                    x6.d(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new G(scheduledFuture) : A.f1022o.g(j4, s0Var, interfaceC0569i);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1047h);
    }

    @Override // H5.AbstractC0161v
    public final String toString() {
        return this.f1047h.toString();
    }
}
