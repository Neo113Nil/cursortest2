package com.squareup.protos.cash.papermate.enums;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class FeeType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FeeType.Companion.getClass();
        if (i == 0) {
            return FeeType.FEE_TYPE_UNKNOWN_DO_NOT_USE;
        }
        if (i == 1) {
            return FeeType.USER_PAID;
        }
        if (i == 2) {
            return FeeType.COVERED;
        }
        if (i != 3) {
            return null;
        }
        return FeeType.UNKNOWN;
    }
}
