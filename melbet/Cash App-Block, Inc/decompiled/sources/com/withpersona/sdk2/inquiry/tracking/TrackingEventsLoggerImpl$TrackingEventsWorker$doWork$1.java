package com.withpersona.sdk2.inquiry.tracking;

import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl$TrackingEventsWorker", f = "TrackingEventsLoggerImpl.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m = "doWork")
/* loaded from: classes9.dex */
public final class TrackingEventsLoggerImpl$TrackingEventsWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsLoggerImpl.TrackingEventsWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsLoggerImpl$TrackingEventsWorker$doWork$1(TrackingEventsLoggerImpl.TrackingEventsWorker trackingEventsWorker, Continuation<? super TrackingEventsLoggerImpl$TrackingEventsWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = trackingEventsWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.doWork(this);
    }
}
