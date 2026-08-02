package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CreditLineSectionHeader$DisplayEffect$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreditLineSectionHeader.DisplayEffect.Companion.getClass();
        if (i == 0) {
            return CreditLineSectionHeader.DisplayEffect.REGULAR;
        }
        if (i != 1) {
            return null;
        }
        return CreditLineSectionHeader.DisplayEffect.FADED;
    }
}
