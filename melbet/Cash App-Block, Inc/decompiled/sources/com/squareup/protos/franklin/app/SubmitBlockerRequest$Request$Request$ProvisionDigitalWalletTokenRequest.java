package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest extends zzdh {
    public final ProvisionDigitalWalletTokenRequest value;

    public SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest(ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest) {
        provisionDigitalWalletTokenRequest.getClass();
        this.value = provisionDigitalWalletTokenRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$ProvisionDigitalWalletTokenRequest) obj).value);
    }

    public final ProvisionDigitalWalletTokenRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ProvisionDigitalWalletTokenRequest(value=" + this.value + ")";
    }
}
