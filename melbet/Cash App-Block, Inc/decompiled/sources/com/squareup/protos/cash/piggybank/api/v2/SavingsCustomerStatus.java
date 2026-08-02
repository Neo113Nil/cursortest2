package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SavingsCustomerStatus implements WireEnum {
    SAVINGS_CUSTOMER_STATUS_UNSPECIFIED(0),
    SAVINGS_CUSTOMER_STATUS_INELIGIBLE(1),
    SAVINGS_CUSTOMER_STATUS_ELIGIBLE(2),
    SAVINGS_CUSTOMER_STATUS_ADOPTED(3);

    public static final SavingsCustomerStatus$Companion$ADAPTER$1 ADAPTER;
    public static final TaxEnvironment.Companion Companion;
    public final int value;

    static {
        SavingsCustomerStatus savingsCustomerStatus = SAVINGS_CUSTOMER_STATUS_UNSPECIFIED;
        Companion = new TaxEnvironment.Companion();
        ADAPTER = new SavingsCustomerStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SavingsCustomerStatus.class), Syntax.PROTO_2, savingsCustomerStatus);
    }

    SavingsCustomerStatus(int i) {
        this.value = i;
    }

    public static final SavingsCustomerStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return SAVINGS_CUSTOMER_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return SAVINGS_CUSTOMER_STATUS_INELIGIBLE;
        }
        if (i == 2) {
            return SAVINGS_CUSTOMER_STATUS_ELIGIBLE;
        }
        if (i != 3) {
            return null;
        }
        return SAVINGS_CUSTOMER_STATUS_ADOPTED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
