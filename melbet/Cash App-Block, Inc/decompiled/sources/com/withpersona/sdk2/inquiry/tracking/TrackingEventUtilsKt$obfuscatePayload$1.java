package com.withpersona.sdk2.inquiry.tracking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt", f = "TrackingEventUtils.kt", l = {42, 55}, m = "obfuscatePayload")
/* loaded from: classes9.dex */
public final class TrackingEventUtilsKt$obfuscatePayload$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public TrackingEventUtilsKt$obfuscatePayload$1(Continuation<? super TrackingEventUtilsKt$obfuscatePayload$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TrackingEventUtilsKt.obfuscatePayload(null, null, this);
    }
}
