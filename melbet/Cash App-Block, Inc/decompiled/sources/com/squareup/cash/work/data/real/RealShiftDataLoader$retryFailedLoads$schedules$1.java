package com.squareup.cash.work.data.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedRange;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealShiftDataLoader$retryFailedLoads$schedules$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public RealShiftDataLoader L$1;
    public int label;
    public final /* synthetic */ RealShiftDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealShiftDataLoader$retryFailedLoads$schedules$1(RealShiftDataLoader realShiftDataLoader, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realShiftDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealShiftDataLoader realShiftDataLoader = this.this$0;
        switch (i) {
            case 0:
                RealShiftDataLoader$retryFailedLoads$schedules$1 realShiftDataLoader$retryFailedLoads$schedules$1 = new RealShiftDataLoader$retryFailedLoads$schedules$1(realShiftDataLoader, continuation, 0);
                realShiftDataLoader$retryFailedLoads$schedules$1.L$0 = obj;
                return realShiftDataLoader$retryFailedLoads$schedules$1;
            case 1:
                RealShiftDataLoader$retryFailedLoads$schedules$1 realShiftDataLoader$retryFailedLoads$schedules$12 = new RealShiftDataLoader$retryFailedLoads$schedules$1(realShiftDataLoader, continuation, 1);
                realShiftDataLoader$retryFailedLoads$schedules$12.L$0 = obj;
                return realShiftDataLoader$retryFailedLoads$schedules$12;
            default:
                RealShiftDataLoader$retryFailedLoads$schedules$1 realShiftDataLoader$retryFailedLoads$schedules$13 = new RealShiftDataLoader$retryFailedLoads$schedules$1(realShiftDataLoader, continuation, 2);
                realShiftDataLoader$retryFailedLoads$schedules$13.L$0 = obj;
                return realShiftDataLoader$retryFailedLoads$schedules$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ClosedRange closedRange = (ClosedRange) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealShiftDataLoader$retryFailedLoads$schedules$1) create(closedRange, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealShiftDataLoader realShiftDataLoader = this.this$0;
        switch (i) {
            case 0:
                ClosedRange closedRange = (ClosedRange) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AssetPublicSuffixList assetPublicSuffixList = realShiftDataLoader.shiftDataFetcher;
                    this.L$0 = closedRange;
                    this.L$1 = realShiftDataLoader;
                    this.label = 1;
                    obj = assetPublicSuffixList.fetchSchedules(closedRange, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realShiftDataLoader = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                return RealShiftDataLoader.access$bucketByDay(realShiftDataLoader, (List) obj, closedRange);
            case 1:
                ClosedRange closedRange2 = (ClosedRange) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AssetPublicSuffixList assetPublicSuffixList2 = realShiftDataLoader.shiftDataFetcher;
                    this.L$0 = closedRange2;
                    this.L$1 = realShiftDataLoader;
                    this.label = 1;
                    obj = assetPublicSuffixList2.fetchSchedules(closedRange2, this);
                    if (obj == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realShiftDataLoader = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                return RealShiftDataLoader.access$bucketByDay(realShiftDataLoader, (List) obj, closedRange2);
            default:
                ClosedRange closedRange3 = (ClosedRange) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AssetPublicSuffixList assetPublicSuffixList3 = realShiftDataLoader.shiftDataFetcher;
                    this.L$0 = closedRange3;
                    this.L$1 = realShiftDataLoader;
                    this.label = 1;
                    obj = assetPublicSuffixList3.fetchSchedules(closedRange3, this);
                    if (obj == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realShiftDataLoader = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                return RealShiftDataLoader.access$bucketByDay(realShiftDataLoader, (List) obj, closedRange3);
        }
    }
}
