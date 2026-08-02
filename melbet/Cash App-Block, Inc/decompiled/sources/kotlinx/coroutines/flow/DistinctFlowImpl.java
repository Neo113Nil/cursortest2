package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.CombineKt;

/* loaded from: classes3.dex */
public final class DistinctFlowImpl implements Flow {
    public final Function2 areEquivalent;
    public final Function1 keySelector;
    public final Flow upstream;

    public DistinctFlowImpl(Flow flow, Function1 function1, Function2 function2) {
        this.upstream = flow;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = CombineKt.NULL;
        Object collect = this.upstream.collect(new DistinctFlowImpl$collect$2(0, this, ref$ObjectRef, flowCollector), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }
}
