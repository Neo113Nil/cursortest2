package com.squareup.cash.work.webview.presenters;

/* loaded from: classes7.dex */
public interface OtkRedirectUseCaseState {

    public final class Failed implements OtkRedirectUseCaseState {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return -127668718;
        }

        public final String toString() {
            return "Failed";
        }
    }

    /* loaded from: classes8.dex */
    public final class Ready implements OtkRedirectUseCaseState {
        public static final Ready INSTANCE = new Ready();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ready);
        }

        public final int hashCode() {
            return -1101303506;
        }

        public final String toString() {
            return "Ready";
        }
    }
}
