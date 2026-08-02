package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealFallbackModeManager$createFallbackSession$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFallbackModeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFallbackModeManager$createFallbackSession$1(RealFallbackModeManager realFallbackModeManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFallbackModeManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.createFallbackSession(null, this);
    }
}
