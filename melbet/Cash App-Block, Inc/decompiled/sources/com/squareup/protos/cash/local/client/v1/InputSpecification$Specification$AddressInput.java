package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzik;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InputSpecification$Specification$AddressInput extends zzik {
    public final AddressInputSpec value;

    public InputSpecification$Specification$AddressInput(AddressInputSpec addressInputSpec) {
        addressInputSpec.getClass();
        this.value = addressInputSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputSpecification$Specification$AddressInput) && Intrinsics.areEqual(this.value, ((InputSpecification$Specification$AddressInput) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AddressInput(value=" + this.value + ")";
    }
}
