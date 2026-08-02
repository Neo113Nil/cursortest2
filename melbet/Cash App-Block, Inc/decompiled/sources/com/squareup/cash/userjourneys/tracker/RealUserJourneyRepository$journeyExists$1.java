package com.squareup.cash.userjourneys.tracker;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealUserJourneyRepository$journeyExists$1 extends ContinuationImpl {
    public JourneySelector$$ExternalSyntheticLambda0 L$0;
    public MutexImpl L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneyRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneyRepository$journeyExists$1(RealUserJourneyRepository realUserJourneyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUserJourneyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.journeyExists(null, this);
    }
}
