package com.stripe.android.payments.core.authentication;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.view.ActivityHost;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PaymentNextActionHandler$performNextAction$1 extends ContinuationImpl {
    public ActivityHost L$0;
    public Object L$1;
    public ApiRequest.Options L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentNextActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentNextActionHandler$performNextAction$1(PaymentNextActionHandler paymentNextActionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentNextActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.performNextAction(null, null, null, this);
    }
}
