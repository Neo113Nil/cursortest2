package com.squareup.cash.work.viewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes7.dex */
public interface ShiftListViewModel {

    public final class Error implements ShiftListViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1445951122;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements ShiftListViewModel {
        public final ScheduleCalendarViewModel calendar;
        public final ImmutableList days;
        public final ShiftFilterViewModel filter;
        public final String monthTitle;

        public Loaded(String str, ScheduleCalendarViewModel scheduleCalendarViewModel, ImmutableList immutableList, ShiftFilterViewModel shiftFilterViewModel) {
            immutableList.getClass();
            this.monthTitle = str;
            this.calendar = scheduleCalendarViewModel;
            this.days = immutableList;
            this.filter = shiftFilterViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.monthTitle.equals(loaded.monthTitle) && this.calendar.equals(loaded.calendar) && Intrinsics.areEqual(this.days, loaded.days) && this.filter.equals(loaded.filter);
        }

        public final int hashCode() {
            return this.filter.sections.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.days, (this.calendar.hashCode() + (this.monthTitle.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            return "Loaded(monthTitle=" + this.monthTitle + ", calendar=" + this.calendar + ", days=" + this.days + ", filter=" + this.filter + ")";
        }
    }

    public final class Loading implements ShiftListViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -194737338;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
