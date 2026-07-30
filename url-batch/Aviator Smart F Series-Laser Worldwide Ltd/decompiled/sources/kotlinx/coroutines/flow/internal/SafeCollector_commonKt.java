package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.l1;

/* loaded from: classes5.dex */
public abstract class SafeCollector_commonKt {
    public static final void checkContext(final SafeCollector<?> safeCollector, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new p() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (CoroutineContext.a) obj2);
            }

            public final Integer invoke(int i8, CoroutineContext.a aVar) {
                CoroutineContext.b key = aVar.getKey();
                CoroutineContext.a aVar2 = safeCollector.collectContext.get(key);
                if (key != l1.Key) {
                    return Integer.valueOf(aVar != aVar2 ? Integer.MIN_VALUE : i8 + 1);
                }
                l1 l1Var = (l1) aVar2;
                s.checkNotNull(aVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                l1 transitiveCoroutineParent = SafeCollector_commonKt.transitiveCoroutineParent((l1) aVar, l1Var);
                if (transitiveCoroutineParent == l1Var) {
                    if (l1Var != null) {
                        i8++;
                    }
                    return Integer.valueOf(i8);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + transitiveCoroutineParent + ", expected child of " + l1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final l1 transitiveCoroutineParent(l1 l1Var, l1 l1Var2) {
        while (l1Var != null) {
            if (l1Var == l1Var2) {
                return l1Var;
            }
            if (!(l1Var instanceof c0)) {
                return l1Var;
            }
            l1Var = l1Var.getParent();
        }
        return null;
    }

    public static final <T> kotlinx.coroutines.flow.e unsafeFlow(p pVar) {
        return new SafeCollector_commonKt$unsafeFlow$1(pVar);
    }
}
