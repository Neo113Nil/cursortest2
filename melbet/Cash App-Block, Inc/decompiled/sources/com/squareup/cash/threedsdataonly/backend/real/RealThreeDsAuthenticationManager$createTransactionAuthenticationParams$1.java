package com.squareup.cash.threedsdataonly.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealThreeDsAuthenticationManager$createTransactionAuthenticationParams$1 extends ContinuationImpl {
    public String L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealThreeDsAuthenticationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealThreeDsAuthenticationManager$createTransactionAuthenticationParams$1(RealThreeDsAuthenticationManager realThreeDsAuthenticationManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realThreeDsAuthenticationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.createTransactionAuthenticationParams(null, null, null, null, this);
    }
}
