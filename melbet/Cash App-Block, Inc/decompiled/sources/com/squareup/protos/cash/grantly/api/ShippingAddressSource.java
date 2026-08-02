package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ShippingAddressSource implements WireEnum {
    SOURCE_UNSPECIFIED(0),
    IMPORTED(1),
    COMMERCE_BROWSER(2),
    CAP_CHECKOUT(3);

    public static final ShippingAddressSource$Companion$ADAPTER$1 ADAPTER;
    public static final Action.Type.Companion Companion;
    public final int value;

    static {
        ShippingAddressSource shippingAddressSource = SOURCE_UNSPECIFIED;
        Companion = new Action.Type.Companion();
        ADAPTER = new ShippingAddressSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ShippingAddressSource.class), Syntax.PROTO_2, shippingAddressSource);
    }

    ShippingAddressSource(int i) {
        this.value = i;
    }

    public static final ShippingAddressSource fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return IMPORTED;
        }
        if (i == 2) {
            return COMMERCE_BROWSER;
        }
        if (i != 3) {
            return null;
        }
        return CAP_CHECKOUT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
