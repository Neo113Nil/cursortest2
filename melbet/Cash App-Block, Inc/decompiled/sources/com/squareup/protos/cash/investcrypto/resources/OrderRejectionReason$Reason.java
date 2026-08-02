package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OrderRejectionReason$Reason implements WireEnum {
    INSUFFICIENT_FUNDS(1),
    INTERNAL_FAILURE(2),
    CUSTOM_ORDER_TYPE_CHANGED(3),
    ORDER_EXPIRED(4),
    LIMITS_EXCEEDED(5),
    RISK_FAILURE(6),
    CUSTOM_ORDER_LIMITS_EXCEEDED(7),
    CUSTOM_ORDER_INVALID_ORIGINAL_PRICE(8),
    CRYPTO_STORED_BALANCE_NOT_UNIQUE(9),
    INVALID_ORDER_STATE(10),
    DENYLISTED(11),
    DENYLISTED_TAX_B_NOTICE(12),
    ORDER_ABANDONED(13),
    CUSTOMER_REGION_NOT_AVAILABLE(14),
    CUSTOMER_CONTROL_DISABLED_BY_SPONSOR(15),
    DENYLISTED_TAX_B_NOTICE_ON_SPONSOR(16),
    INDETERMINATE_LEDGER_RESPONSE(17),
    ORDER_REJECTION_GENERIC_ERROR(18),
    TRADING_HALTED(19),
    ACCOUNT_FROZEN(20),
    ZERO_OR_NEGATIVE_AMOUNT(21),
    ACCOUNT_DENYLISTED(22),
    INCORRECT_FEATURE_METADATA(23),
    INVALID_MONEY_AMOUNT(24),
    CUSTOMER_ELIGIBILITY_VIOLATION(25),
    CASH_FOR_BUSINESS(26);

    public final int value;
    public static final Origin.Companion Companion = new Origin.Companion();
    public static final OrderRejectionReason$Reason$Companion$ADAPTER$1 ADAPTER = new OrderRejectionReason$Reason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderRejectionReason$Reason.class), Syntax.PROTO_2, null);

    OrderRejectionReason$Reason(int i) {
        this.value = i;
    }

    public static final OrderRejectionReason$Reason fromValue(int i) {
        Companion.getClass();
        return Origin.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
