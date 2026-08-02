package com.squareup.cash.work.presenters.shift.data;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ClockInEnabledResult {
    public final ClockInDisabledReason disabledReason;
    public final ClockInEnabledReason enabledReason;
    public final boolean isEnabled;
    public final ScheduledShiftStatus scheduledShiftStatus;

    public ClockInEnabledResult(boolean z, ClockInEnabledReason clockInEnabledReason, ClockInDisabledReason clockInDisabledReason, ScheduledShiftStatus scheduledShiftStatus, int i) {
        clockInEnabledReason = (i & 2) != 0 ? null : clockInEnabledReason;
        clockInDisabledReason = (i & 4) != 0 ? null : clockInDisabledReason;
        scheduledShiftStatus = (i & 8) != 0 ? null : scheduledShiftStatus;
        this.isEnabled = z;
        this.enabledReason = clockInEnabledReason;
        this.disabledReason = clockInDisabledReason;
        this.scheduledShiftStatus = scheduledShiftStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockInEnabledResult)) {
            return false;
        }
        ClockInEnabledResult clockInEnabledResult = (ClockInEnabledResult) obj;
        return this.isEnabled == clockInEnabledResult.isEnabled && Intrinsics.areEqual(this.enabledReason, clockInEnabledResult.enabledReason) && Intrinsics.areEqual(this.disabledReason, clockInEnabledResult.disabledReason) && Intrinsics.areEqual(this.scheduledShiftStatus, clockInEnabledResult.scheduledShiftStatus);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        ClockInEnabledReason clockInEnabledReason = this.enabledReason;
        int hashCode2 = (hashCode + (clockInEnabledReason == null ? 0 : clockInEnabledReason.hashCode())) * 31;
        ClockInDisabledReason clockInDisabledReason = this.disabledReason;
        int hashCode3 = (hashCode2 + (clockInDisabledReason == null ? 0 : clockInDisabledReason.hashCode())) * 31;
        ScheduledShiftStatus scheduledShiftStatus = this.scheduledShiftStatus;
        return hashCode3 + (scheduledShiftStatus != null ? scheduledShiftStatus.hashCode() : 0);
    }

    public final String toString() {
        return "ClockInEnabledResult(isEnabled=" + this.isEnabled + ", enabledReason=" + this.enabledReason + ", disabledReason=" + this.disabledReason + ", scheduledShiftStatus=" + this.scheduledShiftStatus + ")";
    }
}
