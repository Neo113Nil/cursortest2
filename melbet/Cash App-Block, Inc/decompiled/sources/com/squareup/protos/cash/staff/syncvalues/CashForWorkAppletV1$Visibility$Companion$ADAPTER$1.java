package com.squareup.protos.cash.staff.syncvalues;

import com.squareup.protos.cash.staff.syncvalues.CashForWorkAppletV1;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CashForWorkAppletV1$Visibility$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashForWorkAppletV1.Visibility.Companion.getClass();
        if (i == 0) {
            return CashForWorkAppletV1.Visibility.VISIBILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return CashForWorkAppletV1.Visibility.VISIBLE;
        }
        if (i != 2) {
            return null;
        }
        return CashForWorkAppletV1.Visibility.HIDDEN;
    }
}
