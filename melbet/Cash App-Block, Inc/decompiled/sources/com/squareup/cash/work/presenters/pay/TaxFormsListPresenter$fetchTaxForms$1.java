package com.squareup.cash.work.presenters.pay;

import com.squareup.cash.work.presenters.WorkHomePresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class TaxFormsListPresenter$fetchTaxForms$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WorkHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxFormsListPresenter$fetchTaxForms$1(WorkHomePresenter workHomePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = workHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return WorkHomePresenter.access$fetchTaxForms(this.this$0, null, this);
    }
}
