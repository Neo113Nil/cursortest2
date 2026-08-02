package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ShopInfoResponse$DisplayCriteria$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ShopInfoResponse.DisplayCriteria.Companion.getClass();
        if (i == 0) {
            return ShopInfoResponse.DisplayCriteria.ONCE_PER_SECTION;
        }
        if (i == 1) {
            return ShopInfoResponse.DisplayCriteria.ALWAYS;
        }
        if (i != 2) {
            return null;
        }
        return ShopInfoResponse.DisplayCriteria.NEVER;
    }
}
