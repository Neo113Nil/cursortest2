package com.squareup.cash.treehouse.android.apps.financialservices;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFinancialServicesBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1(RealFinancialServicesBridge realFinancialServicesBridge, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFinancialServicesBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.saveUserViewedDirectDepositUpsell(null, this);
    }
}
