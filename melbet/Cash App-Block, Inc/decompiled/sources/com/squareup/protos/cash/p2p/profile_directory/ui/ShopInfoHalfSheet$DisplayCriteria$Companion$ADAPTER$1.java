package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ShopInfoHalfSheet$DisplayCriteria$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ShopInfoHalfSheet.DisplayCriteria.Companion.getClass();
        if (i == 0) {
            return ShopInfoHalfSheet.DisplayCriteria.ONCE_PER_SECTION;
        }
        if (i == 1) {
            return ShopInfoHalfSheet.DisplayCriteria.ALWAYS;
        }
        if (i != 2) {
            return null;
        }
        return ShopInfoHalfSheet.DisplayCriteria.NEVER;
    }
}
