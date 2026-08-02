package com.stripe.android.payments.bankaccount.ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class CollectBankAccountViewModel$createFinancialConnectionsSession$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountViewModel$createFinancialConnectionsSession$1(CollectBankAccountViewModel collectBankAccountViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = collectBankAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CollectBankAccountViewModel.access$createFinancialConnectionsSession(this.this$0, this);
    }
}
