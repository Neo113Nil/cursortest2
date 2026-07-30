package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$fold$2 implements f {
    final /* synthetic */ Ref$ObjectRef<Object> $accumulator;
    final /* synthetic */ f6.q $operation;

    public FlowKt__ReduceKt$fold$2(Ref$ObjectRef<Object> ref$ObjectRef, f6.q qVar) {
        this.$accumulator = ref$ObjectRef;
        this.$operation = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
        Object coroutine_suspended;
        int i8;
        T t7;
        Ref$ObjectRef<Object> ref$ObjectRef;
        if (cVar instanceof FlowKt__ReduceKt$fold$2$emit$1) {
            flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) cVar;
            int i9 = flowKt__ReduceKt$fold$2$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$2$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$fold$2$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$fold$2$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    Ref$ObjectRef<Object> ref$ObjectRef2 = this.$accumulator;
                    f6.q qVar = this.$operation;
                    Object obj3 = ref$ObjectRef2.element;
                    flowKt__ReduceKt$fold$2$emit$1.L$0 = ref$ObjectRef2;
                    flowKt__ReduceKt$fold$2$emit$1.label = 1;
                    Object invoke = qVar.invoke(obj3, obj, flowKt__ReduceKt$fold$2$emit$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    t7 = invoke;
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$fold$2$emit$1.L$0;
                    y5.g.throwOnFailure(obj2);
                    t7 = obj2;
                }
                ref$ObjectRef.element = t7;
                return y5.w.INSTANCE;
            }
        }
        flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, cVar);
        Object obj22 = flowKt__ReduceKt$fold$2$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$fold$2$emit$1.label;
        if (i8 != 0) {
        }
        ref$ObjectRef.element = t7;
        return y5.w.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
    public final Object emit$$forInline(Object obj, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(4);
        new FlowKt__ReduceKt$fold$2$emit$1(this, cVar);
        kotlin.jvm.internal.r.mark(5);
        Ref$ObjectRef<Object> ref$ObjectRef = this.$accumulator;
        ref$ObjectRef.element = this.$operation.invoke(ref$ObjectRef.element, obj, cVar);
        return y5.w.INSTANCE;
    }
}
