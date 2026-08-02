package com.squareup.protos.cash.taxfrontdoor.sync_values;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UpgradeStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UpgradeStatus.Companion.getClass();
        if (i == 0) {
            return UpgradeStatus.NOT_STARTED;
        }
        if (i == 1) {
            return UpgradeStatus.STARTED;
        }
        if (i != 2) {
            return null;
        }
        return UpgradeStatus.COMPLETE;
    }
}
