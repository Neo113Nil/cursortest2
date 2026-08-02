package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$StatusElement$Accessory$Type$PillButton extends zzkm {
    public final CardModule.Button value;

    public CardModule$StatusElement$Accessory$Type$PillButton(CardModule.Button button) {
        button.getClass();
        this.value = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$StatusElement$Accessory$Type$PillButton) && Intrinsics.areEqual(this.value, ((CardModule$StatusElement$Accessory$Type$PillButton) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PillButton(value=" + this.value + ")";
    }
}
