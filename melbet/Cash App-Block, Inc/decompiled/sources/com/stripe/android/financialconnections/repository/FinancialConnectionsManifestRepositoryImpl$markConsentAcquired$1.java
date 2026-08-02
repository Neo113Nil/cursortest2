package com.stripe.android.financialconnections.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public Mutex L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsManifestRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialConnectionsManifestRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.markConsentAcquired(null, this);
    }
}
