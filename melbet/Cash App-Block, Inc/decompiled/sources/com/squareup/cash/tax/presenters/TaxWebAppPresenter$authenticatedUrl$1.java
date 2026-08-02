package com.squareup.cash.tax.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class TaxWebAppPresenter$authenticatedUrl$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TaxWebAppPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppPresenter$authenticatedUrl$1(TaxWebAppPresenter taxWebAppPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = taxWebAppPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TaxWebAppPresenter.access$authenticatedUrl(this.this$0, null, this);
    }
}
