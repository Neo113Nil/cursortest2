package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzik;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InputSpecification$Specification$OptionPicker extends zzik {
    public final OptionPickerSpec value;

    public InputSpecification$Specification$OptionPicker(OptionPickerSpec optionPickerSpec) {
        optionPickerSpec.getClass();
        this.value = optionPickerSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputSpecification$Specification$OptionPicker) && Intrinsics.areEqual(this.value, ((InputSpecification$Specification$OptionPicker) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OptionPicker(value=" + this.value + ")";
    }
}
