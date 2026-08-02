package com.squareup.cash.userjourneys.tracker;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealUserJourneySignalProcessor$handleTerminateStaleJourneys$1 extends ContinuationImpl {
    public int I$0;
    public Iterator L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneySignalProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneySignalProcessor$handleTerminateStaleJourneys$1(RealUserJourneySignalProcessor realUserJourneySignalProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUserJourneySignalProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealUserJourneySignalProcessor.access$handleTerminateStaleJourneys(this.this$0, null, this);
    }
}
