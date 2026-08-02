package com.stripe.android.uicore.image;

import com.stripe.android.uicore.image.DefaultStripeImageLoader$load$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultStripeImageLoader$withMutexByUrlLock$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public DefaultStripeImageLoader$load$2.AnonymousClass1 L$1;
    public Mutex L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultStripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeImageLoader$withMutexByUrlLock$1(DefaultStripeImageLoader defaultStripeImageLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultStripeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DefaultStripeImageLoader.access$withMutexByUrlLock(this.this$0, null, null, this);
    }
}
