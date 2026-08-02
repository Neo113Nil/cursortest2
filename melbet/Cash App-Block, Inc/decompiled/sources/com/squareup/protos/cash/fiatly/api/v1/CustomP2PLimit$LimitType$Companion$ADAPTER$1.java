package com.squareup.protos.cash.fiatly.api.v1;

import com.squareup.protos.cash.fiatly.api.v1.CustomP2PLimit;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CustomP2PLimit$LimitType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CustomP2PLimit.LimitType.Companion.getClass();
        if (i == 0) {
            return CustomP2PLimit.LimitType.LIMIT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CustomP2PLimit.LimitType.LIMIT_TYPE_SPONSORED_P2P_SEND_AMOUNT_30_DAY;
        }
        if (i == 2) {
            return CustomP2PLimit.LimitType.LIMIT_TYPE_DEFAULT_P2P_SEND_AMOUNT_30_DAY;
        }
        if (i != 3) {
            return null;
        }
        return CustomP2PLimit.LimitType.LIMIT_TYPE_DEFAULT_P2P_SEND_AMOUNT_7_DAY;
    }
}
