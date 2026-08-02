package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$OrderActivityEntrySubject$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppLocalOrderRenderData.OrderActivityEntrySubject.Companion.getClass();
        if (i == 0) {
            return CashAppLocalOrderRenderData.OrderActivityEntrySubject.ORDER_ACTIVITY_ENTRY_SUBJECT_UNSPECIFIED;
        }
        if (i == 1) {
            return CashAppLocalOrderRenderData.OrderActivityEntrySubject.ORDER_ACTIVITY_ENTRY_SUBJECT_LOCAL;
        }
        if (i == 2) {
            return CashAppLocalOrderRenderData.OrderActivityEntrySubject.ORDER_ACTIVITY_ENTRY_SUBJECT_SQUARE;
        }
        if (i != 3) {
            return null;
        }
        return CashAppLocalOrderRenderData.OrderActivityEntrySubject.ORDER_ACTIVITY_ENTRY_SUBJECT_LOCAL_V2;
    }
}
