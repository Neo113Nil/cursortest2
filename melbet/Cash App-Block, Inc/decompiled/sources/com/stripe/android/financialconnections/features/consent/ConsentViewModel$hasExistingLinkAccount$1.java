package com.stripe.android.financialconnections.features.consent;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ConsentViewModel$hasExistingLinkAccount$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConsentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentViewModel$hasExistingLinkAccount$1(ConsentViewModel consentViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = consentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.hasExistingLinkAccount(null, null, this);
    }
}
