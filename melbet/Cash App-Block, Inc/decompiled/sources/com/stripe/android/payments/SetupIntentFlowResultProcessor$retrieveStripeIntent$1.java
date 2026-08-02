package com.stripe.android.payments;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class SetupIntentFlowResultProcessor$retrieveStripeIntent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SetupIntentFlowResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupIntentFlowResultProcessor$retrieveStripeIntent$1(SetupIntentFlowResultProcessor setupIntentFlowResultProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = setupIntentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object mo4055retrieveStripeIntentBWLJW6A = this.this$0.mo4055retrieveStripeIntentBWLJW6A(null, null, null, this);
        return mo4055retrieveStripeIntentBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4055retrieveStripeIntentBWLJW6A : new Result(mo4055retrieveStripeIntentBWLJW6A);
    }
}
