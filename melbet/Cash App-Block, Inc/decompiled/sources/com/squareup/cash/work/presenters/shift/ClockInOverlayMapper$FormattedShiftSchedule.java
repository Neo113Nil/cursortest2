package com.squareup.cash.work.presenters.shift;

import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;

/* loaded from: classes9.dex */
public final class ClockInOverlayMapper$FormattedShiftSchedule {
    public final ClockInOverlayViewModel.ShiftScheduleDisplay display;
    public final String timeRange;

    public ClockInOverlayMapper$FormattedShiftSchedule(ClockInOverlayViewModel.ShiftScheduleDisplay shiftScheduleDisplay, String str) {
        this.display = shiftScheduleDisplay;
        this.timeRange = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockInOverlayMapper$FormattedShiftSchedule)) {
            return false;
        }
        ClockInOverlayMapper$FormattedShiftSchedule clockInOverlayMapper$FormattedShiftSchedule = (ClockInOverlayMapper$FormattedShiftSchedule) obj;
        return this.display.equals(clockInOverlayMapper$FormattedShiftSchedule.display) && this.timeRange.equals(clockInOverlayMapper$FormattedShiftSchedule.timeRange);
    }

    public final int hashCode() {
        return this.timeRange.hashCode() + (this.display.text.hashCode() * 31);
    }

    public final String toString() {
        return "FormattedShiftSchedule(display=" + this.display + ", timeRange=" + this.timeRange + ")";
    }
}
