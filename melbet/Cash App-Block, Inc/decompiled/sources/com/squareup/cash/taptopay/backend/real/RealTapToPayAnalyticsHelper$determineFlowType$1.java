package com.squareup.cash.taptopay.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealTapToPayAnalyticsHelper$determineFlowType$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTapToPayAnalyticsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTapToPayAnalyticsHelper$determineFlowType$1(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTapToPayAnalyticsHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.determineFlowType(null, this);
    }
}
