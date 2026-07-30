package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ChannelFlow$collect$2 extends SuspendLambda implements p {
    final /* synthetic */ kotlinx.coroutines.flow.f $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelFlow$collect$2(kotlinx.coroutines.flow.f fVar, ChannelFlow channelFlow, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$collector = fVar;
        this.this$0 = channelFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, cVar);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            kotlinx.coroutines.flow.f fVar = this.$collector;
            ReceiveChannel produceImpl = this.this$0.produceImpl(i0Var);
            this.label = 1;
            if (kotlinx.coroutines.flow.g.emitAll(fVar, produceImpl, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
        }
        return w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
        return ((ChannelFlow$collect$2) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
