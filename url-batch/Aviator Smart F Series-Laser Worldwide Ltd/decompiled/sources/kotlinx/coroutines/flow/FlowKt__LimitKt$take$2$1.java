package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes5.dex */
final class FlowKt__LimitKt$take$2$1 implements f {
    final /* synthetic */ Ref$IntRef $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ f $this_unsafeFlow;

    FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i8, f fVar) {
        this.$consumed = ref$IntRef;
        this.$count = i8;
        this.$this_unsafeFlow = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        Object coroutine_suspended;
        int i8;
        Object emitAbort$FlowKt__LimitKt;
        if (cVar instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) cVar;
            int i9 = flowKt__LimitKt$take$2$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$take$2$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__LimitKt$take$2$1$emit$1.label;
                if (i8 == 0) {
                    if (i8 == 1) {
                        y5.g.throwOnFailure(obj2);
                        return y5.w.INSTANCE;
                    }
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj2);
                    return y5.w.INSTANCE;
                }
                y5.g.throwOnFailure(obj2);
                Ref$IntRef ref$IntRef = this.$consumed;
                int i10 = ref$IntRef.element + 1;
                ref$IntRef.element = i10;
                if (i10 < this.$count) {
                    f fVar = this.$this_unsafeFlow;
                    flowKt__LimitKt$take$2$1$emit$1.label = 1;
                    if (fVar.emit(obj, flowKt__LimitKt$take$2$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return y5.w.INSTANCE;
                }
                f fVar2 = this.$this_unsafeFlow;
                flowKt__LimitKt$take$2$1$emit$1.label = 2;
                emitAbort$FlowKt__LimitKt = FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(fVar2, obj, flowKt__LimitKt$take$2$1$emit$1);
                if (emitAbort$FlowKt__LimitKt == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, cVar);
        Object obj22 = flowKt__LimitKt$take$2$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__LimitKt$take$2$1$emit$1.label;
        if (i8 == 0) {
        }
    }
}
