package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class PrepurchaseCacToggleKt$PrepurchaseCacToggle$4$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ MutableFloatState $dragFraction$delegate;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $dragFractionDelayedResetTrigger$delegate;
    public final /* synthetic */ boolean $isToggling;
    public final /* synthetic */ Function0 $onToggle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepurchaseCacToggleKt$PrepurchaseCacToggle$4$1(boolean z, Function0 function0, MutableFloatState mutableFloatState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation) {
        super(3, continuation);
        this.$isToggling = z;
        this.$onToggle = function0;
        this.$dragFraction$delegate = mutableFloatState;
        this.$dragFractionDelayedResetTrigger$delegate = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        MutableFloatState mutableFloatState = this.$dragFraction$delegate;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$dragFractionDelayedResetTrigger$delegate;
        return new PrepurchaseCacToggleKt$PrepurchaseCacToggle$4$1(this.$isToggling, this.$onToggle, mutableFloatState, parcelableSnapshotMutableIntState, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (this.$isToggling) {
            this.$onToggle.invoke();
        }
        ((ParcelableSnapshotMutableFloatState) this.$dragFraction$delegate).setFloatValue(MathKt__MathJVMKt.roundToInt(((ParcelableSnapshotMutableFloatState) r2).getFloatValue()));
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$dragFractionDelayedResetTrigger$delegate;
        parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
        parcelableSnapshotMutableIntState.getIntValue();
        return Unit.INSTANCE;
    }
}
