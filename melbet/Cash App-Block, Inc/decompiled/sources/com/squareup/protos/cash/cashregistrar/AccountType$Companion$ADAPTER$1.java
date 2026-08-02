package com.squareup.protos.cash.cashregistrar;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AccountType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AccountType.Companion.getClass();
        if (i == 1) {
            return AccountType.CHECKING;
        }
        if (i == 2) {
            return AccountType.SAVINGS;
        }
        if (i == 3) {
            return AccountType.SPONSORED_CHECKING;
        }
        if (i != 4) {
            return null;
        }
        return AccountType.SPONSORED_SAVINGS;
    }
}
