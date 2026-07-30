package kotlinx.coroutines.flow;

import kotlinx.coroutines.o1;

/* loaded from: classes5.dex */
final class CancellableFlowImpl$collect$2 implements f {
    final /* synthetic */ f $collector;

    CancellableFlowImpl$collect$2(f fVar) {
        this.$collector = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof CancellableFlowImpl$collect$2$emit$1) {
            cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) cVar;
            int i9 = cancellableFlowImpl$collect$2$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cancellableFlowImpl$collect$2$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = cancellableFlowImpl$collect$2$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = cancellableFlowImpl$collect$2$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    o1.ensureActive(cancellableFlowImpl$collect$2$emit$1.getContext());
                    f fVar = this.$collector;
                    cancellableFlowImpl$collect$2$emit$1.label = 1;
                    if (fVar.emit(obj, cancellableFlowImpl$collect$2$emit$1) == coroutine_suspended) {
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
        cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, cVar);
        Object obj22 = cancellableFlowImpl$collect$2$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = cancellableFlowImpl$collect$2$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
