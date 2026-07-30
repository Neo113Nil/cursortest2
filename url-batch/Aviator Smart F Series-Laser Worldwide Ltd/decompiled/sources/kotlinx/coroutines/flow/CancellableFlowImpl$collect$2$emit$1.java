package kotlinx.coroutines.flow;

import com.realsil.sdk.dfu.DfuException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES}, m = "emit", n = {}, s = {})
/* loaded from: classes5.dex */
final class CancellableFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CancellableFlowImpl$collect$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancellableFlowImpl$collect$2$emit$1(CancellableFlowImpl$collect$2 cancellableFlowImpl$collect$2, kotlin.coroutines.c cVar) {
        super(cVar);
        this.this$0 = cancellableFlowImpl$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
