package kotlinx.coroutines.selects;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {TypedValues.TransitionType.TYPE_STAGGERED}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
/* loaded from: classes5.dex */
final class SelectImplementation$processResultAndInvokeBlockRecoveringException$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectImplementation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectImplementation$processResultAndInvokeBlockRecoveringException$1(SelectImplementation selectImplementation, kotlin.coroutines.c cVar) {
        super(cVar);
        this.this$0 = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processResultAndInvokeBlockRecoveringException;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processResultAndInvokeBlockRecoveringException = this.this$0.processResultAndInvokeBlockRecoveringException(null, null, this);
        return processResultAndInvokeBlockRecoveringException;
    }
}
