package com.squareup.cash.wallet.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealIssuedCardManager$saveSensitiveData$1 extends ContinuationImpl {
    public String L$0;
    public String L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealIssuedCardManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIssuedCardManager$saveSensitiveData$1(RealIssuedCardManager realIssuedCardManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realIssuedCardManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.saveSensitiveData(null, null, null, this);
    }
}
