package com.squareup.cash.transfers.viewmodels;

/* loaded from: classes7.dex */
public interface InstrumentNotLinkedViewEvent {

    public final class BackClick implements InstrumentNotLinkedViewEvent {
        public static final BackClick INSTANCE = new BackClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClick);
        }

        public final int hashCode() {
            return -1918546038;
        }

        public final String toString() {
            return "BackClick";
        }
    }

    public final class CloseClick implements InstrumentNotLinkedViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 935543015;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class ContinueClick implements InstrumentNotLinkedViewEvent {
        public static final ContinueClick INSTANCE = new ContinueClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueClick);
        }

        public final int hashCode() {
            return 952075082;
        }

        public final String toString() {
            return "ContinueClick";
        }
    }
}
