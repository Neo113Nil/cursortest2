package kotlinx.coroutines.flow;

import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FlowKt__ReduceKt$first$3 extends ContinuationImpl {
    public Ref$ObjectRef L$2;
    public CashCdpConfigProvider$1$2 L$4;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FlowKt.first(null, null, this);
    }
}
