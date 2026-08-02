package com.squareup.cash.work.views.clockin;

import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ElapsedTimeTimerKt$ElapsedTimeTimer$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function0 $currentTimeMillisProvider;
    public final /* synthetic */ ParcelableSnapshotMutableLongState $elapsedMillis$delegate;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ long $startTimeMillis;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElapsedTimeTimerKt$ElapsedTimeTimer$2$1(long j, Function0 function0, ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState, Continuation continuation) {
        super(2, continuation);
        this.$startTimeMillis = j;
        this.$currentTimeMillisProvider = function0;
        this.$elapsedMillis$delegate = parcelableSnapshotMutableLongState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ElapsedTimeTimerKt$ElapsedTimeTimer$2$1(this.$currentTimeMillisProvider, this.$startTimeMillis, this.$elapsedMillis$delegate, continuation);
            default:
                return new ElapsedTimeTimerKt$ElapsedTimeTimer$2$1(this.$startTimeMillis, this.$currentTimeMillisProvider, this.$elapsedMillis$delegate, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((ElapsedTimeTimerKt$ElapsedTimeTimer$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            default:
                ((ElapsedTimeTimerKt$ElapsedTimeTimer$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long duration;
        long duration2;
        int i = this.$r8$classId;
        Function0 function0 = this.$currentTimeMillisProvider;
        long j = this.$startTimeMillis;
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.$elapsedMillis$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0 && i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                do {
                    parcelableSnapshotMutableLongState.setLongValue(((Number) function0.invoke()).longValue() - j);
                    Duration.Companion companion = Duration.Companion;
                    duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                    this.label = 1;
                } while (JobKt.m4182delayVtjQ1oo(duration, this) != coroutineSingletons);
                return coroutineSingletons;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0 && i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                do {
                    long longValue = (((Number) function0.invoke()).longValue() - j) / 60000;
                    if (longValue < 0) {
                        longValue = 0;
                    }
                    parcelableSnapshotMutableLongState.setLongValue(longValue);
                    Duration.Companion companion2 = Duration.Companion;
                    duration2 = DurationKt.toDuration(1, DurationUnit.MINUTES);
                    this.label = 1;
                } while (JobKt.m4182delayVtjQ1oo(duration2, this) != coroutineSingletons2);
                return coroutineSingletons2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElapsedTimeTimerKt$ElapsedTimeTimer$2$1(Function0 function0, long j, ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState, Continuation continuation) {
        super(2, continuation);
        this.$currentTimeMillisProvider = function0;
        this.$startTimeMillis = j;
        this.$elapsedMillis$delegate = parcelableSnapshotMutableLongState;
    }
}
