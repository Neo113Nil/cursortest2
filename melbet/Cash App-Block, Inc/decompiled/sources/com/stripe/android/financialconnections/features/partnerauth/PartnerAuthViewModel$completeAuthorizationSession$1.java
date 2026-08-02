package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PartnerAuthViewModel$completeAuthorizationSession$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public FinancialConnectionsAuthorizationSession L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PartnerAuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel$completeAuthorizationSession$1(PartnerAuthViewModel partnerAuthViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PartnerAuthViewModel.access$completeAuthorizationSession(this.this$0, null, this);
    }
}
