package com.stripe.android.uicore.image;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultStripeImageLoader$loadFromNetwork$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultStripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeImageLoader$loadFromNetwork$1(DefaultStripeImageLoader defaultStripeImageLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultStripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4076access$loadFromNetworkBWLJW6A = DefaultStripeImageLoader.m4076access$loadFromNetworkBWLJW6A(this.this$0, null, 0, 0, this);
        return m4076access$loadFromNetworkBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4076access$loadFromNetworkBWLJW6A : new Result(m4076access$loadFromNetworkBWLJW6A);
    }
}
