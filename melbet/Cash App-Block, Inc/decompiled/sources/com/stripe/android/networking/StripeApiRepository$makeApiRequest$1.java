package com.stripe.android.networking;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.StripeApiRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StripeApiRepository$makeApiRequest$1 extends ContinuationImpl {
    public ApiRequest L$0;
    public Function1 L$1;
    public StripeApiRepository.DnsCacheData L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$makeApiRequest$1(StripeApiRepository stripeApiRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.makeApiRequest$payments_core_release(null, null, this);
    }
}
