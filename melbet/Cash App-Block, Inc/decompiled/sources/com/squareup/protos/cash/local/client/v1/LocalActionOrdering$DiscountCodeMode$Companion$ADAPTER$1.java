package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalActionOrdering$DiscountCodeMode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalActionOrdering.DiscountCodeMode.Companion.getClass();
        if (i == 0) {
            return LocalActionOrdering.DiscountCodeMode.DISCOUNT_CODE_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalActionOrdering.DiscountCodeMode.DISCOUNT_CODE_MODE_DISABLED;
        }
        if (i == 2) {
            return LocalActionOrdering.DiscountCodeMode.DISCOUNT_CODE_MODE_ENABLED_SINGLE_CODE;
        }
        if (i != 3) {
            return null;
        }
        return LocalActionOrdering.DiscountCodeMode.DISCOUNT_CODE_MODE_ENABLED_MULTIPLE_CODES;
    }
}
