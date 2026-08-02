package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes7.dex */
public final class ScheduleCalendarViewModel {
    public final MapBuilder dots;
    public final DayOfWeek firstDayOfWeek;
    public final boolean isExpanded;
    public final LocalDate selectedDate;
    public final LocalDate today;
    public final YearMonth viewedMonth;

    public ScheduleCalendarViewModel(LocalDate localDate, YearMonth yearMonth, boolean z, DayOfWeek dayOfWeek, LocalDate localDate2, MapBuilder mapBuilder) {
        this.selectedDate = localDate;
        this.viewedMonth = yearMonth;
        this.isExpanded = z;
        this.firstDayOfWeek = dayOfWeek;
        this.today = localDate2;
        this.dots = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleCalendarViewModel)) {
            return false;
        }
        ScheduleCalendarViewModel scheduleCalendarViewModel = (ScheduleCalendarViewModel) obj;
        return this.selectedDate.equals(scheduleCalendarViewModel.selectedDate) && this.viewedMonth.equals(scheduleCalendarViewModel.viewedMonth) && this.isExpanded == scheduleCalendarViewModel.isExpanded && this.firstDayOfWeek == scheduleCalendarViewModel.firstDayOfWeek && this.today.equals(scheduleCalendarViewModel.today) && this.dots.equals(scheduleCalendarViewModel.dots);
    }

    public final int hashCode() {
        return this.dots.hashCode() + ((this.today.hashCode() + ((this.firstDayOfWeek.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.viewedMonth.hashCode() + (this.selectedDate.hashCode() * 31)) * 31, 31, this.isExpanded)) * 31)) * 31);
    }

    public final String toString() {
        return "ScheduleCalendarViewModel(selectedDate=" + this.selectedDate + ", viewedMonth=" + this.viewedMonth + ", isExpanded=" + this.isExpanded + ", firstDayOfWeek=" + this.firstDayOfWeek + ", today=" + this.today + ", dots=" + this.dots + ")";
    }
}
