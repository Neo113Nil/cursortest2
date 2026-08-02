package com.squareup.protos.cash.aegis.core;

import com.squareup.protos.cash.aegis.core.CustomLimit;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CustomLimit$LimitType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CustomLimit.LimitType.Companion.getClass();
        if (i == 0) {
            return CustomLimit.LimitType.LIMIT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CustomLimit.LimitType.LIMIT_TYPE_SPONSORED_CARD_SPEND_AMOUNT_30_DAY;
        }
        if (i != 2) {
            return null;
        }
        return CustomLimit.LimitType.LIMIT_TYPE_DEFAULT_CARD_SPEND_AMOUNT_30_DAY;
    }
}
