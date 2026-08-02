package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public enum BusinessUnit implements WireEnum {
    DEFAULT_BUSINESS_UNIT_DO_NOT_USE(0),
    SQUARE(1),
    CASH_APP(2),
    AFTERPAY(3);

    public static final BusinessUnit$Companion$ADAPTER$1 ADAPTER;
    public static final POPMatchingFactory Companion;
    public final int value;

    static {
        BusinessUnit businessUnit = DEFAULT_BUSINESS_UNIT_DO_NOT_USE;
        Companion = new POPMatchingFactory(7);
        ADAPTER = new BusinessUnit$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BusinessUnit.class), Syntax.PROTO_2, businessUnit);
    }

    BusinessUnit(int i) {
        this.value = i;
    }

    public static final BusinessUnit fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return DEFAULT_BUSINESS_UNIT_DO_NOT_USE;
        }
        if (i == 1) {
            return SQUARE;
        }
        if (i == 2) {
            return CASH_APP;
        }
        if (i != 3) {
            return null;
        }
        return AFTERPAY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
