package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingInfo$AccessData$DetailRow$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingInfo.AccessData.DetailRow.Icon.Companion.getClass();
        if (i == 1) {
            return LendingInfo.AccessData.DetailRow.Icon.CARD;
        }
        if (i == 2) {
            return LendingInfo.AccessData.DetailRow.Icon.DEPOSIT;
        }
        if (i == 3) {
            return LendingInfo.AccessData.DetailRow.Icon.BANK;
        }
        if (i != 4) {
            return null;
        }
        return LendingInfo.AccessData.DetailRow.Icon.CHECK;
    }
}
