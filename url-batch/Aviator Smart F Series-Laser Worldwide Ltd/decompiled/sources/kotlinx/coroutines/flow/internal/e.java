package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import y5.w;

/* loaded from: classes5.dex */
public final class e extends ChannelFlowOperator {
    public /* synthetic */ e(kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, int i9, kotlin.jvm.internal.o oVar) {
        this(eVar, (i9 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i9 & 4) != 0 ? -3 : i8, (i9 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow create(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return new e(this.flow, coroutineContext, i8, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.flow.e dropChannelOperators() {
        return this.flow;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    protected Object flowCollect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object collect = this.flow.collect(fVar, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : w.INSTANCE;
    }

    public e(kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        super(eVar, coroutineContext, i8, bufferOverflow);
    }
}
