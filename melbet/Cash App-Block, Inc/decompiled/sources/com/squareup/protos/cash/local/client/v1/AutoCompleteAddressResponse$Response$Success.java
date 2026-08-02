package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.squareup.protos.cash.local.client.v1.AutoCompleteAddressResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AutoCompleteAddressResponse$Response$Success extends zzhk {
    public final AutoCompleteAddressResponse.Success value;

    public AutoCompleteAddressResponse$Response$Success(AutoCompleteAddressResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoCompleteAddressResponse$Response$Success) && Intrinsics.areEqual(this.value, ((AutoCompleteAddressResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
