package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InputValue$InputData$Data$AddressValue extends zzil {
    public final LocalAddress value;

    public InputValue$InputData$Data$AddressValue(LocalAddress localAddress) {
        localAddress.getClass();
        this.value = localAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputValue$InputData$Data$AddressValue) && Intrinsics.areEqual(this.value, ((InputValue$InputData$Data$AddressValue) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AddressValue(value=" + this.value + ")";
    }
}
