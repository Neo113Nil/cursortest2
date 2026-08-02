package com.squareup.cash.work.viewmodels;

import java.time.OffsetDateTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftSection2ViewEvent$DisabledClockInTapped implements WorkHomeViewEvent {
    public final OffsetDateTime startDateTime;
    public final String timeZoneId;

    public ShiftSection2ViewEvent$DisabledClockInTapped(OffsetDateTime offsetDateTime, String str) {
        offsetDateTime.getClass();
        this.startDateTime = offsetDateTime;
        this.timeZoneId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftSection2ViewEvent$DisabledClockInTapped)) {
            return false;
        }
        ShiftSection2ViewEvent$DisabledClockInTapped shiftSection2ViewEvent$DisabledClockInTapped = (ShiftSection2ViewEvent$DisabledClockInTapped) obj;
        return Intrinsics.areEqual(this.startDateTime, shiftSection2ViewEvent$DisabledClockInTapped.startDateTime) && Intrinsics.areEqual(this.timeZoneId, shiftSection2ViewEvent$DisabledClockInTapped.timeZoneId);
    }

    public final int hashCode() {
        int hashCode = this.startDateTime.hashCode() * 31;
        String str = this.timeZoneId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DisabledClockInTapped(startDateTime=" + this.startDateTime + ", timeZoneId=" + this.timeZoneId + ")";
    }
}
