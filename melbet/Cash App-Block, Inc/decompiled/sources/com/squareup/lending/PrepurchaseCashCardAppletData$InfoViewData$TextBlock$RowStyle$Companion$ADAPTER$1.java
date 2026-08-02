package com.squareup.lending;

import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoViewData$TextBlock$RowStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.Companion.getClass();
        if (i == 1) {
            return PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.STANDARD;
        }
        if (i != 2) {
            return null;
        }
        return PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle.PROMINENT;
    }
}
