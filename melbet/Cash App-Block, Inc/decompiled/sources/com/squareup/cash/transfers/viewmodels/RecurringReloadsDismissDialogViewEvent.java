package com.squareup.cash.transfers.viewmodels;

/* loaded from: classes7.dex */
public interface RecurringReloadsDismissDialogViewEvent {

    public final class CancelClick implements RecurringReloadsDismissDialogViewEvent {
        public static final CancelClick INSTANCE = new CancelClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClick);
        }

        public final int hashCode() {
            return -1789967257;
        }

        public final String toString() {
            return "CancelClick";
        }
    }

    public final class ConfirmClick implements RecurringReloadsDismissDialogViewEvent {
        public static final ConfirmClick INSTANCE = new ConfirmClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClick);
        }

        public final int hashCode() {
            return 406695055;
        }

        public final String toString() {
            return "ConfirmClick";
        }
    }

    public final class OnBack implements RecurringReloadsDismissDialogViewEvent {
        public static final OnBack INSTANCE = new OnBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBack);
        }

        public final int hashCode() {
            return 2144943757;
        }

        public final String toString() {
            return "OnBack";
        }
    }
}
