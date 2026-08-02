package com.squareup.cash.work.views.clockin;

import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ClockInOverlayStateKt$rememberClockInOverlayState$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ClockInOverlayViewModel $model;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClockInOverlayState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClockInOverlayStateKt$rememberClockInOverlayState$2$1(ClockInOverlayViewModel clockInOverlayViewModel, ClockInOverlayState clockInOverlayState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$model = clockInOverlayViewModel;
        this.$state = clockInOverlayState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ClockInOverlayStateKt$rememberClockInOverlayState$2$1(this.$model, this.$state, continuation, 0);
            default:
                return new ClockInOverlayStateKt$rememberClockInOverlayState$2$1(this.$model, this.$state, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ClockInOverlayStateKt$rememberClockInOverlayState$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ClockInOverlayViewModel clockInOverlayViewModel = this.$model;
        ClockInOverlayState clockInOverlayState = this.$state;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if ((clockInOverlayViewModel instanceof ClockInOverlayViewModel.Loaded.OnBreak) && ((ClockInOverlayMode) clockInOverlayState.overlayMode$delegate.getValue()) == ClockInOverlayMode.BreakPicker) {
                    clockInOverlayState.onBackFromPicker();
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if ((clockInOverlayViewModel instanceof ClockInOverlayViewModel.Loaded.ClockedOutSummary) && (((ClockInOverlayMode) clockInOverlayState.overlayMode$delegate.getValue()) == ClockInOverlayMode.ClockOutConfirmation || ((ClockInOverlayMode) clockInOverlayState.overlayMode$delegate.getValue()) == ClockInOverlayMode.DeclareCashTip)) {
                    clockInOverlayState.onBackFromPicker();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
