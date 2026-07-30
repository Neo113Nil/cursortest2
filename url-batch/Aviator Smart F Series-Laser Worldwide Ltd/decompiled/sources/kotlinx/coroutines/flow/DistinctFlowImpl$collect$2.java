package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
final class DistinctFlowImpl$collect$2 implements f {
    final /* synthetic */ f $collector;
    final /* synthetic */ Ref$ObjectRef<Object> $previousKey;
    final /* synthetic */ DistinctFlowImpl this$0;

    DistinctFlowImpl$collect$2(DistinctFlowImpl distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, f fVar) {
        this.this$0 = distinctFlowImpl;
        this.$previousKey = ref$ObjectRef;
        this.$collector = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) cVar;
            int i9 = distinctFlowImpl$collect$2$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = distinctFlowImpl$collect$2$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = distinctFlowImpl$collect$2$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    ?? invoke = this.this$0.keySelector.invoke(obj);
                    Object obj3 = this.$previousKey.element;
                    if (obj3 != kotlinx.coroutines.flow.internal.l.NULL && ((Boolean) this.this$0.areEquivalent.invoke(obj3, invoke)).booleanValue()) {
                        return y5.w.INSTANCE;
                    }
                    this.$previousKey.element = invoke;
                    f fVar = this.$collector;
                    distinctFlowImpl$collect$2$emit$1.label = 1;
                    if (fVar.emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutine_suspended) {
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
        distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, cVar);
        Object obj22 = distinctFlowImpl$collect$2$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = distinctFlowImpl$collect$2$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
