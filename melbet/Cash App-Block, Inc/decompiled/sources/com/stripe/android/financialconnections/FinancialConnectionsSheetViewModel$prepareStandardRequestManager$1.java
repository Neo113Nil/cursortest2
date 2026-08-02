package com.stripe.android.financialconnections;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FinancialConnectionsSheetViewModel.access$prepareStandardRequestManager(this.this$0, this);
    }
}
