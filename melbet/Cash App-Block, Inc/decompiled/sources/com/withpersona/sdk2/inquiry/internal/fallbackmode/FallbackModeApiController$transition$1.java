package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.RequestBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class FallbackModeApiController$transition$1 extends ContinuationImpl {
    public RequestBody L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FallbackModeApiController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackModeApiController$transition$1(FallbackModeApiController fallbackModeApiController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fallbackModeApiController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.transition(null, null, null, this);
    }
}
