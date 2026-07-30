package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
final class FlowKt__MergeKt$flattenConcat$1$1 implements f {
    final /* synthetic */ f $this_unsafeFlow;

    FlowKt__MergeKt$flattenConcat$1$1(f fVar) {
        this.$this_unsafeFlow = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(e eVar, kotlin.coroutines.c cVar) {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1) cVar;
            int i9 = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    f fVar = this.$this_unsafeFlow;
                    flowKt__MergeKt$flattenConcat$1$1$emit$1.label = 1;
                    if (g.emitAll(fVar, eVar, flowKt__MergeKt$flattenConcat$1$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, cVar);
        Object obj2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
