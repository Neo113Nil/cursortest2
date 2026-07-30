package kotlinx.coroutines.flow.internal;

import f6.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.x;

/* loaded from: classes5.dex */
public abstract class SafeCollectorKt {
    private static final q emitFun;

    static {
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt$emitFun$1.INSTANCE;
        s.checkNotNull(safeCollectorKt$emitFun$1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        emitFun = (q) x.beforeCheckcastToFunctionOfArity(safeCollectorKt$emitFun$1, 3);
    }

    private static /* synthetic */ void getEmitFun$annotations() {
    }
}
