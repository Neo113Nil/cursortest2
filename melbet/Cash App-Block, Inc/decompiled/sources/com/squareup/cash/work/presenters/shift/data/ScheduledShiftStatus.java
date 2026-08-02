package com.squareup.cash.work.presenters.shift.data;

/* loaded from: classes7.dex */
public interface ScheduledShiftStatus {

    public final class BeforeClockInWindow implements ScheduledShiftStatus {
        public static final BeforeClockInWindow INSTANCE = new BeforeClockInWindow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BeforeClockInWindow);
        }

        public final int hashCode() {
            return 952182429;
        }

        public final String toString() {
            return "BeforeClockInWindow";
        }
    }

    public final class DataUnavailable implements ScheduledShiftStatus {
        public static final DataUnavailable INSTANCE = new DataUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DataUnavailable);
        }

        public final int hashCode() {
            return -1540956417;
        }

        public final String toString() {
            return "DataUnavailable";
        }
    }

    public final class EarlyClockInBlocked implements ScheduledShiftStatus {
        public static final EarlyClockInBlocked INSTANCE = new EarlyClockInBlocked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EarlyClockInBlocked);
        }

        public final int hashCode() {
            return 2029047573;
        }

        public final String toString() {
            return "EarlyClockInBlocked";
        }
    }

    public final class InEarlyWindow implements ScheduledShiftStatus {
        public static final InEarlyWindow INSTANCE = new InEarlyWindow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InEarlyWindow);
        }

        public final int hashCode() {
            return -665738809;
        }

        public final String toString() {
            return "InEarlyWindow";
        }
    }

    public final class InOnTimeWindow implements ScheduledShiftStatus {
        public static final InOnTimeWindow INSTANCE = new InOnTimeWindow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InOnTimeWindow);
        }

        public final int hashCode() {
            return -1743296952;
        }

        public final String toString() {
            return "InOnTimeWindow";
        }
    }

    public final class NoScheduledShift implements ScheduledShiftStatus {
        public static final NoScheduledShift INSTANCE = new NoScheduledShift();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoScheduledShift);
        }

        public final int hashCode() {
            return -1925312931;
        }

        public final String toString() {
            return "NoScheduledShift";
        }
    }

    public final class ShiftEnded implements ScheduledShiftStatus {
        public static final ShiftEnded INSTANCE = new ShiftEnded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShiftEnded);
        }

        public final int hashCode() {
            return -839957761;
        }

        public final String toString() {
            return "ShiftEnded";
        }
    }

    default boolean getCanClockIn() {
        return (this instanceof InOnTimeWindow) || (this instanceof InEarlyWindow);
    }
}
