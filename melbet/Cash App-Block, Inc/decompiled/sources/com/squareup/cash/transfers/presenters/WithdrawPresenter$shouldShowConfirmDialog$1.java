package com.squareup.cash.transfers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class WithdrawPresenter$shouldShowConfirmDialog$1 extends ContinuationImpl {
    public int I$0;
    public String L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WithdrawPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawPresenter$shouldShowConfirmDialog$1(WithdrawPresenter withdrawPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = withdrawPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.shouldShowConfirmDialog(null, this);
    }
}
