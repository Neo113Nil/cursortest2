package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1 implements f {
    final /* synthetic */ f6.p $predicate;

    public FlowKt__LimitKt$collectWhile$collector$1(f6.p pVar) {
        this.$predicate = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(T t7, kotlin.coroutines.c cVar) {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        Object obj;
        Object coroutine_suspended;
        int i8;
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1;
        if (cVar instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) cVar;
            int i9 = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.label = i9 - Integer.MIN_VALUE;
                obj = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    f6.p pVar = this.$predicate;
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0 = this;
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.label = 1;
                    obj = pVar.invoke(t7, flowKt__LimitKt$collectWhile$collector$1$emit$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__LimitKt$collectWhile$collector$1 = this;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__LimitKt$collectWhile$collector$1 = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, cVar);
        obj = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public Object emit$$forInline(T t7, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(4);
        new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, cVar);
        kotlin.jvm.internal.r.mark(5);
        if (((Boolean) this.$predicate.invoke(t7, cVar)).booleanValue()) {
            return y5.w.INSTANCE;
        }
        throw new AbortFlowException(this);
    }
}
