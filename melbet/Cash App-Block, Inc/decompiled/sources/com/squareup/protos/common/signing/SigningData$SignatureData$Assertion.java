package com.squareup.protos.common.signing;

import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.squareup.protos.common.signing.SigningData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SigningData$SignatureData$Assertion extends zzms {
    public final SigningData.AssertionSigningData value;

    public SigningData$SignatureData$Assertion(SigningData.AssertionSigningData assertionSigningData) {
        assertionSigningData.getClass();
        this.value = assertionSigningData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SigningData$SignatureData$Assertion) && Intrinsics.areEqual(this.value, ((SigningData$SignatureData$Assertion) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Assertion(value=" + this.value + ")";
    }
}
