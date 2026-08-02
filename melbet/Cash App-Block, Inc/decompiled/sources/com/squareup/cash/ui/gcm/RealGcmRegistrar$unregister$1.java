package com.squareup.cash.ui.gcm;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealGcmRegistrar$unregister$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGcmRegistrar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGcmRegistrar$unregister$1(RealGcmRegistrar realGcmRegistrar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGcmRegistrar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.unregister(this);
    }
}
