package kotlinx.coroutines.flow.internal;

import f6.p;
import f6.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.i0;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements p {
    final /* synthetic */ q $block;
    final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowCoroutineKt$scopedFlow$1$1(q qVar, kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$block = qVar;
        this.$this_unsafeFlow = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.$block, this.$this_unsafeFlow, cVar);
        flowCoroutineKt$scopedFlow$1$1.L$0 = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            q qVar = this.$block;
            kotlinx.coroutines.flow.f fVar = this.$this_unsafeFlow;
            this.label = 1;
            if (qVar.invoke(i0Var, fVar, this) == coroutine_suspended) {
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
        return ((FlowCoroutineKt$scopedFlow$1$1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
