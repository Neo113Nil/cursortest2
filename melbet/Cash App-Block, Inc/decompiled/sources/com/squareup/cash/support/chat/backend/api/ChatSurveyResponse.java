package com.squareup.cash.support.chat.backend.api;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChatSurveyResponse {
    public final Boolean resolved;
    public final int satisfaction;
    public final List selectedReasons;
    public final String surveyToken;

    public ChatSurveyResponse(String str, Boolean bool, int i, int i2) {
        bool = (i2 & 2) != 0 ? null : bool;
        i = (i2 & 8) != 0 ? 0 : i;
        EmptyList emptyList = EmptyList.INSTANCE;
        str.getClass();
        emptyList.getClass();
        this.surveyToken = str;
        this.resolved = bool;
        this.satisfaction = i;
        this.selectedReasons = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatSurveyResponse)) {
            return false;
        }
        ChatSurveyResponse chatSurveyResponse = (ChatSurveyResponse) obj;
        return Intrinsics.areEqual(this.surveyToken, chatSurveyResponse.surveyToken) && Intrinsics.areEqual(this.resolved, chatSurveyResponse.resolved) && this.satisfaction == chatSurveyResponse.satisfaction && this.selectedReasons.equals(chatSurveyResponse.selectedReasons);
    }

    public final int hashCode() {
        int hashCode = this.surveyToken.hashCode() * 31;
        Boolean bool = this.resolved;
        return this.selectedReasons.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.satisfaction, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.resolved, "ChatSurveyResponse(surveyToken=", this.surveyToken, ", resolved=", ", rating=0, satisfaction=");
        m.append(this.satisfaction);
        m.append(", selectedReasons=");
        m.append(this.selectedReasons);
        m.append(")");
        return m.toString();
    }
}
