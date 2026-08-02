package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

/* loaded from: classes3.dex */
public final class ChannelAsFlow extends ChannelFlow {
    public static final /* synthetic */ AtomicIntegerFieldUpdater consumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed$volatile");
    public final ReceiveChannel channel;
    public final boolean consume;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ ChannelAsFlow(ReceiveChannel receiveChannel, boolean z) {
        this(receiveChannel, z, EmptyCoroutineContext.INSTANCE, -3, BufferOverflow.SUSPEND);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String additionalToStringProps() {
        return "channel=" + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        if (this.capacity != -3) {
            Object collect = super.collect(flowCollector, continuation);
            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
        }
        boolean z = this.consume;
        if (z && consumed$volatile$FU.getAndSet(this, 1) == 1) {
            a$$ExternalSyntheticBUOutline0.m$1("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object emitAllImpl$FlowKt__ChannelsKt = FlowKt.emitAllImpl$FlowKt__ChannelsKt(flowCollector, this.channel, z, continuation);
        return emitAllImpl$FlowKt__ChannelsKt == CoroutineSingletons.COROUTINE_SUSPENDED ? emitAllImpl$FlowKt__ChannelsKt : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(ProducerScope producerScope, Continuation continuation) {
        Object emitAllImpl$FlowKt__ChannelsKt = FlowKt.emitAllImpl$FlowKt__ChannelsKt(new SendingCollector(producerScope), this.channel, this.consume, continuation);
        return emitAllImpl$FlowKt__ChannelsKt == CoroutineSingletons.COROUTINE_SUSPENDED ? emitAllImpl$FlowKt__ChannelsKt : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.channel, this.consume, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow dropChannelOperators() {
        return new ChannelAsFlow(this.channel, this.consume);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ReceiveChannel produceImpl(CoroutineScope coroutineScope) {
        if (!this.consume || consumed$volatile$FU.getAndSet(this, 1) != 1) {
            return this.capacity == -3 ? this.channel : super.produceImpl(coroutineScope);
        }
        a$$ExternalSyntheticBUOutline0.m$1("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public ChannelAsFlow(ReceiveChannel receiveChannel, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.channel = receiveChannel;
        this.consume = z;
    }
}
