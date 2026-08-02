package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class StateFlowImpl$collect$1 extends ContinuationImpl {
    public FlowCollector L$0;
    public StateFlowSlot L$1;
    public Job L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StateFlowImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl stateFlowImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = stateFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.collect(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
