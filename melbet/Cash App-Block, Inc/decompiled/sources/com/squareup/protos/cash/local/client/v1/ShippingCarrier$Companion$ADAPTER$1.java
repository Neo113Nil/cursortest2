package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ShippingCarrier$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ShippingCarrier.Companion.getClass();
        switch (i) {
            case 0:
                return ShippingCarrier.SHIPPING_CARRIER_UNSPECIFIED;
            case 1:
                return ShippingCarrier.SHIPPING_CARRIER_SELLER;
            case 2:
                return ShippingCarrier.SHIPPING_CARRIER_USPS;
            case 3:
                return ShippingCarrier.SHIPPING_CARRIER_UPS;
            case 4:
                return ShippingCarrier.SHIPPING_CARRIER_FEDEX;
            case 5:
                return ShippingCarrier.SHIPPING_CARRIER_CANADA_POST;
            case 6:
                return ShippingCarrier.SHIPPING_CARRIER_DHL_EXPRESS;
            default:
                return null;
        }
    }
}
