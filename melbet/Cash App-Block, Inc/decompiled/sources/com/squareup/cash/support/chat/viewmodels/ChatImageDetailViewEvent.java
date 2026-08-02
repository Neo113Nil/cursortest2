package com.squareup.cash.support.chat.viewmodels;

/* loaded from: classes7.dex */
public abstract class ChatImageDetailViewEvent {

    public final class CloseImageDetail extends ChatImageDetailViewEvent {
        public static final CloseImageDetail INSTANCE = new CloseImageDetail();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseImageDetail);
        }

        public final int hashCode() {
            return 1938604519;
        }

        public final String toString() {
            return "CloseImageDetail";
        }
    }

    public final class TapImageDetail extends ChatImageDetailViewEvent {
        public static final TapImageDetail INSTANCE = new TapImageDetail();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapImageDetail);
        }

        public final int hashCode() {
            return 295991324;
        }

        public final String toString() {
            return "TapImageDetail";
        }
    }
}
