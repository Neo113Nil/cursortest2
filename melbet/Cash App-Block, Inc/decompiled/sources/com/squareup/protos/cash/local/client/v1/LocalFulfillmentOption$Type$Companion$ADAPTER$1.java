package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalFulfillmentOption;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalFulfillmentOption$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalFulfillmentOption.Type.Companion.getClass();
        if (i == 0) {
            return LocalFulfillmentOption.Type.TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalFulfillmentOption.Type.TYPE_PICKUP;
        }
        if (i != 2) {
            return null;
        }
        return LocalFulfillmentOption.Type.TYPE_DINE_IN;
    }
}
