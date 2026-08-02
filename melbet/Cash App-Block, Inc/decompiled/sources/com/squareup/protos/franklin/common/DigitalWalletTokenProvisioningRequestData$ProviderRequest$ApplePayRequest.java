package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdt;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest extends zzdt {
    public final DigitalWalletTokenProvisioningRequestData.ApplePayRequest value;

    public DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest(DigitalWalletTokenProvisioningRequestData.ApplePayRequest applePayRequest) {
        applePayRequest.getClass();
        this.value = applePayRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest) && Intrinsics.areEqual(this.value, ((DigitalWalletTokenProvisioningRequestData$ProviderRequest$ApplePayRequest) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ApplePayRequest(value=" + this.value + ")";
    }
}
