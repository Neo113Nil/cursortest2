package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardModuleElement$Type$SpendingInsightsElement extends zzds {
    public final SpendingInsightsElement value;

    public CardModuleElement$Type$SpendingInsightsElement(SpendingInsightsElement spendingInsightsElement) {
        spendingInsightsElement.getClass();
        this.value = spendingInsightsElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModuleElement$Type$SpendingInsightsElement) && Intrinsics.areEqual(this.value, ((CardModuleElement$Type$SpendingInsightsElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SpendingInsightsElement(value=" + this.value + ")";
    }
}
