package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ShippingCarrier implements WireEnum {
    SHIPPING_CARRIER_UNSPECIFIED(0),
    SHIPPING_CARRIER_SELLER(1),
    SHIPPING_CARRIER_USPS(2),
    SHIPPING_CARRIER_UPS(3),
    SHIPPING_CARRIER_FEDEX(4),
    SHIPPING_CARRIER_CANADA_POST(5),
    SHIPPING_CARRIER_DHL_EXPRESS(6);

    public static final ShippingCarrier$Companion$ADAPTER$1 ADAPTER;
    public static final FeeType.Companion Companion;
    public final int value;

    static {
        ShippingCarrier shippingCarrier = SHIPPING_CARRIER_UNSPECIFIED;
        Companion = new FeeType.Companion();
        ADAPTER = new ShippingCarrier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ShippingCarrier.class), Syntax.PROTO_2, shippingCarrier);
    }

    ShippingCarrier(int i) {
        this.value = i;
    }

    public static final ShippingCarrier fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return SHIPPING_CARRIER_UNSPECIFIED;
            case 1:
                return SHIPPING_CARRIER_SELLER;
            case 2:
                return SHIPPING_CARRIER_USPS;
            case 3:
                return SHIPPING_CARRIER_UPS;
            case 4:
                return SHIPPING_CARRIER_FEDEX;
            case 5:
                return SHIPPING_CARRIER_CANADA_POST;
            case 6:
                return SHIPPING_CARRIER_DHL_EXPRESS;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
