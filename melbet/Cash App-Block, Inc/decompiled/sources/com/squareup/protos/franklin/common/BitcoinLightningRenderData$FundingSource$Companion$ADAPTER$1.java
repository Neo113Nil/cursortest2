package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.BitcoinLightningRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BitcoinLightningRenderData$FundingSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BitcoinLightningRenderData.FundingSource.Companion.getClass();
        if (i == 0) {
            return BitcoinLightningRenderData.FundingSource.UNKNOWN_FUNDING_SOURCE;
        }
        if (i == 1) {
            return BitcoinLightningRenderData.FundingSource.BTC_BALANCE;
        }
        if (i == 2) {
            return BitcoinLightningRenderData.FundingSource.FIAT_BALANCE;
        }
        if (i != 3) {
            return null;
        }
        return BitcoinLightningRenderData.FundingSource.PAYMENT_AS_A_SERVICE;
    }
}
