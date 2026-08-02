package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class HalfsheetId$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        HalfsheetId.Companion.getClass();
        if (i == 1) {
            return HalfsheetId.HALFSHEET_ID_AVAILABLE_CREDIT;
        }
        if (i == 2) {
            return HalfsheetId.HALFSHEET_ID_TOTAL_OWED;
        }
        if (i != 3) {
            return null;
        }
        return HalfsheetId.HALFSHEET_ID_UPCOMING_PAYMENT_ROW_NON_CAP;
    }
}
