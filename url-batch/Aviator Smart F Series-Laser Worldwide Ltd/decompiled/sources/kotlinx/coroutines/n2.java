package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes3.dex */
public abstract class n2 {
    public static final Object yield(kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        CoroutineContext context = cVar.getContext();
        o1.ensureActive(context);
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        kotlinx.coroutines.internal.k kVar = intercepted instanceof kotlinx.coroutines.internal.k ? (kotlinx.coroutines.internal.k) intercepted : null;
        if (kVar == null) {
            coroutine_suspended = y5.w.INSTANCE;
        } else {
            if (kVar.dispatcher.isDispatchNeeded(context)) {
                kVar.dispatchYield$kotlinx_coroutines_core(context, y5.w.INSTANCE);
            } else {
                m2 m2Var = new m2();
                CoroutineContext plus = context.plus(m2Var);
                y5.w wVar = y5.w.INSTANCE;
                kVar.dispatchYield$kotlinx_coroutines_core(plus, wVar);
                if (m2Var.dispatcherWasUnconfined) {
                    coroutine_suspended = kotlinx.coroutines.internal.l.yieldUndispatched(kVar) ? kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED() : wVar;
                }
            }
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        }
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == coroutine_suspended2) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return coroutine_suspended == coroutine_suspended3 ? coroutine_suspended : y5.w.INSTANCE;
    }
}
