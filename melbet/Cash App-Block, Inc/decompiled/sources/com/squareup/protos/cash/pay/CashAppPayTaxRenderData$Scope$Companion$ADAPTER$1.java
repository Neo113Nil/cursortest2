package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayTaxRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppPayTaxRenderData$Scope$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppPayTaxRenderData.Scope.Companion.getClass();
        if (i == 1) {
            return CashAppPayTaxRenderData.Scope.ORDER;
        }
        if (i != 2) {
            return null;
        }
        return CashAppPayTaxRenderData.Scope.LINE_ITEM;
    }
}
