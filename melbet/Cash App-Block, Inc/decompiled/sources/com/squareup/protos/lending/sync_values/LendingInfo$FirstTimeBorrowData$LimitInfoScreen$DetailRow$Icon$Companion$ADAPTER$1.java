package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$LimitInfoScreen$DetailRow$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon.Companion.getClass();
        if (i == 1) {
            return LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon.CARD;
        }
        if (i == 2) {
            return LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon.DEPOSIT;
        }
        if (i != 3) {
            return null;
        }
        return LendingInfo.FirstTimeBorrowData.LimitInfoScreen.DetailRow.Icon.BANK;
    }
}
