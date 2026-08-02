package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public enum OfferType implements WireEnum {
    PAY_LESS_CLO(1),
    PAY_LESS_AFFILIATE(2),
    PAY_LESS_CAP(3),
    PAY_LATER_INN(6),
    PAY_LATER_OON(7),
    PAY_LATER_AFTERPAY(4),
    PAY_LATER_SUP(5);

    public final int value;
    public static final ByteString.Companion Companion = new ByteString.Companion();
    public static final OfferType$Companion$ADAPTER$1 ADAPTER = new OfferType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OfferType.class), Syntax.PROTO_2, null);

    OfferType(int i) {
        this.value = i;
    }

    public static final OfferType fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 1:
                return PAY_LESS_CLO;
            case 2:
                return PAY_LESS_AFFILIATE;
            case 3:
                return PAY_LESS_CAP;
            case 4:
                return PAY_LATER_AFTERPAY;
            case 5:
                return PAY_LATER_SUP;
            case 6:
                return PAY_LATER_INN;
            case 7:
                return PAY_LATER_OON;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
