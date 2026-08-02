package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsNoticeParams;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class EarningsNoticeParams$EntryPoint$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EarningsNoticeParams.EntryPoint.Companion.getClass();
        if (i == 1) {
            return EarningsNoticeParams.EntryPoint.ENTRY_POINT_MONEY_TAB;
        }
        if (i == 2) {
            return EarningsNoticeParams.EntryPoint.ENTRY_POINT_MONTHLY_PUSH;
        }
        if (i == 3) {
            return EarningsNoticeParams.EntryPoint.ENTRY_POINT_INTRO_PUSH;
        }
        if (i != 4) {
            return null;
        }
        return EarningsNoticeParams.EntryPoint.ENTRY_POINT_INTRO_EMAIL;
    }
}
