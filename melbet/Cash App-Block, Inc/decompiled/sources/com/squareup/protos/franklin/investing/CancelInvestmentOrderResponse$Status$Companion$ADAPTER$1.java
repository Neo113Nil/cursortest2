package com.squareup.protos.franklin.investing;

import com.squareup.protos.franklin.investing.CancelInvestmentOrderResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CancelInvestmentOrderResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CancelInvestmentOrderResponse.Status.Companion.getClass();
        if (i == 0) {
            return CancelInvestmentOrderResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return CancelInvestmentOrderResponse.Status.SUCCESS;
    }
}
