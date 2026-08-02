package com.squareup.cash.ui.gcm;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealGcmRegistrar$registerDevice$1 extends ContinuationImpl {
    public String L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGcmRegistrar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGcmRegistrar$registerDevice$1(RealGcmRegistrar realGcmRegistrar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGcmRegistrar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealGcmRegistrar.access$registerDevice(this.this$0, null, false, this);
    }
}
