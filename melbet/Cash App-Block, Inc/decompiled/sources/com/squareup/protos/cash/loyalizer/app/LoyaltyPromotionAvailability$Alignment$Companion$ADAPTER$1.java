package com.squareup.protos.cash.loyalizer.app;

import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionAvailability;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionAvailability$Alignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LoyaltyPromotionAvailability.Alignment.Companion.getClass();
        if (i == 1) {
            return LoyaltyPromotionAvailability.Alignment.LEFT;
        }
        if (i != 2) {
            return null;
        }
        return LoyaltyPromotionAvailability.Alignment.RIGHT;
    }
}
