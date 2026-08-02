package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwn extends kwm implements kvu {
    private final Executor a;

    public kwn(Executor executor) {
        Method method;
        this.a = executor;
        Method method2 = lbv.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = lbv.a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
        } catch (Throwable unused) {
        }
    }

    private static final void i(kqn kqnVar, RejectedExecutionException rejectedExecutionException) {
        ixi.h(kqnVar, ixh.c("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture j(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kqn kqnVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            i(kqnVar, e);
            return null;
        }
    }

    @Override // defpackage.kvj
    public final void a(kqn kqnVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            i(kqnVar, e);
            kvj kvjVar = kwa.a;
            ldm.a.a(kqnVar, runnable);
        }
    }

    @Override // defpackage.kvu
    public final void c(long j, kuv kuvVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture j2 = scheduledExecutorService != null ? j(scheduledExecutorService, new auf((kvj) this, kuvVar, 4), ((kuw) kuvVar).b, j) : null;
        if (j2 != null) {
            ((kuw) kuvVar).z(new kut(j2, 1));
        } else {
            kvq.a.c(j, kuvVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.kwm
    public final Executor e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kwn) && ((kwn) obj).a == this.a;
    }

    @Override // defpackage.kvu
    public final kwc h(long j, Runnable runnable, kqn kqnVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture j2 = scheduledExecutorService != null ? j(scheduledExecutorService, runnable, kqnVar, j) : null;
        return j2 != null ? new kwb(j2) : kvq.a.t(j, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.kvj
    public final String toString() {
        return this.a.toString();
    }
}
