package com.stripe.android.financialconnections.repository;

import com.stripe.android.model.VerificationType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public VerificationType L$2;
    public Mutex L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsConsumerSessionRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1(FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialConnectionsConsumerSessionRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startConsumerVerification(null, null, this);
    }
}
