package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final class ChannelFlowOperatorImpl extends ChannelFlowOperator {
    public ChannelFlowOperatorImpl(int i, int i2, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow, flow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowOperatorImpl(i, coroutineContext, bufferOverflow, this.flow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow dropChannelOperators() {
        return this.flow;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public final Object flowCollect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.flow.collect(flowCollector, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }
}
