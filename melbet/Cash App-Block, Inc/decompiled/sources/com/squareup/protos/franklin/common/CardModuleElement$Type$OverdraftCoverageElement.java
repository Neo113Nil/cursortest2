package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardModuleElement$Type$OverdraftCoverageElement extends zzds {
    public final OverdraftCoverageElement value;

    public CardModuleElement$Type$OverdraftCoverageElement(OverdraftCoverageElement overdraftCoverageElement) {
        overdraftCoverageElement.getClass();
        this.value = overdraftCoverageElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModuleElement$Type$OverdraftCoverageElement) && Intrinsics.areEqual(this.value, ((CardModuleElement$Type$OverdraftCoverageElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OverdraftCoverageElement(value=" + this.value + ")";
    }
}
