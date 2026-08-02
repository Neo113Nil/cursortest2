package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdt;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest extends zzdt {
    public final DigitalWalletTokenProvisioningRequestData.GooglePayRequest value;

    public DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest(DigitalWalletTokenProvisioningRequestData.GooglePayRequest googlePayRequest) {
        googlePayRequest.getClass();
        this.value = googlePayRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest) && Intrinsics.areEqual(this.value, ((DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GooglePayRequest(value=" + this.value + ")";
    }
}
