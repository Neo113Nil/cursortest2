package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes5.dex */
final class FlowKt__LimitKt$drop$2$1 implements f {
    final /* synthetic */ int $count;
    final /* synthetic */ Ref$IntRef $skipped;
    final /* synthetic */ f $this_unsafeFlow;

    FlowKt__LimitKt$drop$2$1(Ref$IntRef ref$IntRef, int i8, f fVar) {
        this.$skipped = ref$IntRef;
        this.$count = i8;
        this.$this_unsafeFlow = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) cVar;
            int i9 = flowKt__LimitKt$drop$2$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__LimitKt$drop$2$1$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    Ref$IntRef ref$IntRef = this.$skipped;
                    int i10 = ref$IntRef.element;
                    if (i10 < this.$count) {
                        ref$IntRef.element = i10 + 1;
                        return y5.w.INSTANCE;
                    }
                    f fVar = this.$this_unsafeFlow;
                    flowKt__LimitKt$drop$2$1$emit$1.label = 1;
                    if (fVar.emit(obj, flowKt__LimitKt$drop$2$1$emit$1) == coroutine_suspended) {
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
        flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, cVar);
        Object obj22 = flowKt__LimitKt$drop$2$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__LimitKt$drop$2$1$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
