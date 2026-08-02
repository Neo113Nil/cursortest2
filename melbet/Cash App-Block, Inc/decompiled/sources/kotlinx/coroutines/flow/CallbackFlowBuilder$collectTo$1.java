package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ProducerScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {
    public ProducerScope L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CallbackFlowBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder callbackFlowBuilder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = callbackFlowBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.collectTo(null, this);
    }
}
