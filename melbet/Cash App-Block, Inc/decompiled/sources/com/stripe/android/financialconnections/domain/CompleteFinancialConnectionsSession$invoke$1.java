package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class CompleteFinancialConnectionsSession$invoke$1 extends ContinuationImpl {
    public NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause L$0;
    public Throwable L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CompleteFinancialConnectionsSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteFinancialConnectionsSession$invoke$1(CompleteFinancialConnectionsSession completeFinancialConnectionsSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = completeFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, null, this);
    }
}
