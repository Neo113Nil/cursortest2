package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StripeChallengeRequestExecutor$execute$1 extends ContinuationImpl {
    public ChallengeRequestData L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeTransaction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeChallengeRequestExecutor$execute$1(StripeTransaction stripeTransaction, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripeTransaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.execute(null, this);
    }
}
