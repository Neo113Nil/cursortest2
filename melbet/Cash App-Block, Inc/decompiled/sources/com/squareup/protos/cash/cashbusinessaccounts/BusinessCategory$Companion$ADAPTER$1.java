package com.squareup.protos.cash.cashbusinessaccounts;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BusinessCategory$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BusinessCategory.Companion.getClass();
        if (i == 0) {
            return BusinessCategory.BUSINESS_CATEGORY_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return BusinessCategory.BUSINESS_CATEGORY_DEFAULT_BUSINESS;
    }
}
