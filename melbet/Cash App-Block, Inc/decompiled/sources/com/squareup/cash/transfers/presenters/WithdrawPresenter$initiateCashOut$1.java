package com.squareup.cash.transfers.presenters;

import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SignalsContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class WithdrawPresenter$initiateCashOut$1 extends ContinuationImpl {
    public Money L$0;
    public Instrument L$1;
    public WithdrawViewModel.DepositPreferenceOption L$2;
    public SignalsContext L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WithdrawPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawPresenter$initiateCashOut$1(WithdrawPresenter withdrawPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = withdrawPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return WithdrawPresenter.access$initiateCashOut(this.this$0, null, null, null, null, this);
    }
}
