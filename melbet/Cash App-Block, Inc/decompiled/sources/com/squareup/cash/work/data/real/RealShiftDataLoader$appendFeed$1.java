package com.squareup.cash.work.data.real;

import com.squareup.cash.work.data.api.DateRangedFeed;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.ClosedRange;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealShiftDataLoader$appendFeed$1 extends ContinuationImpl {
    public DateRangedFeed L$0;
    public ClosedRange L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealShiftDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShiftDataLoader$appendFeed$1(RealShiftDataLoader realShiftDataLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realShiftDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.appendFeed(null, null, null, this);
    }
}
