package com.squareup.protos.cash.local.client.app.v1.card;

import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalCard$ActionButton$DisplayCondition$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalCard.ActionButton.DisplayCondition.Companion.getClass();
        if (i == 0) {
            return LocalCard.ActionButton.DisplayCondition.DISPLAY_CONDITION_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalCard.ActionButton.DisplayCondition.DISPLAY_CONDITION_ALWAYS_MATCH;
        }
        if (i != 2) {
            return null;
        }
        return LocalCard.ActionButton.DisplayCondition.DISPLAY_CONDITION_ACCEPTING_ORDERS;
    }
}
