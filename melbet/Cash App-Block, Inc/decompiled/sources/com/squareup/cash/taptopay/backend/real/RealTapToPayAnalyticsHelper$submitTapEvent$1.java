package com.squareup.cash.taptopay.backend.real;

import com.squareup.cash.cdf.taptopay.ScreenID;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealTapToPayAnalyticsHelper$submitTapEvent$1 extends ContinuationImpl {
    public String L$0;
    public ScreenID L$2;
    public Object L$3;
    public Analytics L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTapToPayAnalyticsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTapToPayAnalyticsHelper$submitTapEvent$1(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTapToPayAnalyticsHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.submitTapEvent(null, null, null, this);
    }
}
