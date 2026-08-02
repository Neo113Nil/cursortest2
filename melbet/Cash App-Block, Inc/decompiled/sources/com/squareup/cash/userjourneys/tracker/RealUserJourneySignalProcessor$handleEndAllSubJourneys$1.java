package com.squareup.cash.userjourneys.tracker;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealUserJourneySignalProcessor$handleEndAllSubJourneys$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public UserJourney$Outcome L$0;
    public Iterator L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneySignalProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneySignalProcessor$handleEndAllSubJourneys$1(RealUserJourneySignalProcessor realUserJourneySignalProcessor, Continuation continuation) {
        super(continuation);
        this.this$0 = realUserJourneySignalProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealUserJourneySignalProcessor.m3784access$handleEndAllSubJourneys8Mi8wO0(this.this$0, null, 0L, this);
    }
}
