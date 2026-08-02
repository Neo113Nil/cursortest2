package com.squareup.cash.userjourneys.tracker;

import com.squareup.cash.userjourneys.data.UserJourney;
import com.squareup.cash.userjourneys.tracker.Signal;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealUserJourneySignalProcessor$handleStartJourney$1 extends ContinuationImpl {
    public int I$0;
    public Signal.Start L$0;
    public UserJourney L$1;
    public Iterator L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneySignalProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneySignalProcessor$handleStartJourney$1(RealUserJourneySignalProcessor realUserJourneySignalProcessor, Continuation continuation) {
        super(continuation);
        this.this$0 = realUserJourneySignalProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealUserJourneySignalProcessor.access$handleStartJourney(this.this$0, null, this);
    }
}
