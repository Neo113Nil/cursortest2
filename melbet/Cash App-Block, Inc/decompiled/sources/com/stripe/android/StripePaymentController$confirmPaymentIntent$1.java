package com.stripe.android;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StripePaymentController$confirmPaymentIntent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$confirmPaymentIntent$1(StripePaymentController stripePaymentController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4006confirmPaymentIntent0E7RQCE = this.this$0.m4006confirmPaymentIntent0E7RQCE(null, null, this);
        return m4006confirmPaymentIntent0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? m4006confirmPaymentIntent0E7RQCE : new Result(m4006confirmPaymentIntent0E7RQCE);
    }
}
