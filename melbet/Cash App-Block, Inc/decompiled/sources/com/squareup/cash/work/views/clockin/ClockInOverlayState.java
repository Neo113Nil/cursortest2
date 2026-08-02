package com.squareup.cash.work.views.clockin;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class ClockInOverlayState {
    public final ParcelableSnapshotMutableState disabledClockInReason$delegate;
    public final Function0 dismissOverlayCallback;
    public final ParcelableSnapshotMutableState endBreakDisabledDialogRemainingMinutes$delegate;
    public final ParcelableSnapshotMutableState isClockingIn$delegate;
    public final ParcelableSnapshotMutableState isClockingOut$delegate;
    public final ParcelableSnapshotMutableState isEndingBreak$delegate;
    public final ParcelableSnapshotMutableState isStartingBreak$delegate;
    public final Function1 onEvent;
    public final ParcelableSnapshotMutableState overlayMode$delegate;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisabledClockInReason.values().length];
            try {
                DisabledClockInReason disabledClockInReason = DisabledClockInReason.NoLocation;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DisabledClockInReason disabledClockInReason2 = DisabledClockInReason.NoLocation;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClockInOverlayState(Function1 function1, Function0 function0) {
        function1.getClass();
        function0.getClass();
        this.onEvent = function1;
        this.dismissOverlayCallback = function0;
        this.overlayMode$delegate = Updater.mutableStateOf$default(ClockInOverlayMode.Main);
        Boolean bool = Boolean.FALSE;
        this.isClockingIn$delegate = Updater.mutableStateOf$default(bool);
        this.isStartingBreak$delegate = Updater.mutableStateOf$default(bool);
        this.isEndingBreak$delegate = Updater.mutableStateOf$default(bool);
        this.isClockingOut$delegate = Updater.mutableStateOf$default(bool);
        this.endBreakDisabledDialogRemainingMinutes$delegate = Updater.mutableStateOf$default(null);
        this.disabledClockInReason$delegate = Updater.mutableStateOf$default(null);
    }

    public final void onBackFromPicker() {
        setOverlayMode(ClockInOverlayMode.Main);
    }

    public final void onDisabledClockInDialogPrimaryClick() {
        DisabledClockInReason disabledClockInReason = (DisabledClockInReason) this.disabledClockInReason$delegate.getValue();
        setDisabledClockInReason(null);
        int i = disabledClockInReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[disabledClockInReason.ordinal()];
        if (i != -1) {
            Function1 function1 = this.onEvent;
            if (i == 1) {
                function1.invoke(ClockInOverlayViewEvent.LocationClicked.INSTANCE);
                setOverlayMode(ClockInOverlayMode.LocationPicker);
            } else if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            } else {
                function1.invoke(ClockInOverlayViewEvent.JobClicked.INSTANCE);
                setOverlayMode(ClockInOverlayMode.JobPicker);
            }
        }
    }

    public final void setDisabledClockInReason(DisabledClockInReason disabledClockInReason) {
        this.disabledClockInReason$delegate.setValue(disabledClockInReason);
    }

    public final void setOverlayMode(ClockInOverlayMode clockInOverlayMode) {
        this.overlayMode$delegate.setValue(clockInOverlayMode);
    }
}
