package com.squareup.cash.transfers.viewmodels;

/* loaded from: classes7.dex */
public interface RecurringReloadsChangeInstrumentViewEvent {

    public final class CloseClick implements RecurringReloadsChangeInstrumentViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return -2121891676;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class GoToLinkedBanksClicked implements RecurringReloadsChangeInstrumentViewEvent {
        public static final GoToLinkedBanksClicked INSTANCE = new GoToLinkedBanksClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoToLinkedBanksClicked);
        }

        public final int hashCode() {
            return 1713231424;
        }

        public final String toString() {
            return "GoToLinkedBanksClicked";
        }
    }
}
