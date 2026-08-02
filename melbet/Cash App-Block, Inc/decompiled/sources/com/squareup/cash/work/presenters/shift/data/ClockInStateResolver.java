package com.squareup.cash.work.presenters.shift.data;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.data.api.ClockInControls;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.LocationScopedClockInControls;
import com.squareup.cash.work.presenters.shift.data.ClockInDisabledReason;
import com.squareup.cash.work.presenters.shift.data.ClockInEnabledReason;
import com.squareup.cash.work.presenters.shift.data.ScheduledShiftStatus;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ClockInStateResolver {
    public final AndroidClock clock;

    public ClockInStateResolver(AndroidClock androidClock) {
        this.clock = androidClock;
    }

    public static Instant parseInstant(String str) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = OffsetDateTime.parse(str).toInstant();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Instant) failure;
    }

    public final ClockInEnabledResult getClockInEnabledForLocationResult(boolean z, boolean z2, LocationScopedClockInControls locationScopedClockInControls, Instant instant, boolean z3) {
        locationScopedClockInControls.getClass();
        if (z || !z2) {
            return new ClockInEnabledResult(true, ClockInEnabledReason.BypassedRestrictions.INSTANCE, null, null, 4);
        }
        if (!locationScopedClockInControls.isEarlyAndUnscheduledClockInBlocked) {
            return new ClockInEnabledResult(true, ClockInEnabledReason.LocationAllowsUnscheduled.INSTANCE, null, null, 4);
        }
        if (!z3) {
            return new ClockInEnabledResult(false, null, ClockInDisabledReason.UnscheduledClockInBlocked.INSTANCE, null, 2);
        }
        Instant now = DimensionKt.now(this.clock);
        return (instant == null || now.isBefore(instant)) ? !now.isBefore(locationScopedClockInControls.earlyClockInBoundaryEnd) ? new ClockInEnabledResult(true, ClockInEnabledReason.InClockInWindow.INSTANCE, null, null, 4) : new ClockInEnabledResult(false, null, ClockInDisabledReason.EarlyClockInBlocked.INSTANCE, null, 2) : new ClockInEnabledResult(false, null, ClockInDisabledReason.ShiftEnded.INSTANCE, null, 2);
    }

    public final ClockInEnabledResult getClockInEnabledResult(ClockInEssentials.ClockedOutEssentials clockedOutEssentials) {
        boolean z;
        ScheduledShiftStatus.BeforeClockInWindow beforeClockInWindow;
        String str;
        CalendarEvent calendarEvent;
        String str2;
        String str3;
        Instant parseInstant;
        ClockInDisabledReason clockInDisabledReason;
        ClockInControls clockInControls = clockedOutEssentials.clockInControls;
        boolean z2 = clockInControls.hasOverridePermission || !clockInControls.canEnforceEarlyOrUnscheduledClockIn;
        Collection values = clockInControls.locationScopedControls.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (!((LocationScopedClockInControls) it.next()).isEarlyAndUnscheduledClockInBlocked) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ClockInEssentials.NextShift nextShift = clockedOutEssentials.nextShift;
        Object obj = ScheduledShiftStatus.BeforeClockInWindow.INSTANCE;
        Object obj2 = ScheduledShiftStatus.EarlyClockInBlocked.INSTANCE;
        Object obj3 = ScheduledShiftStatus.InEarlyWindow.INSTANCE;
        Object obj4 = ScheduledShiftStatus.InOnTimeWindow.INSTANCE;
        Object obj5 = ScheduledShiftStatus.ShiftEnded.INSTANCE;
        Object obj6 = ScheduledShiftStatus.NoScheduledShift.INSTANCE;
        Object obj7 = ScheduledShiftStatus.DataUnavailable.INSTANCE;
        if (nextShift == null) {
            beforeClockInWindow = obj6;
        } else {
            ShiftSchedule.Version version = nextShift.shift.published_version;
            if (version != null && (str = version.location_id) != null) {
                LocationScopedClockInControls locationScopedClockInControls = clockInControls.get(str);
                if (version != null && (calendarEvent = version.calendar_event) != null && (str2 = calendarEvent.start_datetime) != null && parseInstant(str2) != null && calendarEvent != null && (str3 = calendarEvent.stop_datetime) != null && (parseInstant = parseInstant(str3)) != null) {
                    Instant now = DimensionKt.now(this.clock);
                    if (now.isBefore(parseInstant)) {
                        Instant instant = locationScopedClockInControls.earlyClockInBoundaryBegin;
                        Instant instant2 = locationScopedClockInControls.earlyClockInBoundaryEnd;
                        beforeClockInWindow = (now.isBefore(instant2) || !now.isBefore(parseInstant)) ? (now.isBefore(instant) || !now.isBefore(instant2)) ? obj : clockInControls.hasOverridePermission || !clockInControls.canEnforceEarlyOrUnscheduledClockIn || !locationScopedClockInControls.isEarlyAndUnscheduledClockInBlocked ? obj3 : obj2 : obj4;
                    } else {
                        beforeClockInWindow = obj5;
                    }
                }
            }
            beforeClockInWindow = obj7;
        }
        if (z2) {
            return new ClockInEnabledResult(true, ClockInEnabledReason.BypassedRestrictions.INSTANCE, null, beforeClockInWindow, 4);
        }
        if (z) {
            return new ClockInEnabledResult(true, ClockInEnabledReason.LocationAllowsUnscheduled.INSTANCE, null, beforeClockInWindow, 4);
        }
        if (beforeClockInWindow.getCanClockIn()) {
            return new ClockInEnabledResult(true, ClockInEnabledReason.InClockInWindow.INSTANCE, null, beforeClockInWindow, 4);
        }
        ScheduledShiftStatus.BeforeClockInWindow beforeClockInWindow2 = beforeClockInWindow;
        if (beforeClockInWindow2.equals(obj2)) {
            clockInDisabledReason = ClockInDisabledReason.EarlyClockInBlocked.INSTANCE;
        } else if (beforeClockInWindow2.equals(obj)) {
            clockInDisabledReason = ClockInDisabledReason.BeforeClockInWindow.INSTANCE;
        } else if (beforeClockInWindow2.equals(obj5)) {
            clockInDisabledReason = ClockInDisabledReason.ShiftEnded.INSTANCE;
        } else {
            if (!beforeClockInWindow2.equals(obj6) && !beforeClockInWindow2.equals(obj7)) {
                if (beforeClockInWindow2.equals(obj4) || beforeClockInWindow2.equals(obj3)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot convert an enabled status to a disabled reason");
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            clockInDisabledReason = ClockInDisabledReason.UnscheduledClockInBlocked.INSTANCE;
        }
        return new ClockInEnabledResult(false, null, clockInDisabledReason, beforeClockInWindow2, 2);
    }

    public final boolean shouldSendShiftToken(boolean z, boolean z2, LocationScopedClockInControls locationScopedClockInControls, String str, String str2, Instant instant) {
        if (str2 == null || !Intrinsics.areEqual(str, str2) || locationScopedClockInControls == null || instant == null) {
            return false;
        }
        if (DimensionKt.now(this.clock).isBefore(instant)) {
            return !((!z && z2 && locationScopedClockInControls.isEarlyAndUnscheduledClockInBlocked) ? r0.isBefore(locationScopedClockInControls.earlyClockInBoundaryEnd) : r0.isBefore(locationScopedClockInControls.earlyClockInBoundaryBegin));
        }
        return false;
    }
}
