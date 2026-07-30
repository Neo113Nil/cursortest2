package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import y5.w;

/* loaded from: classes5.dex */
public abstract class ChannelFlowOperator extends ChannelFlow {
    protected final kotlinx.coroutines.flow.e flow;

    public ChannelFlowOperator(kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        super(coroutineContext, i8, bufferOverflow);
        this.flow = eVar;
    }

    static /* synthetic */ <S, T> Object collect$suspendImpl(ChannelFlowOperator channelFlowOperator, kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        if (channelFlowOperator.capacity == -3) {
            CoroutineContext context = cVar.getContext();
            CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(context, channelFlowOperator.context);
            if (s.areEqual(newCoroutineContext, context)) {
                Object flowCollect = channelFlowOperator.flowCollect(fVar, cVar);
                coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return flowCollect == coroutine_suspended3 ? flowCollect : w.INSTANCE;
            }
            d.b bVar = kotlin.coroutines.d.Key;
            if (s.areEqual(newCoroutineContext.get(bVar), context.get(bVar))) {
                Object collectWithContextUndispatched = channelFlowOperator.collectWithContextUndispatched(fVar, newCoroutineContext, cVar);
                coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return collectWithContextUndispatched == coroutine_suspended2 ? collectWithContextUndispatched : w.INSTANCE;
            }
        }
        Object collect = super.collect(fVar, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : w.INSTANCE;
    }

    static /* synthetic */ <S, T> Object collectTo$suspendImpl(ChannelFlowOperator channelFlowOperator, kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object flowCollect = channelFlowOperator.flowCollect(new m(jVar), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return flowCollect == coroutine_suspended ? flowCollect : w.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectWithContextUndispatched(kotlinx.coroutines.flow.f fVar, CoroutineContext coroutineContext, kotlin.coroutines.c cVar) {
        kotlinx.coroutines.flow.f withUndispatchedContextCollector;
        Object coroutine_suspended;
        withUndispatchedContextCollector = d.withUndispatchedContextCollector(fVar, cVar.getContext());
        Object withContextUndispatched$default = d.withContextUndispatched$default(coroutineContext, withUndispatchedContextCollector, null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), cVar, 4, null);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return withContextUndispatched$default == coroutine_suspended ? withContextUndispatched$default : w.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.internal.i, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        return collect$suspendImpl(this, fVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        return collectTo$suspendImpl(this, jVar, cVar);
    }

    protected abstract Object flowCollect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
