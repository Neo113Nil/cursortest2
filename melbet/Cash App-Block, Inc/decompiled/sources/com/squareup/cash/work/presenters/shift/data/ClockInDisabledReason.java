package com.squareup.cash.work.presenters.shift.data;

/* loaded from: classes7.dex */
public interface ClockInDisabledReason {

    public final class BeforeClockInWindow implements ClockInDisabledReason {
        public static final BeforeClockInWindow INSTANCE = new BeforeClockInWindow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BeforeClockInWindow);
        }

        public final int hashCode() {
            return -136540215;
        }

        public final String toString() {
            return "BeforeClockInWindow";
        }
    }

    public final class EarlyClockInBlocked implements ClockInDisabledReason {
        public static final EarlyClockInBlocked INSTANCE = new EarlyClockInBlocked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EarlyClockInBlocked);
        }

        public final int hashCode() {
            return 940324929;
        }

        public final String toString() {
            return "EarlyClockInBlocked";
        }
    }

    public final class ShiftEnded implements ClockInDisabledReason {
        public static final ShiftEnded INSTANCE = new ShiftEnded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShiftEnded);
        }

        public final int hashCode() {
            return 1008506963;
        }

        public final String toString() {
            return "ShiftEnded";
        }
    }

    public final class UnscheduledClockInBlocked implements ClockInDisabledReason {
        public static final UnscheduledClockInBlocked INSTANCE = new UnscheduledClockInBlocked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnscheduledClockInBlocked);
        }

        public final int hashCode() {
            return 686493074;
        }

        public final String toString() {
            return "UnscheduledClockInBlocked";
        }
    }
}
