package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardModuleElement$Type$SelectedBoostElement extends zzds {
    public final SelectBoostElement value;

    public CardModuleElement$Type$SelectedBoostElement(SelectBoostElement selectBoostElement) {
        selectBoostElement.getClass();
        this.value = selectBoostElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModuleElement$Type$SelectedBoostElement) && Intrinsics.areEqual(this.value, ((CardModuleElement$Type$SelectedBoostElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectedBoostElement(value=" + this.value + ")";
    }
}
