package kotlinx.coroutines.flow;

import com.squareup.util.compose.StateFlowKt$receiveValueAsState$1$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FlowKt__ReduceKt$firstOrNull$1 extends ContinuationImpl {
    public Ref$ObjectRef L$1;
    public StateFlowKt$receiveValueAsState$1$1$1 L$3;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$firstOrNull$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FlowKt.firstOrNull(null, this);
    }
}
