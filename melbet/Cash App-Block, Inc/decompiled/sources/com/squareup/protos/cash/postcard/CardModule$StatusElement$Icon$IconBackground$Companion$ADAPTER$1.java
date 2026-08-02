package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CardModule$StatusElement$Icon$IconBackground$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardModule.StatusElement.Icon.IconBackground.Companion.getClass();
        if (i == 0) {
            return CardModule.StatusElement.Icon.IconBackground.ICON_BACKGROUND_UNSPECIFIED;
        }
        if (i == 1) {
            return CardModule.StatusElement.Icon.IconBackground.BRAND;
        }
        if (i == 2) {
            return CardModule.StatusElement.Icon.IconBackground.DANGER;
        }
        if (i != 3) {
            return null;
        }
        return CardModule.StatusElement.Icon.IconBackground.SUBTLE;
    }
}
