package com.squareup.cash.work.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ShiftListViewEvent {

    public final class BackClicked implements ShiftListViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 652315707;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    /* loaded from: classes6.dex */
    public final class DateClicked implements ShiftListViewEvent {
        public final LocalDate date;

        public DateClicked(LocalDate localDate) {
            localDate.getClass();
            this.date = localDate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateClicked) && Intrinsics.areEqual(this.date, ((DateClicked) obj).date);
        }

        public final int hashCode() {
            return this.date.hashCode();
        }

        public final String toString() {
            return "DateClicked(date=" + this.date + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class FilterApplied implements ShiftListViewEvent {
        public final Map selections;

        public FilterApplied(Map map) {
            map.getClass();
            this.selections = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterApplied) && Intrinsics.areEqual(this.selections, ((FilterApplied) obj).selections);
        }

        public final int hashCode() {
            return this.selections.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("FilterApplied(selections=", ")", this.selections);
        }
    }

    /* loaded from: classes6.dex */
    public final class LoadNext implements ShiftListViewEvent {
        public static final LoadNext INSTANCE = new LoadNext();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadNext);
        }

        public final int hashCode() {
            return -187772962;
        }

        public final String toString() {
            return "LoadNext";
        }
    }

    /* loaded from: classes6.dex */
    public final class LoadPrevious implements ShiftListViewEvent {
        public static final LoadPrevious INSTANCE = new LoadPrevious();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadPrevious);
        }

        public final int hashCode() {
            return -1369664926;
        }

        public final String toString() {
            return "LoadPrevious";
        }
    }

    /* loaded from: classes6.dex */
    public final class MonthChanged implements ShiftListViewEvent {
        public final YearMonth month;

        public MonthChanged(YearMonth yearMonth) {
            yearMonth.getClass();
            this.month = yearMonth;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MonthChanged) && Intrinsics.areEqual(this.month, ((MonthChanged) obj).month);
        }

        public final int hashCode() {
            return this.month.hashCode();
        }

        public final String toString() {
            return "MonthChanged(month=" + this.month + ")";
        }
    }

    public final class MonthTitleClicked implements ShiftListViewEvent {
        public static final MonthTitleClicked INSTANCE = new MonthTitleClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MonthTitleClicked);
        }

        public final int hashCode() {
            return -400954358;
        }

        public final String toString() {
            return "MonthTitleClicked";
        }
    }

    /* loaded from: classes6.dex */
    public final class Retry implements ShiftListViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 1075717603;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* loaded from: classes6.dex */
    public final class ScheduleClicked implements ShiftListViewEvent {
        public final String scheduleId;

        public ScheduleClicked(String str) {
            str.getClass();
            this.scheduleId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScheduleClicked) && Intrinsics.areEqual(this.scheduleId, ((ScheduleClicked) obj).scheduleId);
        }

        public final int hashCode() {
            return this.scheduleId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ScheduleClicked(scheduleId=", this.scheduleId, ")");
        }
    }

    /* loaded from: classes6.dex */
    public final class TimecardClicked implements ShiftListViewEvent {
        public final String timecardId;

        public TimecardClicked(String str) {
            str.getClass();
            this.timecardId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimecardClicked) && Intrinsics.areEqual(this.timecardId, ((TimecardClicked) obj).timecardId);
        }

        public final int hashCode() {
            return this.timecardId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TimecardClicked(timecardId=", this.timecardId, ")");
        }
    }
}
