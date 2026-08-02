package com.squareup.cash.userjourneys.tracker;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealUserJourneySignalProcessor$handleRetryCompletedJourneys$1 extends ContinuationImpl {
    public LinkedHashMap L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneySignalProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneySignalProcessor$handleRetryCompletedJourneys$1(RealUserJourneySignalProcessor realUserJourneySignalProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUserJourneySignalProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealUserJourneySignalProcessor.access$handleRetryCompletedJourneys(this.this$0, null, this);
    }
}
