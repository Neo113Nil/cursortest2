package com.stripe.android.financialconnections.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public String L$1;
    public String L$2;
    public String L$3;
    public String L$4;
    public FunctionReferenceImpl L$5;
    public Mutex L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsConsumerSessionRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1(FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialConnectionsConsumerSessionRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.performSignUp(null, null, null, null, null, null, this);
    }
}
