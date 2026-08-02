package com.squareup.cash.userjourneys.tracker;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealUserJourneyRepository$removeJourneys$1 extends ContinuationImpl {
    public int I$0;
    public Function1 L$0;
    public Mutex L$1;
    public LinkedHashMap L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneyRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneyRepository$removeJourneys$1(RealUserJourneyRepository realUserJourneyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUserJourneyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.removeJourneys(null, this);
    }
}
