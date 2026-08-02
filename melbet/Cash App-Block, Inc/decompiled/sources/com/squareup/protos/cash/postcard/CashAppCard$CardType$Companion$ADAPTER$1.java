package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppCard$CardType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppCard.CardType.Companion.getClass();
        if (i == 0) {
            return CashAppCard.CardType.CARD_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CashAppCard.CardType.PHYSICAL;
        }
        if (i != 2) {
            return null;
        }
        return CashAppCard.CardType.VIRTUAL;
    }
}
