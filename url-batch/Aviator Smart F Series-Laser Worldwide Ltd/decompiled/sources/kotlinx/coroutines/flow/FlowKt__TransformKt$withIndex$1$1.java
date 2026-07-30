package kotlinx.coroutines.flow;

import kotlin.collections.c0;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes5.dex */
final class FlowKt__TransformKt$withIndex$1$1 implements f {
    final /* synthetic */ Ref$IntRef $index;
    final /* synthetic */ f $this_unsafeFlow;

    FlowKt__TransformKt$withIndex$1$1(f fVar, Ref$IntRef ref$IntRef) {
        this.$this_unsafeFlow = fVar;
        this.$index = ref$IntRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) cVar;
            int i9 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__TransformKt$withIndex$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    f fVar = this.$this_unsafeFlow;
                    Ref$IntRef ref$IntRef = this.$index;
                    int i10 = ref$IntRef.element;
                    ref$IntRef.element = i10 + 1;
                    if (i10 < 0) {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                    c0 c0Var = new c0(i10, obj);
                    flowKt__TransformKt$withIndex$1$1$emit$1.label = 1;
                    if (fVar.emit(c0Var, flowKt__TransformKt$withIndex$1$1$emit$1) == coroutine_suspended) {
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
        flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, cVar);
        Object obj22 = flowKt__TransformKt$withIndex$1$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
