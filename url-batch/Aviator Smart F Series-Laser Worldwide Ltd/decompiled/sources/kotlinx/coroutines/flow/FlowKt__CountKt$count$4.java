package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes5.dex */
final class FlowKt__CountKt$count$4 implements f {
    final /* synthetic */ Ref$IntRef $i;
    final /* synthetic */ f6.p $predicate;

    FlowKt__CountKt$count$4(f6.p pVar, Ref$IntRef ref$IntRef) {
        this.$predicate = pVar;
        this.$i = ref$IntRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
        Object obj2;
        Object coroutine_suspended;
        int i8;
        FlowKt__CountKt$count$4 flowKt__CountKt$count$4;
        if (cVar instanceof FlowKt__CountKt$count$4$emit$1) {
            flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) cVar;
            int i9 = flowKt__CountKt$count$4$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$4$emit$1.label = i9 - Integer.MIN_VALUE;
                obj2 = flowKt__CountKt$count$4$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__CountKt$count$4$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    f6.p pVar = this.$predicate;
                    flowKt__CountKt$count$4$emit$1.L$0 = this;
                    flowKt__CountKt$count$4$emit$1.label = 1;
                    obj2 = pVar.invoke(obj, flowKt__CountKt$count$4$emit$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__CountKt$count$4 = this;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__CountKt$count$4 = (FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.L$0;
                    y5.g.throwOnFailure(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    flowKt__CountKt$count$4.$i.element++;
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, cVar);
        obj2 = flowKt__CountKt$count$4$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__CountKt$count$4$emit$1.label;
        if (i8 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        return y5.w.INSTANCE;
    }
}
