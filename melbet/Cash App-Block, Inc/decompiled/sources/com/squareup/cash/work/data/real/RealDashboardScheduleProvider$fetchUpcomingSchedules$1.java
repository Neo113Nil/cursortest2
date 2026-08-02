package com.squareup.cash.work.data.real;

import java.time.OffsetDateTime;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealDashboardScheduleProvider$fetchUpcomingSchedules$1 extends ContinuationImpl {
    public String L$0;
    public String L$1;
    public OffsetDateTime L$4;
    public OffsetDateTime L$5;
    public List L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealDashboardScheduleProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDashboardScheduleProvider$fetchUpcomingSchedules$1(RealDashboardScheduleProvider realDashboardScheduleProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realDashboardScheduleProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealDashboardScheduleProvider.access$fetchUpcomingSchedules(this.this$0, null, null, this);
    }
}
