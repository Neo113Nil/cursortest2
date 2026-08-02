package com.squareup.protos.cash.cashplato.api.v1;

import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetPersonalizedAdsStateResponse$Response$Error extends EducationalButtonAction {
    public final PersonalizedAdsError value;

    public GetPersonalizedAdsStateResponse$Response$Error(PersonalizedAdsError personalizedAdsError) {
        personalizedAdsError.getClass();
        this.value = personalizedAdsError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPersonalizedAdsStateResponse$Response$Error) && Intrinsics.areEqual(this.value, ((GetPersonalizedAdsStateResponse$Response$Error) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Error(value=" + this.value + ")";
    }
}
