package com.squareup.cash.transfers.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes7.dex */
public interface ScheduledReloadConfirmationViewEvent {

    public final class AmountClicked implements ScheduledReloadConfirmationViewEvent {
        public static final AmountClicked INSTANCE = new AmountClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AmountClicked);
        }

        public final int hashCode() {
            return -463582782;
        }

        public final String toString() {
            return "AmountClicked";
        }
    }

    public final class Close implements ScheduledReloadConfirmationViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 71411211;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ConfirmClicked implements ScheduledReloadConfirmationViewEvent {
        public static final ConfirmClicked INSTANCE = new ConfirmClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClicked);
        }

        public final int hashCode() {
            return 815646356;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }

    public final class DayClicked implements ScheduledReloadConfirmationViewEvent {
        public static final DayClicked INSTANCE = new DayClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DayClicked);
        }

        public final int hashCode() {
            return -1635981128;
        }

        public final String toString() {
            return "DayClicked";
        }
    }

    public final class FrequencyClicked implements ScheduledReloadConfirmationViewEvent {
        public static final FrequencyClicked INSTANCE = new FrequencyClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FrequencyClicked);
        }

        public final int hashCode() {
            return 1181917496;
        }

        public final String toString() {
            return "FrequencyClicked";
        }
    }

    public final class InstrumentCellTapped implements ScheduledReloadConfirmationViewEvent {
        public static final InstrumentCellTapped INSTANCE = new InstrumentCellTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InstrumentCellTapped);
        }

        public final int hashCode() {
            return 1020561762;
        }

        public final String toString() {
            return "InstrumentCellTapped";
        }
    }
}
