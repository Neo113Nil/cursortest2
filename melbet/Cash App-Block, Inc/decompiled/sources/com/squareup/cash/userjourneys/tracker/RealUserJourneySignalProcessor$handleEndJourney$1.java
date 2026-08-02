package com.squareup.cash.userjourneys.tracker;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealUserJourneySignalProcessor$handleEndJourney$1 extends ContinuationImpl {
    public long J$0;
    public UserJourney$Outcome L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneySignalProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneySignalProcessor$handleEndJourney$1(RealUserJourneySignalProcessor realUserJourneySignalProcessor, Continuation continuation) {
        super(continuation);
        this.this$0 = realUserJourneySignalProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealUserJourneySignalProcessor.m3785access$handleEndJourneyexY8QGI(this.this$0, null, null, 0L, this);
    }
}
