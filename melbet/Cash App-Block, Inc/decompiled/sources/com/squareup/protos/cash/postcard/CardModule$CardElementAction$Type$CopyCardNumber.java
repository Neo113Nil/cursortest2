package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$Type$CopyCardNumber extends zzkk {
    public final CardModule.CardElementAction.CopyCardNumber value;

    public CardModule$CardElementAction$Type$CopyCardNumber(CardModule.CardElementAction.CopyCardNumber copyCardNumber) {
        copyCardNumber.getClass();
        this.value = copyCardNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$CardElementAction$Type$CopyCardNumber) && Intrinsics.areEqual(this.value, ((CardModule$CardElementAction$Type$CopyCardNumber) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CopyCardNumber(value=" + this.value + ")";
    }
}
