package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class EntryPointType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EntryPointType.Companion.getClass();
        if (i == 1) {
            return EntryPointType.REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION;
        }
        if (i != 2) {
            return null;
        }
        return EntryPointType.IN_APP;
    }
}
