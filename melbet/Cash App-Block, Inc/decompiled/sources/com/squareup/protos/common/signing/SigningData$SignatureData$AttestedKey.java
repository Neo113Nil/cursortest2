package com.squareup.protos.common.signing;

import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.squareup.protos.common.signing.SigningData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SigningData$SignatureData$AttestedKey extends zzms {
    public final SigningData.AttestedKeySigningData value;

    public SigningData$SignatureData$AttestedKey(SigningData.AttestedKeySigningData attestedKeySigningData) {
        attestedKeySigningData.getClass();
        this.value = attestedKeySigningData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SigningData$SignatureData$AttestedKey) && Intrinsics.areEqual(this.value, ((SigningData$SignatureData$AttestedKey) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AttestedKey(value=" + this.value + ")";
    }
}
