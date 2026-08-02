package com.squareup.cash.work.presenters.pay;

import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class PayHistoryListPresenter$fetchStubs$1 extends ContinuationImpl {
    public Integer L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TaxAuthorizationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayHistoryListPresenter$fetchStubs$1(TaxAuthorizationPresenter taxAuthorizationPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = taxAuthorizationPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TaxAuthorizationPresenter.access$fetchStubs(this.this$0, null, null, this);
    }
}
