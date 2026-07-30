package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class j0 {
    public static final i0 CoroutineScope(CoroutineContext coroutineContext) {
        z m1298Job$default;
        if (coroutineContext.get(l1.Key) == null) {
            m1298Job$default = q1.m1298Job$default((l1) null, 1, (Object) null);
            coroutineContext = coroutineContext.plus(m1298Job$default);
        }
        return new kotlinx.coroutines.internal.g(coroutineContext);
    }

    public static final i0 MainScope() {
        return new kotlinx.coroutines.internal.g(f2.m1260SupervisorJob$default((l1) null, 1, (Object) null).plus(t0.getMain()));
    }

    public static final void cancel(i0 i0Var, CancellationException cancellationException) {
        l1 l1Var = (l1) i0Var.getCoroutineContext().get(l1.Key);
        if (l1Var != null) {
            l1Var.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + i0Var).toString());
    }

    public static /* synthetic */ void cancel$default(i0 i0Var, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        cancel(i0Var, cancellationException);
    }

    public static final <R> Object coroutineScope(f6.p pVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        kotlinx.coroutines.internal.c0 c0Var = new kotlinx.coroutines.internal.c0(cVar.getContext(), cVar);
        Object startUndispatchedOrReturn = l6.b.startUndispatchedOrReturn(c0Var, c0Var, pVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (startUndispatchedOrReturn == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return startUndispatchedOrReturn;
    }

    public static final Object currentCoroutineContext(kotlin.coroutines.c cVar) {
        return cVar.getContext();
    }

    private static final Object currentCoroutineContext$$forInline(kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(3);
        throw null;
    }

    public static final void ensureActive(i0 i0Var) {
        o1.ensureActive(i0Var.getCoroutineContext());
    }

    public static final boolean isActive(i0 i0Var) {
        l1 l1Var = (l1) i0Var.getCoroutineContext().get(l1.Key);
        if (l1Var != null) {
            return l1Var.isActive();
        }
        return true;
    }

    public static /* synthetic */ void isActive$annotations(i0 i0Var) {
    }

    public static final i0 plus(i0 i0Var, CoroutineContext coroutineContext) {
        return new kotlinx.coroutines.internal.g(i0Var.getCoroutineContext().plus(coroutineContext));
    }

    public static /* synthetic */ void cancel$default(i0 i0Var, String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        cancel(i0Var, str, th);
    }

    public static final void cancel(i0 i0Var, String str, Throwable th) {
        cancel(i0Var, d1.CancellationException(str, th));
    }
}
