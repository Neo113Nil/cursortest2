package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    public SafeCollector L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SubscribedFlowCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(SubscribedFlowCollector subscribedFlowCollector, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = subscribedFlowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onSubscription(this);
    }
}
