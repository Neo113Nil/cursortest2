package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes3.dex */
public final class SafeFlow extends AbstractFlow {
    public final Function2 block;

    public SafeFlow(Function2 function2) {
        this.block = function2;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public final Object collectSafely(SafeCollector safeCollector, AbstractFlow$collect$1 abstractFlow$collect$1) {
        Object invoke = this.block.invoke(safeCollector, abstractFlow$collect$1);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : Unit.INSTANCE;
    }
}
