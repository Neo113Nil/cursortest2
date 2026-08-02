package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardModuleElement$Type$RoundUpsElement extends zzds {
    public final RoundUpsElement value;

    public CardModuleElement$Type$RoundUpsElement(RoundUpsElement roundUpsElement) {
        roundUpsElement.getClass();
        this.value = roundUpsElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModuleElement$Type$RoundUpsElement) && Intrinsics.areEqual(this.value, ((CardModuleElement$Type$RoundUpsElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RoundUpsElement(value=" + this.value + ")";
    }
}
