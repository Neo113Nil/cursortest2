package com.squareup.protos.cash.usher.api;

import androidx.room.util.DBUtil;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData extends DBUtil {
    public final GetPreSignInDataResponse.ContextualOnboardingIntroData value;

    public GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData(GetPreSignInDataResponse.ContextualOnboardingIntroData contextualOnboardingIntroData) {
        contextualOnboardingIntroData.getClass();
        this.value = contextualOnboardingIntroData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) && Intrinsics.areEqual(this.value, ((GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ContextualOnboardingIntroData(value=" + this.value + ")";
    }
}
