package com.squareup.protos.cash.cashbusinessaccounts;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum BusinessCategory implements WireEnum {
    BUSINESS_CATEGORY_UNSPECIFIED(0),
    BUSINESS_CATEGORY_DEFAULT_BUSINESS(1);

    public static final BusinessCategory$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        BusinessCategory businessCategory = BUSINESS_CATEGORY_UNSPECIFIED;
        Companion = new Error.Code.Companion(21);
        ADAPTER = new BusinessCategory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BusinessCategory.class), Syntax.PROTO_2, businessCategory);
    }

    BusinessCategory(int i) {
        this.value = i;
    }

    public static final BusinessCategory fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return BUSINESS_CATEGORY_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return BUSINESS_CATEGORY_DEFAULT_BUSINESS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
