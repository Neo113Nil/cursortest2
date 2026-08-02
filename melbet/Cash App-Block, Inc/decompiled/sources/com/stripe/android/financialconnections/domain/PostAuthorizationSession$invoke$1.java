package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PostAuthorizationSession$invoke$1 extends ContinuationImpl {
    public FinancialConnectionsInstitution L$0;
    public SynchronizeSessionResponse L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PostAuthorizationSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAuthorizationSession$invoke$1(PostAuthorizationSession postAuthorizationSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = postAuthorizationSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, null, this);
    }
}
