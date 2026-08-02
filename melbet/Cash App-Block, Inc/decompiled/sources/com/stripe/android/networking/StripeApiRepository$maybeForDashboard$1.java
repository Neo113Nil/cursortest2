package com.stripe.android.networking;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StripeApiRepository$maybeForDashboard$1 extends ContinuationImpl {
    public ConfirmPaymentIntentParams L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$maybeForDashboard$1(StripeApiRepository stripeApiRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4043maybeForDashboard0E7RQCE = this.this$0.m4043maybeForDashboard0E7RQCE((ConfirmPaymentIntentParams) null, (ApiRequest.Options) null, this);
        return m4043maybeForDashboard0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? m4043maybeForDashboard0E7RQCE : new Result(m4043maybeForDashboard0E7RQCE);
    }
}
