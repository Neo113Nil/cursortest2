package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.i0;

/* loaded from: classes5.dex */
final class b extends ChannelFlow {
    private static final AtomicIntegerFieldUpdater consumed$FU = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed");
    private final ReceiveChannel channel;
    private final boolean consume;
    private volatile int consumed;

    public /* synthetic */ b(ReceiveChannel receiveChannel, boolean z7, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, int i9, kotlin.jvm.internal.o oVar) {
        this(receiveChannel, z7, (i9 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i9 & 8) != 0 ? -3 : i8, (i9 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final void markConsumed() {
        if (this.consume && consumed$FU.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected String additionalToStringProps() {
        return "channel=" + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.internal.i, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object emitAllImpl$FlowKt__ChannelsKt;
        Object coroutine_suspended2;
        if (this.capacity != -3) {
            Object collect = super.collect(fVar, cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
        }
        markConsumed();
        emitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(fVar, this.channel, this.consume, cVar);
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return emitAllImpl$FlowKt__ChannelsKt == coroutine_suspended2 ? emitAllImpl$FlowKt__ChannelsKt : y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        Object emitAllImpl$FlowKt__ChannelsKt;
        Object coroutine_suspended;
        emitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(new kotlinx.coroutines.flow.internal.m(jVar), this.channel, this.consume, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return emitAllImpl$FlowKt__ChannelsKt == coroutine_suspended ? emitAllImpl$FlowKt__ChannelsKt : y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow create(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return new b(this.channel, this.consume, coroutineContext, i8, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public e dropChannelOperators() {
        return new b(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel produceImpl(i0 i0Var) {
        markConsumed();
        return this.capacity == -3 ? this.channel : super.produceImpl(i0Var);
    }

    public b(ReceiveChannel receiveChannel, boolean z7, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        super(coroutineContext, i8, bufferOverflow);
        this.channel = receiveChannel;
        this.consume = z7;
        this.consumed = 0;
    }
}
