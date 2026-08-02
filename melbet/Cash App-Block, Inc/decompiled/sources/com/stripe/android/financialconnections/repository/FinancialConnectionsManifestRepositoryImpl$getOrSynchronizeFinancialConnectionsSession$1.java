package com.stripe.android.financialconnections.repository;

import com.squareup.scannerview.ScannerView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public String L$1;
    public ScannerView.AnonymousClass3 L$2;
    public Mutex L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsManifestRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = financialConnectionsManifestRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getOrSynchronizeFinancialConnectionsSession(null, null, false, null, this);
    }
}
