package com.squareup.protos.cash.cashplato.api.v1;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PersonalizedAdsToggleResponse$Response$Error extends zzuj {
    public final PersonalizedAdsError value;

    public PersonalizedAdsToggleResponse$Response$Error(PersonalizedAdsError personalizedAdsError) {
        personalizedAdsError.getClass();
        this.value = personalizedAdsError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalizedAdsToggleResponse$Response$Error) && Intrinsics.areEqual(this.value, ((PersonalizedAdsToggleResponse$Response$Error) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Error(value=" + this.value + ")";
    }
}
