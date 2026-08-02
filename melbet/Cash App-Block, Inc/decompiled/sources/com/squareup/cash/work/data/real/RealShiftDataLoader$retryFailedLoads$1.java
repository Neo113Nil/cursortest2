package com.squareup.cash.work.data.real;

import com.squareup.cash.work.data.api.DateRangedFeed;
import com.squareup.cash.work.data.api.ShiftDataState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealShiftDataLoader$retryFailedLoads$1 extends ContinuationImpl {
    public ShiftLoaderContext L$0;
    public ShiftDataState.Ready L$1;
    public DateRangedFeed L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealShiftDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShiftDataLoader$retryFailedLoads$1(RealShiftDataLoader realShiftDataLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realShiftDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealShiftDataLoader.access$retryFailedLoads(this.this$0, null, null, this);
    }
}
