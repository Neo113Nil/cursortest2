package com.squareup.protos.cash.spendinginsights;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum CardSpendingInsightType implements WireEnum {
    TOP_LOCATIONS(1),
    RECURRING_PAYMENTS(2),
    AI_SUMMARY(3);

    public final int value;
    public static final TaxEnvironment.Companion Companion = new TaxEnvironment.Companion();
    public static final CardSpendingInsightType$Companion$ADAPTER$1 ADAPTER = new CardSpendingInsightType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightType.class), Syntax.PROTO_2, null);

    CardSpendingInsightType(int i) {
        this.value = i;
    }

    public static final CardSpendingInsightType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return TOP_LOCATIONS;
        }
        if (i == 2) {
            return RECURRING_PAYMENTS;
        }
        if (i != 3) {
            return null;
        }
        return AI_SUMMARY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
