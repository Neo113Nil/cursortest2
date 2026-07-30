package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;
import y5.w;

/* loaded from: classes5.dex */
public final class ChannelLimitedFlowMerge extends ChannelFlow {
    private final Iterable<kotlinx.coroutines.flow.e> flows;

    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, int i9, kotlin.jvm.internal.o oVar) {
        this(iterable, (i9 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        m mVar = new m(jVar);
        Iterator<kotlinx.coroutines.flow.e> it = this.flows.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.i.launch$default(jVar, null, null, new ChannelLimitedFlowMerge$collectTo$2$1(it.next(), mVar, null), 3, null);
        }
        return w.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow create(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.flows, coroutineContext, i8, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel produceImpl(i0 i0Var) {
        return ProduceKt.produce(i0Var, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelLimitedFlowMerge(Iterable<? extends kotlinx.coroutines.flow.e> iterable, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        super(coroutineContext, i8, bufferOverflow);
        this.flows = iterable;
    }
}
