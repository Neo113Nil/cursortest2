package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardCustomizationInputs$CustomizationSource$PresetDesign extends zzdb {
    public final PresetDesign value;

    public CardCustomizationInputs$CustomizationSource$PresetDesign(PresetDesign presetDesign) {
        presetDesign.getClass();
        this.value = presetDesign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardCustomizationInputs$CustomizationSource$PresetDesign) && Intrinsics.areEqual(this.value, ((CardCustomizationInputs$CustomizationSource$PresetDesign) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PresetDesign(value=" + this.value + ")";
    }
}
