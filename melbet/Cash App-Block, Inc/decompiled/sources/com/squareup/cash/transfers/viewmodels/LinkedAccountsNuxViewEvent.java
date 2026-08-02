package com.squareup.cash.transfers.viewmodels;

/* loaded from: classes7.dex */
public interface LinkedAccountsNuxViewEvent {

    public final class CloseClick implements LinkedAccountsNuxViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 1866657268;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class CtaClick implements LinkedAccountsNuxViewEvent {
        public static final CtaClick INSTANCE = new CtaClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClick);
        }

        public final int hashCode() {
            return -1106040356;
        }

        public final String toString() {
            return "CtaClick";
        }
    }
}
