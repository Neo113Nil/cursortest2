package com.squareup.cash.work.applets.presenters;

import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UpcomingShiftData {
    public final ShiftSchedule shift;
    public final Instant startTime;

    public UpcomingShiftData(ShiftSchedule shiftSchedule, Instant instant) {
        shiftSchedule.getClass();
        this.shift = shiftSchedule;
        this.startTime = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingShiftData)) {
            return false;
        }
        UpcomingShiftData upcomingShiftData = (UpcomingShiftData) obj;
        return Intrinsics.areEqual(this.shift, upcomingShiftData.shift) && this.startTime.equals(upcomingShiftData.startTime);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.startTime.hashCode() + (this.shift.hashCode() * 31)) * 31, 31, false);
    }

    public final String toString() {
        return "UpcomingShiftData(shift=" + this.shift + ", startTime=" + this.startTime + ", isWithinClockInWindow=false, isLate=false)";
    }
}
