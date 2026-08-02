package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzik;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InputSpecification$Specification$TextInput extends zzik {
    public final TextInputSpec value;

    public InputSpecification$Specification$TextInput(TextInputSpec textInputSpec) {
        textInputSpec.getClass();
        this.value = textInputSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputSpecification$Specification$TextInput) && Intrinsics.areEqual(this.value, ((InputSpecification$Specification$TextInput) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextInput(value=" + this.value + ")";
    }
}
