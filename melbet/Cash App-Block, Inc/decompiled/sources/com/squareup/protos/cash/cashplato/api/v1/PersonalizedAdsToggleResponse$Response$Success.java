package com.squareup.protos.cash.cashplato.api.v1;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuj;

/* loaded from: classes7.dex */
public final class PersonalizedAdsToggleResponse$Response$Success extends zzuj {
    public final boolean value;

    public PersonalizedAdsToggleResponse$Response$Success(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalizedAdsToggleResponse$Response$Success) && this.value == ((PersonalizedAdsToggleResponse$Response$Success) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("Success(value=", ")", this.value);
    }
}
