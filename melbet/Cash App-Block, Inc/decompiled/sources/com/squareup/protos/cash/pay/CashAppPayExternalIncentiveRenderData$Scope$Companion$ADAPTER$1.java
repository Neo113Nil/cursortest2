package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayExternalIncentiveRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayExternalIncentiveRenderData$Scope$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayExternalIncentiveRenderData.Scope.Companion.getClass();
        if (i == 1) {
            return CashAppPayExternalIncentiveRenderData.Scope.ORDER;
        }
        if (i != 2) {
            return null;
        }
        return CashAppPayExternalIncentiveRenderData.Scope.LINE_ITEM;
    }
}
