package com.stripe.android.financialconnections.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class CancelAuthorizationSession$invoke$1 extends ContinuationImpl {
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CancelAuthorizationSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelAuthorizationSession$invoke$1(CancelAuthorizationSession cancelAuthorizationSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cancelAuthorizationSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, this);
    }
}
