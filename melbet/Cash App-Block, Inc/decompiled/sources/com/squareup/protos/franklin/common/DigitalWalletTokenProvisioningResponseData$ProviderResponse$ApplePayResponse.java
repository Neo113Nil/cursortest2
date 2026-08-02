package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdu;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse extends zzdu {
    public final DigitalWalletTokenProvisioningResponseData.ApplePayResponse value;

    public DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse(DigitalWalletTokenProvisioningResponseData.ApplePayResponse applePayResponse) {
        applePayResponse.getClass();
        this.value = applePayResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse) && Intrinsics.areEqual(this.value, ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$ApplePayResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ApplePayResponse(value=" + this.value + ")";
    }
}
