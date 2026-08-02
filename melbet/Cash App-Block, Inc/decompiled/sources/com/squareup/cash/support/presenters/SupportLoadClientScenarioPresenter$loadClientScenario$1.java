package com.squareup.cash.support.presenters;

import com.squareup.cash.invitations.InviteErrorPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SupportLoadClientScenarioPresenter$loadClientScenario$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InviteErrorPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportLoadClientScenarioPresenter$loadClientScenario$1(InviteErrorPresenter inviteErrorPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = inviteErrorPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return InviteErrorPresenter.access$loadClientScenario(this.this$0, this);
    }
}
