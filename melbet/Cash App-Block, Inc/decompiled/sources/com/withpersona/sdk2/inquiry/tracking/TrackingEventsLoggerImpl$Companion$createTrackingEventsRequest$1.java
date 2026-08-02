package com.withpersona.sdk2.inquiry.tracking;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl$Companion", f = "TrackingEventsLoggerImpl.kt", l = {94, 104}, m = "createTrackingEventsRequest")
/* loaded from: classes9.dex */
public final class TrackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsLoggerImpl.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1(TrackingEventsLoggerImpl.Companion companion, Continuation<? super TrackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.createTrackingEventsRequest(null, null, this);
    }
}
