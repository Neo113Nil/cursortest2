package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
final class FlowKt__ErrorsKt$catchImpl$2 implements f {
    final /* synthetic */ f $collector;
    final /* synthetic */ Ref$ObjectRef<Throwable> $fromDownstream;

    FlowKt__ErrorsKt$catchImpl$2(f fVar, Ref$ObjectRef<Throwable> ref$ObjectRef) {
        this.$collector = fVar;
        this.$fromDownstream = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        Object coroutine_suspended;
        int i8;
        FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2;
        if (cVar instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) cVar;
            int i9 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    try {
                        f fVar = this.$collector;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.L$0 = this;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.label = 1;
                        if (fVar.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        flowKt__ErrorsKt$catchImpl$2 = this;
                        flowKt__ErrorsKt$catchImpl$2.$fromDownstream.element = th;
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__ErrorsKt$catchImpl$2 = (FlowKt__ErrorsKt$catchImpl$2) flowKt__ErrorsKt$catchImpl$2$emit$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        flowKt__ErrorsKt$catchImpl$2.$fromDownstream.element = th;
                        throw th;
                    }
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, cVar);
        Object obj22 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
