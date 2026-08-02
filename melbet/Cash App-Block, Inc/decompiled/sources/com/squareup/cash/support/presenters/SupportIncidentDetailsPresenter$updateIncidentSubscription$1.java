package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$SubscriptionAction;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SupportIncidentDetailsPresenter$updateIncidentSubscription$1 extends ContinuationImpl {
    public IncidentViewModel$SubscriptionAction L$0;
    public MutableState L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InstrumentDetailsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportIncidentDetailsPresenter$updateIncidentSubscription$1(InstrumentDetailsPresenter instrumentDetailsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = instrumentDetailsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return InstrumentDetailsPresenter.access$updateIncidentSubscription(this.this$0, null, null, this);
    }
}
