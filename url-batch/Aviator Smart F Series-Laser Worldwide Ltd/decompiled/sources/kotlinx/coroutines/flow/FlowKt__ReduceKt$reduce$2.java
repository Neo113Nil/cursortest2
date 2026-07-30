package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
final class FlowKt__ReduceKt$reduce$2 implements f {
    final /* synthetic */ Ref$ObjectRef<Object> $accumulator;
    final /* synthetic */ f6.q $operation;

    FlowKt__ReduceKt$reduce$2(Ref$ObjectRef<Object> ref$ObjectRef, f6.q qVar) {
        this.$accumulator = ref$ObjectRef;
        this.$operation = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        T t7;
        if (cVar instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) cVar;
            int i9 = flowKt__ReduceKt$reduce$2$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$reduce$2$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ReduceKt$reduce$2$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    ref$ObjectRef = this.$accumulator;
                    Object obj3 = ref$ObjectRef.element;
                    t7 = obj;
                    if (obj3 != kotlinx.coroutines.flow.internal.l.NULL) {
                        f6.q qVar = this.$operation;
                        flowKt__ReduceKt$reduce$2$emit$1.L$0 = ref$ObjectRef;
                        flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                        Object invoke = qVar.invoke(obj3, obj, flowKt__ReduceKt$reduce$2$emit$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = invoke;
                        ref$ObjectRef2 = ref$ObjectRef;
                    }
                    ref$ObjectRef.element = t7;
                    return y5.w.INSTANCE;
                }
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef2 = (Ref$ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.L$0;
                y5.g.throwOnFailure(obj2);
                Object obj4 = obj2;
                ref$ObjectRef = ref$ObjectRef2;
                t7 = obj4;
                ref$ObjectRef.element = t7;
                return y5.w.INSTANCE;
            }
        }
        flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, cVar);
        Object obj22 = flowKt__ReduceKt$reduce$2$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ReduceKt$reduce$2$emit$1.label;
        if (i8 != 0) {
        }
        Object obj42 = obj22;
        ref$ObjectRef = ref$ObjectRef2;
        t7 = obj42;
        ref$ObjectRef.element = t7;
        return y5.w.INSTANCE;
    }
}
