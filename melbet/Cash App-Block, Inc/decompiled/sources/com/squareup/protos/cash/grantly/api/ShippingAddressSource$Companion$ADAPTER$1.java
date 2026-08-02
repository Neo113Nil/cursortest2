package com.squareup.protos.cash.grantly.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ShippingAddressSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ShippingAddressSource.Companion.getClass();
        if (i == 0) {
            return ShippingAddressSource.SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return ShippingAddressSource.IMPORTED;
        }
        if (i == 2) {
            return ShippingAddressSource.COMMERCE_BROWSER;
        }
        if (i != 3) {
            return null;
        }
        return ShippingAddressSource.CAP_CHECKOUT;
    }
}
