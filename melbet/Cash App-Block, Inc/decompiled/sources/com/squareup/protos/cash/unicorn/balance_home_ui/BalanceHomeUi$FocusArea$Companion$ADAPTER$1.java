package com.squareup.protos.cash.unicorn.balance_home_ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BalanceHomeUi$FocusArea$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BalanceHomeUi$FocusArea.Companion.getClass();
        if (i == 1) {
            return BalanceHomeUi$FocusArea.ACCOUNT_AND_ROUTING;
        }
        return null;
    }
}
