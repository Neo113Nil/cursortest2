package com.squareup.protos.lending;

import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$Cell$UnknownState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState.Companion.getClass();
        if (i == 1) {
            return PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState.SELECTABLE_OPTION;
        }
        return null;
    }
}
