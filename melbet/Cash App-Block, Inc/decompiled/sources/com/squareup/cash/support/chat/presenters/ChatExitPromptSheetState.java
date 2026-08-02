package com.squareup.cash.support.chat.presenters;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public abstract class ChatExitPromptSheetState {

    /* loaded from: classes6.dex */
    public final class Loading extends ChatExitPromptSheetState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1281671896;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes6.dex */
    public final class Prompt extends ChatExitPromptSheetState {
        public static final Prompt INSTANCE = new Prompt();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Prompt);
        }

        public final int hashCode() {
            return -256584632;
        }

        public final String toString() {
            return "Prompt";
        }
    }

    public final class ShowSurvey extends ChatExitPromptSheetState {
        public final String surveyToken;

        public ShowSurvey(String str) {
            this.surveyToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSurvey) && this.surveyToken.equals(((ShowSurvey) obj).surveyToken);
        }

        public final int hashCode() {
            return this.surveyToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShowSurvey(surveyToken=", this.surveyToken, ")");
        }
    }
}
