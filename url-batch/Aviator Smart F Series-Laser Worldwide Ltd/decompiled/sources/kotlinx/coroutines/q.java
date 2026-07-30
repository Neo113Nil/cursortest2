package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes3.dex */
public abstract class q {
    public static final void disposeOnCancellation(n nVar, u0 u0Var) {
        nVar.invokeOnCancellation(new v0(u0Var));
    }

    public static final <T> o getOrCreateCancellableContinuation(kotlin.coroutines.c cVar) {
        if (!(cVar instanceof kotlinx.coroutines.internal.k)) {
            return new o(cVar, 1);
        }
        o claimReusableCancellableContinuation$kotlinx_coroutines_core = ((kotlinx.coroutines.internal.k) cVar).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!claimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                claimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return claimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new o(cVar, 2);
    }

    public static final <T> Object suspendCancellableCoroutine(f6.l lVar, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        lVar.invoke(oVar);
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result;
    }

    private static final <T> Object suspendCancellableCoroutine$$forInline(f6.l lVar, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        kotlin.jvm.internal.r.mark(0);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        lVar.invoke(oVar);
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        kotlin.jvm.internal.r.mark(1);
        return result;
    }

    public static final <T> Object suspendCancellableCoroutineReusable(f6.l lVar, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o orCreateCancellableContinuation = getOrCreateCancellableContinuation(intercepted);
        try {
            lVar.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (result == coroutine_suspended) {
                kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private static final <T> Object suspendCancellableCoroutineReusable$$forInline(f6.l lVar, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        kotlin.jvm.internal.r.mark(0);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o orCreateCancellableContinuation = getOrCreateCancellableContinuation(intercepted);
        try {
            lVar.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (result == coroutine_suspended) {
                kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
            }
            kotlin.jvm.internal.r.mark(1);
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
