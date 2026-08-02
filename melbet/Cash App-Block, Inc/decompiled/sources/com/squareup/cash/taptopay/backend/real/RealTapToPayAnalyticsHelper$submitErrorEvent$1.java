package com.squareup.cash.taptopay.backend.real;

import com.squareup.cash.cdf.taptopay.ErrorType;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealTapToPayAnalyticsHelper$submitErrorEvent$1 extends ContinuationImpl {
    public String L$2;
    public ErrorType L$3;
    public Analytics L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTapToPayAnalyticsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTapToPayAnalyticsHelper$submitErrorEvent$1(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTapToPayAnalyticsHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.submitErrorEvent(null, null, null, this);
    }
}
