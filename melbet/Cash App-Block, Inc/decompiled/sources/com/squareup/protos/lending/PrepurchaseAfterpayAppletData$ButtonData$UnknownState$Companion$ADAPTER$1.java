package com.squareup.protos.lending;

import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$ButtonData$UnknownState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PrepurchaseAfterpayAppletData.ButtonData.UnknownState.Companion.getClass();
        if (i == 1) {
            return PrepurchaseAfterpayAppletData.ButtonData.UnknownState.FIXED_STRING;
        }
        return null;
    }
}
