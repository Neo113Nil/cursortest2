package com.squareup.protos.cash.deviceintegritly.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion {
    public final AppAttestAssertion value;

    public GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion(AppAttestAssertion appAttestAssertion) {
        appAttestAssertion.getClass();
        this.value = appAttestAssertion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion) && Intrinsics.areEqual(this.value, ((GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AppAttestAssertion(value=" + this.value + ")";
    }
}
