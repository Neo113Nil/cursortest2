package com.squareup.cash.transfers.viewmodels;

/* loaded from: classes7.dex */
public interface PendingTransfersConfirmationViewEvent {

    public final class NegativeButtonClick implements PendingTransfersConfirmationViewEvent {
        public static final NegativeButtonClick INSTANCE = new NegativeButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeButtonClick);
        }

        public final int hashCode() {
            return -1447792293;
        }

        public final String toString() {
            return "NegativeButtonClick";
        }
    }

    public final class OnBack implements PendingTransfersConfirmationViewEvent {
        public static final OnBack INSTANCE = new OnBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBack);
        }

        public final int hashCode() {
            return -1043244596;
        }

        public final String toString() {
            return "OnBack";
        }
    }

    public final class PositiveButtonClick implements PendingTransfersConfirmationViewEvent {
        public static final PositiveButtonClick INSTANCE = new PositiveButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveButtonClick);
        }

        public final int hashCode() {
            return -952016617;
        }

        public final String toString() {
            return "PositiveButtonClick";
        }
    }
}
