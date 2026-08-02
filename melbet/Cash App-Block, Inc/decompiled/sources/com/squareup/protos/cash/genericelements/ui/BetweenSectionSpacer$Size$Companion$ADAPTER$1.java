package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.BetweenSectionSpacer;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BetweenSectionSpacer$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BetweenSectionSpacer.Size.Companion.getClass();
        if (i == 1) {
            return BetweenSectionSpacer.Size.LARGE;
        }
        if (i == 2) {
            return BetweenSectionSpacer.Size.XLARGE;
        }
        if (i != 3) {
            return null;
        }
        return BetweenSectionSpacer.Size.XLARGE_BELLOW_CELL;
    }
}
