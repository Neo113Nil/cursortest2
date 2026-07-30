package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1 implements f {
    final /* synthetic */ f $this_unsafeFlow;
    final /* synthetic */ f6.q $transform;

    public FlowKt__EmittersKt$unsafeTransform$1$1(f6.q qVar, f fVar) {
        this.$transform = qVar;
        this.$this_unsafeFlow = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 flowKt__EmittersKt$unsafeTransform$1$1$emit$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = (FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) cVar;
            int i9 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    f6.q qVar = this.$transform;
                    f fVar = this.$this_unsafeFlow;
                    flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label = 1;
                    if (qVar.invoke(fVar, obj, flowKt__EmittersKt$unsafeTransform$1$1$emit$1) == coroutine_suspended) {
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
        flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, cVar);
        Object obj22 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    public final Object emit$$forInline(Object obj, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(4);
        new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, cVar);
        kotlin.jvm.internal.r.mark(5);
        this.$transform.invoke(this.$this_unsafeFlow, obj, cVar);
        return y5.w.INSTANCE;
    }
}
