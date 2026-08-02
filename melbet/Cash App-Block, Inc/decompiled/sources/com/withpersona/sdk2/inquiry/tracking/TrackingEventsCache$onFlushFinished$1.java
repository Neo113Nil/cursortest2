package com.withpersona.sdk2.inquiry.tracking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", f = "TrackingEventsCache.kt", l = {86}, m = "onFlushFinished")
/* loaded from: classes9.dex */
public final class TrackingEventsCache$onFlushFinished$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsCache$onFlushFinished$1(TrackingEventsCache trackingEventsCache, Continuation<? super TrackingEventsCache$onFlushFinished$1> continuation) {
        super(continuation);
        this.this$0 = trackingEventsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onFlushFinished(this);
    }
}
