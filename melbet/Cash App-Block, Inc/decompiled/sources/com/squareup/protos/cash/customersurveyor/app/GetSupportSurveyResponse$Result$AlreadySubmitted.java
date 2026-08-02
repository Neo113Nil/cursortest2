package com.squareup.protos.cash.customersurveyor.app;

import app.cash.zipline.loader.LoaderJniKt;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetSupportSurveyResponse$Result$AlreadySubmitted extends LoaderJniKt {
    public final GetSupportSurveyResponse.AlreadySubmitted value;

    public GetSupportSurveyResponse$Result$AlreadySubmitted(GetSupportSurveyResponse.AlreadySubmitted alreadySubmitted) {
        alreadySubmitted.getClass();
        this.value = alreadySubmitted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetSupportSurveyResponse$Result$AlreadySubmitted) && Intrinsics.areEqual(this.value, ((GetSupportSurveyResponse$Result$AlreadySubmitted) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AlreadySubmitted(value=" + this.value + ")";
    }
}
