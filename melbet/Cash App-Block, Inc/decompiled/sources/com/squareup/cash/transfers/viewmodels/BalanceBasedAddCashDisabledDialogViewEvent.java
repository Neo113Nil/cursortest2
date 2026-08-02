package com.squareup.cash.transfers.viewmodels;

/* loaded from: classes7.dex */
public interface BalanceBasedAddCashDisabledDialogViewEvent {

    public final class NegativeButtonClick implements BalanceBasedAddCashDisabledDialogViewEvent {
        public static final NegativeButtonClick INSTANCE = new NegativeButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeButtonClick);
        }

        public final int hashCode() {
            return -1336800306;
        }

        public final String toString() {
            return "NegativeButtonClick";
        }
    }

    public final class OnBack implements BalanceBasedAddCashDisabledDialogViewEvent {
        public static final OnBack INSTANCE = new OnBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBack);
        }

        public final int hashCode() {
            return 17481849;
        }

        public final String toString() {
            return "OnBack";
        }
    }

    public final class PositiveButtonClick implements BalanceBasedAddCashDisabledDialogViewEvent {
        public static final PositiveButtonClick INSTANCE = new PositiveButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveButtonClick);
        }

        public final int hashCode() {
            return -841024630;
        }

        public final String toString() {
            return "PositiveButtonClick";
        }
    }
}
