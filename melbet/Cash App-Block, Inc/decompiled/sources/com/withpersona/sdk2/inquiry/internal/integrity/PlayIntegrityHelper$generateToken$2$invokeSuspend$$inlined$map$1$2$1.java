package com.withpersona.sdk2.inquiry.internal.integrity;

import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DeviceFeatureRequestWorker$run$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2$1(DeviceFeatureRequestWorker$run$1$1 deviceFeatureRequestWorker$run$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = deviceFeatureRequestWorker$run$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
