package com.squareup.cash.support.chat.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ChatMessageAction {

    public final class InitialMessageLoaded implements ChatMessageAction {
        public static final InitialMessageLoaded INSTANCE = new InitialMessageLoaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialMessageLoaded);
        }

        public final int hashCode() {
            return -122157233;
        }

        public final String toString() {
            return "InitialMessageLoaded";
        }
    }

    public final class MessageStatusUpdated implements ChatMessageAction {
        public static final MessageStatusUpdated INSTANCE = new MessageStatusUpdated();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MessageStatusUpdated);
        }

        public final int hashCode() {
            return -2083099415;
        }

        public final String toString() {
            return "MessageStatusUpdated";
        }
    }

    public final class NewMessageLoaded implements ChatMessageAction {
        public final List newMessages;

        public NewMessageLoaded(List list) {
            list.getClass();
            this.newMessages = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewMessageLoaded) && Intrinsics.areEqual(this.newMessages, ((NewMessageLoaded) obj).newMessages);
        }

        public final int hashCode() {
            return this.newMessages.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("NewMessageLoaded(newMessages=", ")", this.newMessages);
        }
    }

    public final class NoAction implements ChatMessageAction {
        public static final NoAction INSTANCE = new NoAction();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoAction);
        }

        public final int hashCode() {
            return 1430543134;
        }

        public final String toString() {
            return "NoAction";
        }
    }

    public final class OldMessageLoaded implements ChatMessageAction {
        public static final OldMessageLoaded INSTANCE = new OldMessageLoaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OldMessageLoaded);
        }

        public final int hashCode() {
            return -1805060916;
        }

        public final String toString() {
            return "OldMessageLoaded";
        }
    }

    public final class PendingMessageDeleted implements ChatMessageAction {
        public static final PendingMessageDeleted INSTANCE = new PendingMessageDeleted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PendingMessageDeleted);
        }

        public final int hashCode() {
            return 141911842;
        }

        public final String toString() {
            return "PendingMessageDeleted";
        }
    }
}
