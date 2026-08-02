package com.squareup.protos.cash.cashplato.api.v1;

import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetPersonalizedAdsStateResponse$Response$State extends EducationalButtonAction {
    public final GetPersonalizedAdsStateResponse.State value;

    public GetPersonalizedAdsStateResponse$Response$State(GetPersonalizedAdsStateResponse.State state) {
        state.getClass();
        this.value = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPersonalizedAdsStateResponse$Response$State) && Intrinsics.areEqual(this.value, ((GetPersonalizedAdsStateResponse$Response$State) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "State(value=" + this.value + ")";
    }
}
