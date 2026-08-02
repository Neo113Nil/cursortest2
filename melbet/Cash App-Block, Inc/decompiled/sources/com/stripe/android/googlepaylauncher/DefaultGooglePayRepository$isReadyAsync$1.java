package com.stripe.android.googlepaylauncher;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultGooglePayRepository$isReadyAsync$1 extends ContinuationImpl {
    public DefaultGooglePayRepository L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultGooglePayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultGooglePayRepository$isReadyAsync$1(DefaultGooglePayRepository defaultGooglePayRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultGooglePayRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DefaultGooglePayRepository.access$isReadyAsync(this.this$0, this);
    }
}
