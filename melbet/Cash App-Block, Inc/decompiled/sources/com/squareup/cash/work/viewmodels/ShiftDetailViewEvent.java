package com.squareup.cash.work.viewmodels;

/* loaded from: classes7.dex */
public interface ShiftDetailViewEvent {

    public final class BackClicked implements ShiftDetailViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -341531160;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class ClockInClicked implements ShiftDetailViewEvent {
        public static final ClockInClicked INSTANCE = new ClockInClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClockInClicked);
        }

        public final int hashCode() {
            return 916407596;
        }

        public final String toString() {
            return "ClockInClicked";
        }
    }

    /* loaded from: classes8.dex */
    public final class DisabledClockInTapped implements ShiftDetailViewEvent {
        public static final DisabledClockInTapped INSTANCE = new DisabledClockInTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DisabledClockInTapped);
        }

        public final int hashCode() {
            return 2123331531;
        }

        public final String toString() {
            return "DisabledClockInTapped";
        }
    }

    public final class OverflowMenuClicked implements ShiftDetailViewEvent {
        public static final OverflowMenuClicked INSTANCE = new OverflowMenuClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OverflowMenuClicked);
        }

        public final int hashCode() {
            return -1050528498;
        }

        public final String toString() {
            return "OverflowMenuClicked";
        }
    }
}
