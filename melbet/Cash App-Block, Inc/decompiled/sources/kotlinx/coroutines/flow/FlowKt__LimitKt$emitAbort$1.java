package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FlowKt__LimitKt$emitAbort$1 extends ContinuationImpl {
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        FlowKt.access$emitAbort$FlowKt__LimitKt(null, null, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
