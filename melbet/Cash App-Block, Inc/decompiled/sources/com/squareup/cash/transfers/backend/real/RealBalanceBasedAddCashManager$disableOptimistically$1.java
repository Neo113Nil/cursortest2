package com.squareup.cash.transfers.backend.real;

import app.cash.api.ApiResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealBalanceBasedAddCashManager$disableOptimistically$1 extends ContinuationImpl {
    public ApiResult.Failure L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBalanceBasedAddCashManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBalanceBasedAddCashManager$disableOptimistically$1(RealBalanceBasedAddCashManager realBalanceBasedAddCashManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBalanceBasedAddCashManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.disableOptimistically(this);
    }
}
