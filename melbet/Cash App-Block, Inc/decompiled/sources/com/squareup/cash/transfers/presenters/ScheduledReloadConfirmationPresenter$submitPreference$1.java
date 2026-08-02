package com.squareup.cash.transfers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ScheduledReloadConfirmationPresenter$submitPreference$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScheduledReloadConfirmationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledReloadConfirmationPresenter$submitPreference$1(ScheduledReloadConfirmationPresenter scheduledReloadConfirmationPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = scheduledReloadConfirmationPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ScheduledReloadConfirmationPresenter.access$submitPreference(this.this$0, null, null, null, this);
    }
}
