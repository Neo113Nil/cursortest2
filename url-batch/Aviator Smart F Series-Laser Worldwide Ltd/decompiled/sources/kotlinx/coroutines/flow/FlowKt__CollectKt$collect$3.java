package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class FlowKt__CollectKt$collect$3 implements f {
    final /* synthetic */ f6.p $action;

    public FlowKt__CollectKt$collect$3(f6.p pVar) {
        this.$action = pVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(T t7, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object invoke = this.$action.invoke(t7, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : y5.w.INSTANCE;
    }

    public Object emit$$forInline(T t7, final kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collect$3.this.emit(null, this);
            }
        };
        kotlin.jvm.internal.r.mark(5);
        this.$action.invoke(t7, cVar);
        return y5.w.INSTANCE;
    }
}
