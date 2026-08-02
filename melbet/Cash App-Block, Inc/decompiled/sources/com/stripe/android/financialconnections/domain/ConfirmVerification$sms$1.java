package com.stripe.android.financialconnections.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ConfirmVerification$sms$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConfirmVerification this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmVerification$sms$1(ConfirmVerification confirmVerification, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = confirmVerification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sms(null, null, this);
    }
}
