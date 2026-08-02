package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalAdditionalBuyerInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalAdditionalBuyerInfo$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalAdditionalBuyerInfo.Type.Companion.getClass();
        if (i == 0) {
            return LocalAdditionalBuyerInfo.Type.TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalAdditionalBuyerInfo.Type.TYPE_BUYER_NAME;
        }
        if (i == 2) {
            return LocalAdditionalBuyerInfo.Type.TYPE_BUYER_PHONE_NUMBER;
        }
        if (i != 3) {
            return null;
        }
        return LocalAdditionalBuyerInfo.Type.TYPE_BUYER_EMAIL;
    }
}
