package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
final class FlowKt__TransformKt$runningFold$1$1 implements f {
    final /* synthetic */ Ref$ObjectRef<Object> $accumulator;
    final /* synthetic */ f6.q $operation;
    final /* synthetic */ f $this_unsafeFlow;

    FlowKt__TransformKt$runningFold$1$1(Ref$ObjectRef<Object> ref$ObjectRef, f6.q qVar, f fVar) {
        this.$accumulator = ref$ObjectRef;
        this.$operation = qVar;
        this.$this_unsafeFlow = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        Object coroutine_suspended;
        int i8;
        FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1;
        T t7;
        Ref$ObjectRef<Object> ref$ObjectRef;
        f fVar;
        Object obj2;
        if (cVar instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) cVar;
            int i9 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj3 = flowKt__TransformKt$runningFold$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj3);
                    Ref$ObjectRef<Object> ref$ObjectRef2 = this.$accumulator;
                    f6.q qVar = this.$operation;
                    Object obj4 = ref$ObjectRef2.element;
                    flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = this;
                    flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = ref$ObjectRef2;
                    flowKt__TransformKt$runningFold$1$1$emit$1.label = 1;
                    Object invoke = qVar.invoke(obj4, obj, flowKt__TransformKt$runningFold$1$1$emit$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__TransformKt$runningFold$1$1 = this;
                    t7 = invoke;
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.g.throwOnFailure(obj3);
                        return y5.w.INSTANCE;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.L$1;
                    flowKt__TransformKt$runningFold$1$1 = (FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.L$0;
                    y5.g.throwOnFailure(obj3);
                    t7 = obj3;
                }
                ref$ObjectRef.element = t7;
                fVar = flowKt__TransformKt$runningFold$1$1.$this_unsafeFlow;
                obj2 = flowKt__TransformKt$runningFold$1$1.$accumulator.element;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
                if (fVar.emit(obj2, flowKt__TransformKt$runningFold$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, cVar);
        Object obj32 = flowKt__TransformKt$runningFold$1$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
        if (i8 != 0) {
        }
        ref$ObjectRef.element = t7;
        fVar = flowKt__TransformKt$runningFold$1$1.$this_unsafeFlow;
        obj2 = flowKt__TransformKt$runningFold$1$1.$accumulator.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
        if (fVar.emit(obj2, flowKt__TransformKt$runningFold$1$1$emit$1) == coroutine_suspended) {
        }
        return y5.w.INSTANCE;
    }
}
