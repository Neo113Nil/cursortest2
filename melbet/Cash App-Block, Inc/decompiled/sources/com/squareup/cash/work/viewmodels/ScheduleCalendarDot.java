package com.squareup.cash.work.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ScheduleCalendarDot {
    public static final /* synthetic */ ScheduleCalendarDot[] $VALUES;
    public static final ScheduleCalendarDot BLACK;

    /* JADX INFO: Fake field, exist only in values array */
    ScheduleCalendarDot EF0;

    static {
        ScheduleCalendarDot scheduleCalendarDot = new ScheduleCalendarDot("RED", 0);
        ScheduleCalendarDot scheduleCalendarDot2 = new ScheduleCalendarDot("BLACK", 1);
        BLACK = scheduleCalendarDot2;
        $VALUES = new ScheduleCalendarDot[]{scheduleCalendarDot, scheduleCalendarDot2};
    }

    public static ScheduleCalendarDot valueOf(String str) {
        return (ScheduleCalendarDot) Enum.valueOf(ScheduleCalendarDot.class, str);
    }

    public static ScheduleCalendarDot[] values() {
        return (ScheduleCalendarDot[]) $VALUES.clone();
    }
}
