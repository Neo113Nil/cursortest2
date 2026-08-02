package com.squareup.cash.work.data.real;

import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealGetMerchantsClockInStatusUseCase$fetchStatus$1 extends ContinuationImpl {
    public MerchantIdentifier L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ JCAContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGetMerchantsClockInStatusUseCase$fetchStatus$1(JCAContext jCAContext, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jCAContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return JCAContext.access$fetchStatus(this.this$0, null, this);
    }
}
