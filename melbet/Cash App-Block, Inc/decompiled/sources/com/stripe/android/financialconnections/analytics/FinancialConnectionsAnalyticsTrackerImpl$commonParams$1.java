package com.stripe.android.financialconnections.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsAnalyticsTrackerImpl$commonParams$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsAnalyticsTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsAnalyticsTrackerImpl$commonParams$1(FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialConnectionsAnalyticsTrackerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FinancialConnectionsAnalyticsTrackerImpl.access$commonParams(this.this$0, this);
    }
}
