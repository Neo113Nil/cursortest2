package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.sync.SemaphoreKt;
import y5.w;

/* loaded from: classes5.dex */
public final class ChannelFlowMerge extends ChannelFlow {
    private final int concurrency;
    private final kotlinx.coroutines.flow.e flow;

    public /* synthetic */ ChannelFlowMerge(kotlinx.coroutines.flow.e eVar, int i8, CoroutineContext coroutineContext, int i9, BufferOverflow bufferOverflow, int i10, kotlin.jvm.internal.o oVar) {
        this(eVar, i8, (i10 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i10 & 8) != 0 ? -2 : i9, (i10 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected String additionalToStringProps() {
        return "concurrency=" + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object collect = this.flow.collect(new ChannelFlowMerge$collectTo$2((l1) cVar.getContext().get(l1.Key), SemaphoreKt.Semaphore$default(this.concurrency, 0, 2, null), jVar, new m(jVar)), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : w.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow create(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.flow, this.concurrency, coroutineContext, i8, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel produceImpl(i0 i0Var) {
        return ProduceKt.produce(i0Var, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    public ChannelFlowMerge(kotlinx.coroutines.flow.e eVar, int i8, CoroutineContext coroutineContext, int i9, BufferOverflow bufferOverflow) {
        super(coroutineContext, i9, bufferOverflow);
        this.flow = eVar;
        this.concurrency = i8;
    }
}
