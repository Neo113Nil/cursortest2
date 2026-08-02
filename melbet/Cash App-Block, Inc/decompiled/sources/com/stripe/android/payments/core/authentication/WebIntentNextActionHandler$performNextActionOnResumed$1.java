package com.stripe.android.payments.core.authentication;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.ActivityHost;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class WebIntentNextActionHandler$performNextActionOnResumed$1 extends ContinuationImpl {
    public ActivityHost L$0;
    public StripeIntent L$1;
    public ApiRequest.Options L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WebIntentNextActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebIntentNextActionHandler$performNextActionOnResumed$1(WebIntentNextActionHandler webIntentNextActionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = webIntentNextActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.performNextActionOnResumed((ActivityHost) null, (StripeIntent) null, (ApiRequest.Options) null, this);
    }
}
