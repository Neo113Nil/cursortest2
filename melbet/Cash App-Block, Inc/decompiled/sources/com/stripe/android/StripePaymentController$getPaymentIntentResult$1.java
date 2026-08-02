package com.stripe.android;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StripePaymentController$getPaymentIntentResult$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$getPaymentIntentResult$1(StripePaymentController stripePaymentController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4008getPaymentIntentResultgIAlus = this.this$0.m4008getPaymentIntentResultgIAlus(null, this);
        return m4008getPaymentIntentResultgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m4008getPaymentIntentResultgIAlus : new Result(m4008getPaymentIntentResultgIAlus);
    }
}
