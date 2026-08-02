package com.squareup.cash.treehouse.financialservices;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1(FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService financialServicesBridge$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialServicesBridge$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.saveUserViewedDirectDepositUpsell(null, this);
    }
}
