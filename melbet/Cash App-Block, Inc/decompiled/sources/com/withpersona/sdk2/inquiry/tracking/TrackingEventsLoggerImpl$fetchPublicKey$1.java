package com.withpersona.sdk2.inquiry.tracking;

import com.plaid.internal.EnumC0170g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl", f = "TrackingEventsLoggerImpl.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m = "fetchPublicKey")
/* loaded from: classes9.dex */
public final class TrackingEventsLoggerImpl$fetchPublicKey$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsLoggerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsLoggerImpl$fetchPublicKey$1(TrackingEventsLoggerImpl trackingEventsLoggerImpl, Continuation<? super TrackingEventsLoggerImpl$fetchPublicKey$1> continuation) {
        super(continuation);
        this.this$0 = trackingEventsLoggerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchPublicKey;
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        fetchPublicKey = this.this$0.fetchPublicKey(this);
        return fetchPublicKey;
    }
}
