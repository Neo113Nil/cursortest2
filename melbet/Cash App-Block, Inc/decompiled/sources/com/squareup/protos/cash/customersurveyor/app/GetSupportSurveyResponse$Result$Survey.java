package com.squareup.protos.cash.customersurveyor.app;

import app.cash.zipline.loader.LoaderJniKt;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$Result$Survey extends LoaderJniKt {
    public final GetSupportSurveyResponse.Survey value;

    public GetSupportSurveyResponse$Result$Survey(GetSupportSurveyResponse.Survey survey) {
        survey.getClass();
        this.value = survey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetSupportSurveyResponse$Result$Survey) && Intrinsics.areEqual(this.value, ((GetSupportSurveyResponse$Result$Survey) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Survey(value=" + this.value + ")";
    }
}
