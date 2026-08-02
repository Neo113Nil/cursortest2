package com.squareup.cash.support.chat.viewmodels;

import com.knotapi.knot.utilities.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ChatExitPromptSheetViewEvents {

    public final class Close extends ChatExitPromptSheetViewEvents {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1112464339;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class EndConversation extends ChatExitPromptSheetViewEvents {
        public static final EndConversation INSTANCE = new EndConversation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndConversation);
        }

        public final int hashCode() {
            return -789909223;
        }

        public final String toString() {
            return "EndConversation";
        }
    }

    public final class SaveAndContinue extends ChatExitPromptSheetViewEvents {
        public static final SaveAndContinue INSTANCE = new SaveAndContinue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveAndContinue);
        }

        public final int hashCode() {
            return 1836184060;
        }

        public final String toString() {
            return "SaveAndContinue";
        }
    }

    public final class SurveyEvent extends ChatExitPromptSheetViewEvents {
        public final ChatSurveyViewEvent event;

        public SurveyEvent(ChatSurveyViewEvent chatSurveyViewEvent) {
            chatSurveyViewEvent.getClass();
            this.event = chatSurveyViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SurveyEvent) && Intrinsics.areEqual(this.event, ((SurveyEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "SurveyEvent(event=" + this.event + ")";
        }
    }
}
