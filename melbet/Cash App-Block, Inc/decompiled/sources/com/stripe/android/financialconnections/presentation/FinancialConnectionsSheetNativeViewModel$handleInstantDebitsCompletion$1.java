package com.stripe.android.financialconnections.presentation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel$handleInstantDebitsCompletion$1(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialConnectionsSheetNativeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FinancialConnectionsSheetNativeViewModel.access$handleInstantDebitsCompletion(this.this$0, null, this);
    }
}
