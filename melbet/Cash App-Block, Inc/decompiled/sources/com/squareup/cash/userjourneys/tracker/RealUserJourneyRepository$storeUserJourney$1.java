package com.squareup.cash.userjourneys.tracker;

import com.squareup.cash.userjourneys.data.UserJourney;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealUserJourneyRepository$storeUserJourney$1 extends ContinuationImpl {
    public int I$0;
    public UserJourney L$0;
    public Mutex L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneyRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneyRepository$storeUserJourney$1(RealUserJourneyRepository realUserJourneyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUserJourneyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.storeUserJourney(null, this);
    }
}
