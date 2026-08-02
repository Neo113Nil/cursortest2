package com.squareup.cash.support.chat.viewmodels;

/* loaded from: classes7.dex */
public abstract class ChatExitPromptViewEvents {

    public final class EndConversation extends ChatExitPromptViewEvents {
        public static final EndConversation INSTANCE = new EndConversation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndConversation);
        }

        public final int hashCode() {
            return -4123070;
        }

        public final String toString() {
            return "EndConversation";
        }
    }

    public final class SaveAndContinue extends ChatExitPromptViewEvents {
        public static final SaveAndContinue INSTANCE = new SaveAndContinue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveAndContinue);
        }

        public final int hashCode() {
            return -1672997083;
        }

        public final String toString() {
            return "SaveAndContinue";
        }
    }
}
