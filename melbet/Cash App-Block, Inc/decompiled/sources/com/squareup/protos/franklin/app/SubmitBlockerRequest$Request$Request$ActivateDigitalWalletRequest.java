package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest extends zzdh {
    public final ActivateDigitalWalletRequest value;

    public SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest(ActivateDigitalWalletRequest activateDigitalWalletRequest) {
        activateDigitalWalletRequest.getClass();
        this.value = activateDigitalWalletRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$ActivateDigitalWalletRequest) obj).value);
    }

    public final ActivateDigitalWalletRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActivateDigitalWalletRequest(value=" + this.value + ")";
    }
}
