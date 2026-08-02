package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SyncInvestmentCategory$PrefixIcon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentCategory.PrefixIcon.Companion.getClass();
        if (i == 0) {
            return SyncInvestmentCategory.PrefixIcon.DO_NOT_USE_PREFIX_ICON;
        }
        if (i == 1) {
            return SyncInvestmentCategory.PrefixIcon.UP_ARROW;
        }
        if (i != 2) {
            return null;
        }
        return SyncInvestmentCategory.PrefixIcon.DOWN_ARROW;
    }
}
