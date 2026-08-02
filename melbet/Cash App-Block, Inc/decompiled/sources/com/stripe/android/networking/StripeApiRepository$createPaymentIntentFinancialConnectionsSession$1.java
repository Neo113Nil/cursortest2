package com.stripe.android.networking;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1(StripeApiRepository stripeApiRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A = this.this$0.m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A(null, null, null, this);
        return m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A : new Result(m4039createPaymentIntentFinancialConnectionsSessionBWLJW6A);
    }
}
