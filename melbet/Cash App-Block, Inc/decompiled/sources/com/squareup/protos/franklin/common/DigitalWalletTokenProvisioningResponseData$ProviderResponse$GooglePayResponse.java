package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdu;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse extends zzdu {
    public final DigitalWalletTokenProvisioningResponseData.GooglePayResponse value;

    public DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse(DigitalWalletTokenProvisioningResponseData.GooglePayResponse googlePayResponse) {
        googlePayResponse.getClass();
        this.value = googlePayResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse) && Intrinsics.areEqual(this.value, ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GooglePayResponse(value=" + this.value + ")";
    }
}
