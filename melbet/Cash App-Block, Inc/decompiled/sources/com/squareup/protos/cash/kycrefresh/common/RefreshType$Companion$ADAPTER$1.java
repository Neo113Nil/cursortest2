package com.squareup.protos.cash.kycrefresh.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RefreshType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RefreshType.Companion.getClass();
        if (i == 0) {
            return RefreshType.REFRESH_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return RefreshType.PERSONAL_INFO;
        }
        if (i == 2) {
            return RefreshType.DIDV;
        }
        if (i != 3) {
            return null;
        }
        return RefreshType.SOW_SOF;
    }
}
