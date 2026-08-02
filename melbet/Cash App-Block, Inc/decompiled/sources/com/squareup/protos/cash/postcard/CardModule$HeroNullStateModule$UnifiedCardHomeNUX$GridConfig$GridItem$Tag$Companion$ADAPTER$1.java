package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Tag$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Tag.Companion.getClass();
        if (i == 0) {
            return CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Tag.TAG_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Tag.WAND;
    }
}
