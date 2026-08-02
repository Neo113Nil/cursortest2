package com.squareup.cash.userjourneys.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class DiskUserJourneyDataSource$persist$1 extends ContinuationImpl {
    public DiskUserJourneyDataSource L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DiskUserJourneyDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskUserJourneyDataSource$persist$1(DiskUserJourneyDataSource diskUserJourneyDataSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = diskUserJourneyDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DiskUserJourneyDataSource.persist$suspendImpl(this.this$0, null, this);
    }
}
