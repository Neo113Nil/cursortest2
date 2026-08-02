package com.squareup.cash.work.presenters.shift.data;

/* loaded from: classes7.dex */
public interface ClockInEnabledReason {

    public final class BypassedRestrictions implements ClockInEnabledReason {
        public static final BypassedRestrictions INSTANCE = new BypassedRestrictions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BypassedRestrictions);
        }

        public final int hashCode() {
            return 1704471914;
        }

        public final String toString() {
            return "BypassedRestrictions";
        }
    }

    public final class InClockInWindow implements ClockInEnabledReason {
        public static final InClockInWindow INSTANCE = new InClockInWindow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InClockInWindow);
        }

        public final int hashCode() {
            return 1943688930;
        }

        public final String toString() {
            return "InClockInWindow";
        }
    }

    public final class LocationAllowsUnscheduled implements ClockInEnabledReason {
        public static final LocationAllowsUnscheduled INSTANCE = new LocationAllowsUnscheduled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocationAllowsUnscheduled);
        }

        public final int hashCode() {
            return -1048565319;
        }

        public final String toString() {
            return "LocationAllowsUnscheduled";
        }
    }
}
