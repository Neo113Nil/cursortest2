package com.stripe.android.stripe3ds2.transaction;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultTransactionTimer$start$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultTransactionTimer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransactionTimer$start$1(DefaultTransactionTimer defaultTransactionTimer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultTransactionTimer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.start(this);
    }
}
