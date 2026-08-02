package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LendingInfo$AccessData$Button$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LendingInfo.AccessData.Button.Icon.Companion.getClass();
        if (i == 1) {
            return LendingInfo.AccessData.Button.Icon.CHECKMARK;
        }
        return null;
    }
}
