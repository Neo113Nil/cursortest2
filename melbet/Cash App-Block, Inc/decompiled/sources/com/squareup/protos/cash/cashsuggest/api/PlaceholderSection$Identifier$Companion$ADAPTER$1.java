package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.PlaceholderSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PlaceholderSection$Identifier$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PlaceholderSection.Identifier.Companion.getClass();
        if (i == 1) {
            return PlaceholderSection.Identifier.CLIENT_SUGGESTIONS;
        }
        if (i == 2) {
            return PlaceholderSection.Identifier.CONTACTS_ON_CASH;
        }
        if (i == 3) {
            return PlaceholderSection.Identifier.CONTACTS_OFF_CASH;
        }
        if (i != 4) {
            return null;
        }
        return PlaceholderSection.Identifier.CARD_BOOSTS;
    }
}
