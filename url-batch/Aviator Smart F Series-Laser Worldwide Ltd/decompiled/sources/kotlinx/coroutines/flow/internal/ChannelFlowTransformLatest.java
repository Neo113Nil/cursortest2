package kotlinx.coroutines.flow.internal;

import f6.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.j0;
import y5.w;

/* loaded from: classes5.dex */
public final class ChannelFlowTransformLatest extends ChannelFlowOperator {
    private final q transform;

    public /* synthetic */ ChannelFlowTransformLatest(q qVar, kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, int i9, kotlin.jvm.internal.o oVar) {
        this(qVar, eVar, (i9 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i9 & 8) != 0 ? -2 : i8, (i9 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow create(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.transform, this.flow, coroutineContext, i8, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    protected Object flowCollect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object coroutineScope = j0.coroutineScope(new ChannelFlowTransformLatest$flowCollect$3(this, fVar, null), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return coroutineScope == coroutine_suspended ? coroutineScope : w.INSTANCE;
    }

    public ChannelFlowTransformLatest(q qVar, kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        super(eVar, coroutineContext, i8, bufferOverflow);
        this.transform = qVar;
    }
}
