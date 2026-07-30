package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {131, 133}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class FlowKt__TransformKt$runningReduce$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__TransformKt$runningReduce$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__TransformKt$runningReduce$1$1$emit$1(FlowKt__TransformKt$runningReduce$1$1 flowKt__TransformKt$runningReduce$1$1, kotlin.coroutines.c cVar) {
        super(cVar);
        this.this$0 = flowKt__TransformKt$runningReduce$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
