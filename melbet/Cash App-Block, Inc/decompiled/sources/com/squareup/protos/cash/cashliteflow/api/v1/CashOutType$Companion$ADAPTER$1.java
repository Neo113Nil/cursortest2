package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashOutType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashOutType.Companion.getClass();
        if (i == 0) {
            return CashOutType.CASH_OUT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CashOutType.CASH_OUT_TYPE_CLABE;
        }
        if (i != 2) {
            return null;
        }
        return CashOutType.CASH_OUT_TYPE_ACH;
    }
}
