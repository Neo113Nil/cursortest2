package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card extends zzkl {
    public final CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card value;

    public CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card card) {
        card.getClass();
        this.value = card;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card) && Intrinsics.areEqual(this.value, ((CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Type$Card) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Card(value=" + this.value + ")";
    }
}
