package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.g2;

/* loaded from: classes5.dex */
public abstract class ThreadContextKt {
    public static final g0 NO_THREAD_ELEMENTS = new g0("NO_THREAD_ELEMENTS");
    private static final f6.p countAll = new f6.p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // f6.p
        public final Object invoke(Object obj, CoroutineContext.a aVar) {
            if (!(aVar instanceof g2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    };
    private static final f6.p findOne = new f6.p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // f6.p
        public final g2 invoke(g2 g2Var, CoroutineContext.a aVar) {
            if (g2Var != null) {
                return g2Var;
            }
            if (aVar instanceof g2) {
                return (g2) aVar;
            }
            return null;
        }
    };
    private static final f6.p updateState = new f6.p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // f6.p
        public final n0 invoke(n0 n0Var, CoroutineContext.a aVar) {
            if (aVar instanceof g2) {
                g2 g2Var = (g2) aVar;
                n0Var.append(g2Var, g2Var.d(n0Var.context));
            }
            return n0Var;
        }
    };

    public static final void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof n0) {
            ((n0) obj).restore(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, findOne);
        kotlin.jvm.internal.s.checkNotNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((g2) fold).b(coroutineContext, obj);
    }

    public static final Object threadContextElements(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, countAll);
        kotlin.jvm.internal.s.checkNotNull(fold);
        return fold;
    }

    public static final Object updateThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = threadContextElements(coroutineContext);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new n0(coroutineContext, ((Number) obj).intValue()), updateState);
        }
        kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((g2) obj).d(coroutineContext);
    }
}
