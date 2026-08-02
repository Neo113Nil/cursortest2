package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.CreditDetailSheet;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CreditDetailSheet$DetailRow$DisplayStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreditDetailSheet.DetailRow.DisplayStyle.Companion.getClass();
        if (i == 0) {
            return CreditDetailSheet.DetailRow.DisplayStyle.UNSPECIFIED;
        }
        if (i == 1) {
            return CreditDetailSheet.DetailRow.DisplayStyle.DISPLAY_CREDIT;
        }
        if (i != 2) {
            return null;
        }
        return CreditDetailSheet.DetailRow.DisplayStyle.HIDE_CREDIT;
    }
}
