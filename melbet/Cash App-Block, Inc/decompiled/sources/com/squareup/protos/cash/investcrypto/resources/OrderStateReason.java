package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OrderStateReason implements WireEnum {
    MANUAL(1),
    CUSTOM_ORDER_TYPE_CHANGED(4),
    CUSTOM_ORDER_LIMITS_EXCEEDED(5),
    INSUFFICIENT_FUNDS(7),
    LIMITS_EXCEEDED(8),
    RISK_FAILURE(9),
    DENYLISTED(11),
    DENYLISTED_TAX_B_NOTICE(12),
    ORDER_ABANDONED(13),
    ORDER_EXPIRED(14),
    CUSTOMER_REGION_NOT_AVAILABLE(15),
    CUSTOMER_CONTROL_DISABLED_BY_SPONSOR(16),
    DENYLISTED_TAX_B_NOTICE_ON_SPONSOR(17),
    ORDER_REJECTION_GENERIC_ERROR(18),
    TRADING_HALTED(19),
    ACCOUNT_FROZEN(20),
    ZERO_OR_NEGATIVE_AMOUNT(21),
    ACCOUNT_DENYLISTED(22),
    CUSTOMER_ELIGIBILITY_VIOLATION(23),
    CASH_FOR_BUSINESS(24),
    ORDER_ABANDONED_FAILED_PUSH_REVERSAL(25);

    public final int value;
    public static final ContactAliasType.Companion Companion = new ContactAliasType.Companion();
    public static final OrderStateReason$Companion$ADAPTER$1 ADAPTER = new OrderStateReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderStateReason.class), Syntax.PROTO_2, null);

    OrderStateReason(int i) {
        this.value = i;
    }

    public static final OrderStateReason fromValue(int i) {
        Companion.getClass();
        return ContactAliasType.Companion.m3890fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
