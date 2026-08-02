package com.squareup.cash.work.data.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealPayDataLoader$fetchCanUseDirectDeposit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPayDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchCanUseDirectDeposit$1(RealPayDataLoader realPayDataLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPayDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealPayDataLoader.access$fetchCanUseDirectDeposit(this.this$0, null, this);
    }
}
