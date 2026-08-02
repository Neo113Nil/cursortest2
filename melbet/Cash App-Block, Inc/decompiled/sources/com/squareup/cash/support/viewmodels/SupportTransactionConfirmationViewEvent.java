package com.squareup.cash.support.viewmodels;

/* loaded from: classes7.dex */
public interface SupportTransactionConfirmationViewEvent {

    public final class NoClicked implements SupportTransactionConfirmationViewEvent {
        public static final NoClicked INSTANCE = new NoClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoClicked);
        }

        public final int hashCode() {
            return 1161150331;
        }

        public final String toString() {
            return "NoClicked";
        }
    }

    public final class YesClicked implements SupportTransactionConfirmationViewEvent {
        public static final YesClicked INSTANCE = new YesClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof YesClicked);
        }

        public final int hashCode() {
            return 482749835;
        }

        public final String toString() {
            return "YesClicked";
        }
    }
}
