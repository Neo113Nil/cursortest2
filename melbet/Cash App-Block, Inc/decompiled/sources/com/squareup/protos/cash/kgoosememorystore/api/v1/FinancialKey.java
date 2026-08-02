package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum FinancialKey implements WireEnum {
    FINANCIAL_KEY_UNSPECIFIED(0),
    FINANCIAL_KEY_HOUSEHOLD_SIZE(1),
    FINANCIAL_KEY_MONTHLY_INCOME(2),
    FINANCIAL_KEY_INCOME_STABILITY(3),
    FINANCIAL_KEY_MONTHLY_EXPENSES(4),
    FINANCIAL_KEY_HOUSING_PAYMENT(5),
    FINANCIAL_KEY_CHECKING_BALANCE(6),
    FINANCIAL_KEY_SAVINGS_BALANCE(7),
    FINANCIAL_KEY_RETIREMENT_BALANCE(8),
    FINANCIAL_KEY_BROKERAGE_BALANCE(9),
    FINANCIAL_KEY_CREDIT_CARD_DEBT(10),
    FINANCIAL_KEY_STUDENT_LOAN_DEBT(11),
    FINANCIAL_KEY_AUTO_LOAN_DEBT(12),
    FINANCIAL_KEY_MORTGAGE_DEBT(13),
    FINANCIAL_KEY_PRIMARY_GOAL(14),
    FINANCIAL_KEY_RISK_TOLERANCE(15),
    FINANCIAL_KEY_EMPLOYMENT_STATUS(16),
    FINANCIAL_KEY_NUMBER_DEPENDENTS(17),
    FINANCIAL_KEY_EMPLOYMENT_TYPE(18);

    public static final FinancialKey$Companion$ADAPTER$1 ADAPTER;
    public static final ContactAliasType.Companion Companion;
    public final int value;

    static {
        FinancialKey financialKey = FINANCIAL_KEY_UNSPECIFIED;
        Companion = new ContactAliasType.Companion();
        ADAPTER = new FinancialKey$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FinancialKey.class), Syntax.PROTO_2, financialKey);
    }

    FinancialKey(int i) {
        this.value = i;
    }

    public static final FinancialKey fromValue(int i) {
        Companion.getClass();
        return ContactAliasType.Companion.m3891fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
