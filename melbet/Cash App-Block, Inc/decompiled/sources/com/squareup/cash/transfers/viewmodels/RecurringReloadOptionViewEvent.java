package com.squareup.cash.transfers.viewmodels;

/* loaded from: classes7.dex */
public interface RecurringReloadOptionViewEvent {

    public final class AmountClick implements RecurringReloadOptionViewEvent {
        public static final AmountClick INSTANCE = new AmountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AmountClick);
        }

        public final int hashCode() {
            return 1781725747;
        }

        public final String toString() {
            return "AmountClick";
        }
    }

    public final class BackClick implements RecurringReloadOptionViewEvent {
        public static final BackClick INSTANCE = new BackClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClick);
        }

        public final int hashCode() {
            return 1888744388;
        }

        public final String toString() {
            return "BackClick";
        }
    }

    public final class FrequencyClick implements RecurringReloadOptionViewEvent {
        public static final FrequencyClick INSTANCE = new FrequencyClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FrequencyClick);
        }

        public final int hashCode() {
            return -1578011511;
        }

        public final String toString() {
            return "FrequencyClick";
        }
    }

    public final class FrequencyDayClick implements RecurringReloadOptionViewEvent {
        public static final FrequencyDayClick INSTANCE = new FrequencyDayClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FrequencyDayClick);
        }

        public final int hashCode() {
            return -1125017429;
        }

        public final String toString() {
            return "FrequencyDayClick";
        }
    }

    public final class FromClick implements RecurringReloadOptionViewEvent {
        public static final FromClick INSTANCE = new FromClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FromClick);
        }

        public final int hashCode() {
            return 634266337;
        }

        public final String toString() {
            return "FromClick";
        }
    }

    public final class IncrementAmountClick implements RecurringReloadOptionViewEvent {
        public static final IncrementAmountClick INSTANCE = new IncrementAmountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IncrementAmountClick);
        }

        public final int hashCode() {
            return 1804871262;
        }

        public final String toString() {
            return "IncrementAmountClick";
        }
    }

    public final class MinimumBalanceClick implements RecurringReloadOptionViewEvent {
        public static final MinimumBalanceClick INSTANCE = new MinimumBalanceClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MinimumBalanceClick);
        }

        public final int hashCode() {
            return 2006301277;
        }

        public final String toString() {
            return "MinimumBalanceClick";
        }
    }

    public final class ToggleClick implements RecurringReloadOptionViewEvent {
        public static final ToggleClick INSTANCE = new ToggleClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleClick);
        }

        public final int hashCode() {
            return -1947857737;
        }

        public final String toString() {
            return "ToggleClick";
        }
    }
}
