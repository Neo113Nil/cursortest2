package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$StatusElement$Accessory$Type$Toggle extends zzkm {
    public final CardModule.Toggle value;

    public CardModule$StatusElement$Accessory$Type$Toggle(CardModule.Toggle toggle) {
        toggle.getClass();
        this.value = toggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$StatusElement$Accessory$Type$Toggle) && Intrinsics.areEqual(this.value, ((CardModule$StatusElement$Accessory$Type$Toggle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Toggle(value=" + this.value + ")";
    }
}
