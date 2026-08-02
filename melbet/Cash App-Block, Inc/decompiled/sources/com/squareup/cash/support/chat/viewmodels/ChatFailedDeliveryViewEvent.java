package com.squareup.cash.support.chat.viewmodels;

/* loaded from: classes7.dex */
public abstract class ChatFailedDeliveryViewEvent {

    public final class Cancel extends ChatFailedDeliveryViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -2077964266;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class DeleteMessage extends ChatFailedDeliveryViewEvent {
        public static final DeleteMessage INSTANCE = new DeleteMessage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeleteMessage);
        }

        public final int hashCode() {
            return 1691683520;
        }

        public final String toString() {
            return "DeleteMessage";
        }
    }

    public final class ResendMessage extends ChatFailedDeliveryViewEvent {
        public static final ResendMessage INSTANCE = new ResendMessage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResendMessage);
        }

        public final int hashCode() {
            return -1597734352;
        }

        public final String toString() {
            return "ResendMessage";
        }
    }
}
