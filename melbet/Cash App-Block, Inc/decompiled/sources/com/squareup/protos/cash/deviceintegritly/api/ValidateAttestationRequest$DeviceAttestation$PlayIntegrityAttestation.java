package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation {
    public final PlayIntegrityAttestation value;

    public ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation(PlayIntegrityAttestation playIntegrityAttestation) {
        playIntegrityAttestation.getClass();
        this.value = playIntegrityAttestation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation) && Intrinsics.areEqual(this.value, ((ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PlayIntegrityAttestation(value=" + this.value + ")";
    }
}
