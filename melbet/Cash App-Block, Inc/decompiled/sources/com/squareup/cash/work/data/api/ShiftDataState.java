package com.squareup.cash.work.data.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.time.DayOfWeek;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ShiftDataState {

    public final class Error implements ShiftDataState {
        public final Throwable throwable;

        public Error(Throwable th) {
            this.throwable = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.throwable.equals(((Error) obj).throwable);
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Error(throwable=", ")", this.throwable);
        }
    }

    public final class NotReady implements ShiftDataState {
        public static final NotReady INSTANCE = new NotReady();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotReady);
        }

        public final int hashCode() {
            return -923187796;
        }

        public final String toString() {
            return "NotReady";
        }
    }

    public final class Ready implements ShiftDataState {
        public final DateRangedFeed schedules;
        public final DateRangedFeed timecards;
        public final DayOfWeek weekStartDay;

        public Ready(DayOfWeek dayOfWeek, DateRangedFeed dateRangedFeed, DateRangedFeed dateRangedFeed2) {
            dayOfWeek.getClass();
            dateRangedFeed.getClass();
            dateRangedFeed2.getClass();
            this.weekStartDay = dayOfWeek;
            this.schedules = dateRangedFeed;
            this.timecards = dateRangedFeed2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.weekStartDay == ready.weekStartDay && Intrinsics.areEqual(this.schedules, ready.schedules) && Intrinsics.areEqual(this.timecards, ready.timecards);
        }

        public final int hashCode() {
            return this.timecards.hashCode() + ((this.schedules.hashCode() + (this.weekStartDay.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Ready(weekStartDay=" + this.weekStartDay + ", schedules=" + this.schedules + ", timecards=" + this.timecards + ")";
        }
    }
}
