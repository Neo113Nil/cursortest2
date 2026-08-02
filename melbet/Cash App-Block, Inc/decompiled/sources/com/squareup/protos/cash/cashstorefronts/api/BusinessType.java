package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum BusinessType implements WireEnum {
    UNKNOWN_BUSINESS_TYPE(0),
    AP_STORE(1),
    BOOST_MERCHANT(2),
    CAP_MERCHANT(3),
    SQ_LOYALTY_MERCHANT(4),
    SQ_OFFER_MERCHANT(5);

    public static final BusinessType$Companion$ADAPTER$1 ADAPTER;
    public static final Alignment.Companion Companion;
    public final int value;

    static {
        BusinessType businessType = UNKNOWN_BUSINESS_TYPE;
        Companion = new Alignment.Companion();
        ADAPTER = new BusinessType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BusinessType.class), Syntax.PROTO_2, businessType);
    }

    BusinessType(int i) {
        this.value = i;
    }

    public static final BusinessType fromValue(int i) {
        Companion.getClass();
        return Alignment.Companion.m3857fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
