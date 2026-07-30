package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class i {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static final <T> n0 async(i0 i0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, f6.p pVar) {
        CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(i0Var, coroutineContext);
        o0 t1Var = coroutineStart.isLazy() ? new t1(newCoroutineContext, pVar) : new o0(newCoroutineContext, true);
        t1Var.start(coroutineStart, t1Var, pVar);
        return t1Var;
    }

    public static /* synthetic */ n0 async$default(i0 i0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, f6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i8 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return g.async(i0Var, coroutineContext, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, f6.p pVar, kotlin.coroutines.c cVar) {
        return g.withContext(coroutineDispatcher, pVar, cVar);
    }

    private static final <T> Object invoke$$forInline(CoroutineDispatcher coroutineDispatcher, f6.p pVar, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(0);
        Object withContext = g.withContext(coroutineDispatcher, pVar, cVar);
        kotlin.jvm.internal.r.mark(1);
        return withContext;
    }

    public static final l1 launch(i0 i0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, f6.p pVar) {
        CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(i0Var, coroutineContext);
        a u1Var = coroutineStart.isLazy() ? new u1(newCoroutineContext, pVar) : new c2(newCoroutineContext, true);
        u1Var.start(coroutineStart, u1Var, pVar);
        return u1Var;
    }

    public static /* synthetic */ l1 launch$default(i0 i0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, f6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i8 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return g.launch(i0Var, coroutineContext, coroutineStart, pVar);
    }

    public static final <T> Object withContext(CoroutineContext coroutineContext, f6.p pVar, kotlin.coroutines.c cVar) {
        Object result$kotlinx_coroutines_core;
        Object coroutine_suspended;
        CoroutineContext context = cVar.getContext();
        CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(context, coroutineContext);
        o1.ensureActive(newCoroutineContext);
        if (newCoroutineContext == context) {
            kotlinx.coroutines.internal.c0 c0Var = new kotlinx.coroutines.internal.c0(newCoroutineContext, cVar);
            result$kotlinx_coroutines_core = l6.b.startUndispatchedOrReturn(c0Var, c0Var, pVar);
        } else {
            d.b bVar = kotlin.coroutines.d.Key;
            if (kotlin.jvm.internal.s.areEqual(newCoroutineContext.get(bVar), context.get(bVar))) {
                j2 j2Var = new j2(newCoroutineContext, cVar);
                CoroutineContext context2 = j2Var.getContext();
                Object updateThreadContext = ThreadContextKt.updateThreadContext(context2, null);
                try {
                    Object startUndispatchedOrReturn = l6.b.startUndispatchedOrReturn(j2Var, j2Var, pVar);
                    ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                    result$kotlinx_coroutines_core = startUndispatchedOrReturn;
                } catch (Throwable th) {
                    ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                    throw th;
                }
            } else {
                q0 q0Var = new q0(newCoroutineContext, cVar);
                l6.a.startCoroutineCancellable$default(pVar, q0Var, q0Var, null, 4, null);
                result$kotlinx_coroutines_core = q0Var.getResult$kotlinx_coroutines_core();
            }
        }
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result$kotlinx_coroutines_core == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return result$kotlinx_coroutines_core;
    }
}
