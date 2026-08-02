package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest extends zzdh {
    public final CompleteDigitalWalletTokenProvisioningRequest value;

    public SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest(CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest) {
        completeDigitalWalletTokenProvisioningRequest.getClass();
        this.value = completeDigitalWalletTokenProvisioningRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$CompleteDigitalWalletTokenProvisioningRequest) obj).value);
    }

    public final CompleteDigitalWalletTokenProvisioningRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CompleteDigitalWalletTokenProvisioningRequest(value=" + this.value + ")";
    }
}
