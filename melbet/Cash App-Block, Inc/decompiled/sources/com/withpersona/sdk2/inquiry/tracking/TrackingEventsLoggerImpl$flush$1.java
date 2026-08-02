package com.withpersona.sdk2.inquiry.tracking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl", f = "TrackingEventsLoggerImpl.kt", l = {522, 527, 533, 540, 543, 545, 547, 574}, m = "flush")
/* loaded from: classes9.dex */
public final class TrackingEventsLoggerImpl$flush$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsLoggerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsLoggerImpl$flush$1(TrackingEventsLoggerImpl trackingEventsLoggerImpl, Continuation<? super TrackingEventsLoggerImpl$flush$1> continuation) {
        super(continuation);
        this.this$0 = trackingEventsLoggerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object flush;
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        flush = this.this$0.flush(this);
        return flush;
    }
}
