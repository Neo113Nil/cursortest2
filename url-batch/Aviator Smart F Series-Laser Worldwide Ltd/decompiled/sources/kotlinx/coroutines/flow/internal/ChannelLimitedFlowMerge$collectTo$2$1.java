package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.i0;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ChannelLimitedFlowMerge$collectTo$2$1 extends SuspendLambda implements p {
    final /* synthetic */ m $collector;
    final /* synthetic */ kotlinx.coroutines.flow.e $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelLimitedFlowMerge$collectTo$2$1(kotlinx.coroutines.flow.e eVar, m mVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$flow = eVar;
        this.$collector = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.$flow, this.$collector, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            kotlinx.coroutines.flow.e eVar = this.$flow;
            m mVar = this.$collector;
            this.label = 1;
            if (eVar.collect(mVar, this) == coroutine_suspended) {
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
        return ((ChannelLimitedFlowMerge$collectTo$2$1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
