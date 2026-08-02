package com.squareup.cash.work.applets.presenters;

import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import java.time.Instant;
import java.time.OffsetDateTime;

/* loaded from: classes7.dex */
public abstract class ShiftsTileDataLoaderKt {
    public static final Instant startTime(ShiftSchedule shiftSchedule) {
        CalendarEvent calendarEvent;
        String str;
        ShiftSchedule.Version version = shiftSchedule.published_version;
        if (version == null || (calendarEvent = version.calendar_event) == null || (str = calendarEvent.start_datetime) == null) {
            return null;
        }
        try {
            return OffsetDateTime.parse(str).toInstant();
        } catch (Exception unused) {
            return null;
        }
    }
}
