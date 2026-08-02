package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardCustomizationInputs$CustomizationSource$CustomDesign extends zzdb {
    public final CustomDesign value;

    public CardCustomizationInputs$CustomizationSource$CustomDesign(CustomDesign customDesign) {
        customDesign.getClass();
        this.value = customDesign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardCustomizationInputs$CustomizationSource$CustomDesign) && Intrinsics.areEqual(this.value, ((CardCustomizationInputs$CustomizationSource$CustomDesign) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CustomDesign(value=" + this.value + ")";
    }
}
