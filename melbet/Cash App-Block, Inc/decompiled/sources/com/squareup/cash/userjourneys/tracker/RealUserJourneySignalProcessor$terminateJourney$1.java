package com.squareup.cash.userjourneys.tracker;

import com.squareup.cash.userjourneys.data.CompletedJourney;
import com.squareup.cash.userjourneys.data.UserJourney;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealUserJourneySignalProcessor$terminateJourney$1 extends ContinuationImpl {
    public UserJourney L$0;
    public UserJourney$Outcome L$1;
    public CompletedJourney L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneySignalProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneySignalProcessor$terminateJourney$1(RealUserJourneySignalProcessor realUserJourneySignalProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUserJourneySignalProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m3786terminateJourney1Y68eR8(null, null, 0L, false, this);
    }
}
