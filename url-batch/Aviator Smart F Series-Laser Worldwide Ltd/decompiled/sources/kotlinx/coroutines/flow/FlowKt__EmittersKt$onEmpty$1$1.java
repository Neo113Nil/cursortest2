package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes5.dex */
final class FlowKt__EmittersKt$onEmpty$1$1 implements f {
    final /* synthetic */ Ref$BooleanRef $isEmpty;
    final /* synthetic */ f $this_unsafeFlow;

    FlowKt__EmittersKt$onEmpty$1$1(Ref$BooleanRef ref$BooleanRef, f fVar) {
        this.$isEmpty = ref$BooleanRef;
        this.$this_unsafeFlow = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__EmittersKt$onEmpty$1$1$emit$1 flowKt__EmittersKt$onEmpty$1$1$emit$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof FlowKt__EmittersKt$onEmpty$1$1$emit$1) {
            flowKt__EmittersKt$onEmpty$1$1$emit$1 = (FlowKt__EmittersKt$onEmpty$1$1$emit$1) cVar;
            int i9 = flowKt__EmittersKt$onEmpty$1$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$onEmpty$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__EmittersKt$onEmpty$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__EmittersKt$onEmpty$1$1$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    this.$isEmpty.element = false;
                    f fVar = this.$this_unsafeFlow;
                    flowKt__EmittersKt$onEmpty$1$1$emit$1.label = 1;
                    if (fVar.emit(obj, flowKt__EmittersKt$onEmpty$1$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj2);
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__EmittersKt$onEmpty$1$1$emit$1 = new FlowKt__EmittersKt$onEmpty$1$1$emit$1(this, cVar);
        Object obj22 = flowKt__EmittersKt$onEmpty$1$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__EmittersKt$onEmpty$1$1$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
