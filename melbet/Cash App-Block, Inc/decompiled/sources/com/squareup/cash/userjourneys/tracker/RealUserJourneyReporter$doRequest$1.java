package com.squareup.cash.userjourneys.tracker;

import com.squareup.cash.clientsync.RealExponentialBackoff;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealUserJourneyReporter$doRequest$1 extends ContinuationImpl {
    public long J$0;
    public List L$0;
    public JourneysToUpload L$1;
    public RealExponentialBackoff L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealUserJourneyReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealUserJourneyReporter$doRequest$1(RealUserJourneyReporter realUserJourneyReporter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realUserJourneyReporter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.doRequest(null, null, null, this);
    }
}
