package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$StatusElement$Accessory$Type$Push extends zzkm {
    public final CardModule.Push value;

    public CardModule$StatusElement$Accessory$Type$Push(CardModule.Push push) {
        push.getClass();
        this.value = push;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$StatusElement$Accessory$Type$Push) && Intrinsics.areEqual(this.value, ((CardModule$StatusElement$Accessory$Type$Push) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Push(value=" + this.value + ")";
    }
}
