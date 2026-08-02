package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RequestIntegrityToken$invoke$1 extends ContinuationImpl {
    public FinancialConnectionsAnalyticsEvent.AttestationEndpoint L$0;
    public FinancialConnectionsSessionManifest.Pane L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RequestIntegrityToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestIntegrityToken$invoke$1(RequestIntegrityToken requestIntegrityToken, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = requestIntegrityToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, null, this);
    }
}
