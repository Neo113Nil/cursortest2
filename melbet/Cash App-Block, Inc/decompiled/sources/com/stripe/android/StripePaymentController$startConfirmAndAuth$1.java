package com.stripe.android;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.view.ActivityHost;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StripePaymentController$startConfirmAndAuth$1 extends ContinuationImpl {
    public ActivityHost L$0;
    public ConfirmStripeIntentParams L$1;
    public ApiRequest.Options L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$startConfirmAndAuth$1(StripePaymentController stripePaymentController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startConfirmAndAuth(null, null, null, this);
    }
}
