package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class o1 {
    /* renamed from: Job, reason: collision with other method in class */
    public static final z m1295Job(l1 l1Var) {
        return q1.m1297Job(l1Var);
    }

    public static final Object cancelAndJoin(l1 l1Var, kotlin.coroutines.c cVar) {
        return q1.cancelAndJoin(l1Var, cVar);
    }

    public static final void cancelFutureOnCancellation(n nVar, Future<?> future) {
        p1.cancelFutureOnCancellation(nVar, future);
    }

    public static final u0 cancelFutureOnCompletion(l1 l1Var, Future<?> future) {
        return p1.cancelFutureOnCompletion(l1Var, future);
    }

    public static final u0 disposeOnCompletion(l1 l1Var, u0 u0Var) {
        return q1.disposeOnCompletion(l1Var, u0Var);
    }

    public static final void ensureActive(CoroutineContext coroutineContext) {
        q1.ensureActive(coroutineContext);
    }

    public static final l1 getJob(CoroutineContext coroutineContext) {
        return q1.getJob(coroutineContext);
    }

    public static final boolean isActive(CoroutineContext coroutineContext) {
        return q1.isActive(coroutineContext);
    }

    public static final void cancel(CoroutineContext coroutineContext, CancellationException cancellationException) {
        q1.cancel(coroutineContext, cancellationException);
    }

    public static final void ensureActive(l1 l1Var) {
        q1.ensureActive(l1Var);
    }

    public static final void cancel(l1 l1Var, String str, Throwable th) {
        q1.cancel(l1Var, str, th);
    }

    public static final void cancelChildren(CoroutineContext coroutineContext, CancellationException cancellationException) {
        q1.cancelChildren(coroutineContext, cancellationException);
    }

    public static final void cancelChildren(l1 l1Var, CancellationException cancellationException) {
        q1.cancelChildren(l1Var, cancellationException);
    }
}
