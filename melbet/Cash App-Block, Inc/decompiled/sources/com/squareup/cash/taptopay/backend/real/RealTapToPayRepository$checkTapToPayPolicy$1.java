package com.squareup.cash.taptopay.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealTapToPayRepository$checkTapToPayPolicy$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTapToPayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTapToPayRepository$checkTapToPayPolicy$1(RealTapToPayRepository realTapToPayRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTapToPayRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.checkTapToPayPolicy(null, null, this);
    }
}
