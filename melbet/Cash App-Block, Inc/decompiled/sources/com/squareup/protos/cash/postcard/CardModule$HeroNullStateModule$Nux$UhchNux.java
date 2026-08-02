package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$Nux$UhchNux {
    public final CardModule.HeroNullStateModule.UnifiedCardHomeNUX value;

    public CardModule$HeroNullStateModule$Nux$UhchNux(CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX) {
        unifiedCardHomeNUX.getClass();
        this.value = unifiedCardHomeNUX;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$HeroNullStateModule$Nux$UhchNux) && Intrinsics.areEqual(this.value, ((CardModule$HeroNullStateModule$Nux$UhchNux) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UhchNux(value=" + this.value + ")";
    }
}
