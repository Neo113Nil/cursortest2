package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum IdentifierType implements WireEnum {
    IDENTIFIER_TYPE_UNKNOWN(0),
    IDENTIFIER_TYPE_BUSINESS_PROFILE(10),
    IDENTIFIER_TYPE_BUSINESS_MERCHANTEIN_PARENT(11),
    IDENTIFIER_TYPE_BUSINESS_CASH_APP_PAY(12),
    IDENTIFIER_TYPE_BUSINESS_BRAND(13),
    IDENTIFIER_TYPE_SQUARE_MERCHANT(14),
    IDENTIFIER_TYPE_OFFER_OFFERLY(20),
    IDENTIFIER_TYPE_OFFER_BOOST(21);

    public static final IdentifierType$Companion$ADAPTER$1 ADAPTER;
    public static final ImageLayout.Companion Companion;
    public final int value;

    static {
        IdentifierType identifierType = IDENTIFIER_TYPE_UNKNOWN;
        Companion = new ImageLayout.Companion();
        ADAPTER = new IdentifierType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IdentifierType.class), Syntax.PROTO_2, identifierType);
    }

    IdentifierType(int i) {
        this.value = i;
    }

    public static final IdentifierType fromValue(int i) {
        Companion.getClass();
        return ImageLayout.Companion.m3842fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
