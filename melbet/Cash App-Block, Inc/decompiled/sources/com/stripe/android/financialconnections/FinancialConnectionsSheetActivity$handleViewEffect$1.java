package com.stripe.android.financialconnections;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetActivity$handleViewEffect$1 extends ContinuationImpl {
    public FinancialConnectionsSheetViewEffect$FinishWithResult L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsSheetActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetActivity$handleViewEffect$1(FinancialConnectionsSheetActivity financialConnectionsSheetActivity, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialConnectionsSheetActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FinancialConnectionsSheetActivity.access$handleViewEffect(this.this$0, null, null, this);
    }
}
