package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ChannelFlowKt$withContextUndispatched$1 extends ContinuationImpl {
    public CoroutineContext L$0;
    public Object L$1;
    public CoroutineContext L$4;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CombineKt.withContextUndispatched(null, null, null, null, this);
    }
}
