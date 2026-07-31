package o2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import t2.AbstractC3432c;

/* renamed from: o2.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3342m0 extends AbstractC3340l0 implements T {

    /* renamed from: e, reason: collision with root package name */
    private final Executor f42088e;

    public C3342m0(Executor executor) {
        this.f42088e = executor;
        AbstractC3432c.a(p());
    }

    private final void U(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        AbstractC3367z0.c(coroutineContext, AbstractC3338k0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture V(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j4) {
        try {
            return scheduledExecutorService.schedule(runnable, j4, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            U(coroutineContext, e4);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor p4 = p();
        ExecutorService executorService = p4 instanceof ExecutorService ? (ExecutorService) p4 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // o2.T
    public void e(long j4, InterfaceC3343n interfaceC3343n) {
        long j5;
        Executor p4 = p();
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = p4 instanceof ScheduledExecutorService ? (ScheduledExecutorService) p4 : null;
        if (scheduledExecutorService != null) {
            j5 = j4;
            scheduledFuture = V(scheduledExecutorService, new O0(this, interfaceC3343n), interfaceC3343n.getContext(), j5);
        } else {
            j5 = j4;
        }
        if (scheduledFuture != null) {
            AbstractC3367z0.g(interfaceC3343n, scheduledFuture);
        } else {
            O.f42018j.e(j5, interfaceC3343n);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3342m0) && ((C3342m0) obj).p() == p();
    }

    @Override // o2.T
    public InterfaceC3320b0 f(long j4, Runnable runnable, CoroutineContext coroutineContext) {
        long j5;
        Runnable runnable2;
        CoroutineContext coroutineContext2;
        Executor p4 = p();
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = p4 instanceof ScheduledExecutorService ? (ScheduledExecutorService) p4 : null;
        if (scheduledExecutorService != null) {
            j5 = j4;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
            scheduledFuture = V(scheduledExecutorService, runnable2, coroutineContext2, j5);
        } else {
            j5 = j4;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
        }
        return scheduledFuture != null ? new C3318a0(scheduledFuture) : O.f42018j.f(j5, runnable2, coroutineContext2);
    }

    @Override // o2.AbstractC3313G
    public void g(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor p4 = p();
            AbstractC3321c.a();
            p4.execute(runnable);
        } catch (RejectedExecutionException e4) {
            AbstractC3321c.a();
            U(coroutineContext, e4);
            Z.b().g(coroutineContext, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(p());
    }

    @Override // o2.AbstractC3340l0
    public Executor p() {
        return this.f42088e;
    }

    @Override // o2.AbstractC3313G
    public String toString() {
        return p().toString();
    }
}
