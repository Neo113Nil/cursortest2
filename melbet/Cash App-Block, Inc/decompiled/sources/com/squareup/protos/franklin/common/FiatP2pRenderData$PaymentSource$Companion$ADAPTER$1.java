package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.FiatP2pRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class FiatP2pRenderData$PaymentSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FiatP2pRenderData.PaymentSource.Companion.getClass();
        if (i == 1) {
            return FiatP2pRenderData.PaymentSource.FIATLY;
        }
        if (i == 2) {
            return FiatP2pRenderData.PaymentSource.P2P_ENCORE;
        }
        if (i != 3) {
            return null;
        }
        return FiatP2pRenderData.PaymentSource.SQUARE_PAYROLL;
    }
}
