package com.withpersona.sdk2.inquiry.tracking.network;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService", f = "TrackingEventsService.kt", l = {38}, m = "sendEvents-0E7RQCE$tracking_events_release")
/* loaded from: classes9.dex */
public final class TrackingEventsService$sendEvents$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsService$sendEvents$1(TrackingEventsService trackingEventsService, Continuation<? super TrackingEventsService$sendEvents$1> continuation) {
        super(continuation);
        this.this$0 = trackingEventsService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4105sendEvents0E7RQCE$tracking_events_release = this.this$0.m4105sendEvents0E7RQCE$tracking_events_release(null, null, this);
        return m4105sendEvents0E7RQCE$tracking_events_release == CoroutineSingletons.COROUTINE_SUSPENDED ? m4105sendEvents0E7RQCE$tracking_events_release : new Result(m4105sendEvents0E7RQCE$tracking_events_release);
    }
}
