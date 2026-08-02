package com.squareup.cash.support.chat.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ChatExitPromptSheetViewModel {

    public final class Loading extends ChatExitPromptSheetViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -169142713;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Prompt extends ChatExitPromptSheetViewModel {
        public final String endConversationButtonText;
        public final String message;
        public final String saveAndContinueButtonText;
        public final String title;

        public Prompt(String str, String str2, String str3, String str4) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            this.title = str;
            this.message = str2;
            this.saveAndContinueButtonText = str3;
            this.endConversationButtonText = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Prompt)) {
                return false;
            }
            Prompt prompt = (Prompt) obj;
            return Intrinsics.areEqual(this.title, prompt.title) && Intrinsics.areEqual(this.message, prompt.message) && Intrinsics.areEqual(this.saveAndContinueButtonText, prompt.saveAndContinueButtonText) && Intrinsics.areEqual(this.endConversationButtonText, prompt.endConversationButtonText);
        }

        public final int hashCode() {
            return this.endConversationButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.saveAndContinueButtonText);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Prompt(title=", this.title, ", message=", this.message, ", saveAndContinueButtonText="), this.saveAndContinueButtonText, ", endConversationButtonText=", this.endConversationButtonText, ")");
        }
    }

    public final class Survey extends ChatExitPromptSheetViewModel {
        public final ChatSurveyViewModel surveyModel;
        public final String surveyToken;

        public Survey(String str, ChatSurveyViewModel chatSurveyViewModel) {
            chatSurveyViewModel.getClass();
            this.surveyToken = str;
            this.surveyModel = chatSurveyViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Survey)) {
                return false;
            }
            Survey survey = (Survey) obj;
            return this.surveyToken.equals(survey.surveyToken) && Intrinsics.areEqual(this.surveyModel, survey.surveyModel);
        }

        public final int hashCode() {
            return this.surveyModel.hashCode() + (this.surveyToken.hashCode() * 31);
        }

        public final String toString() {
            return "Survey(surveyToken=" + this.surveyToken + ", surveyModel=" + this.surveyModel + ")";
        }
    }
}
