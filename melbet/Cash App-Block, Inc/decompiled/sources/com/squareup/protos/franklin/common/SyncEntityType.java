package com.squareup.protos.franklin.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public enum SyncEntityType implements WireEnum {
    DO_NOT_USE_SYNC_ENTITY_TYPE(0),
    PAYMENT(1),
    CUSTOMER(2),
    TRANSFER(3),
    TRANSACTION(4),
    MERCHANT(5),
    LOYALTY_ACCOUNT(7),
    REWARD_SELECTION(9),
    LOYALTY_PROGRAM(10),
    INVESTMENT_HOLDING(11),
    INVESTMENT_ENTITY(12),
    RECEIPT_ENTITY(13),
    SYNC_VALUE(14),
    CREDIT_LINE(16),
    LOAN(17),
    LOAN_TRANSACTION(18),
    LOAN_ACTIVITY(19),
    INVITATION(20),
    RECURRING_PREFERENCES(21),
    INVESTMENT_CATEGORY(22),
    INVESTMENT_FILTER_GROUP(23),
    INVESTMENT_ENTITY_RANKING(24),
    INVESTMENT_INCENTIVE(25),
    CHECK_DEPOSIT_RECEIPT_ENTITY(26),
    INVEST_DEFAULT_NOTIFICATION_SETTINGS(27),
    CASH_HOUSE_SCREEN(29),
    SPONSORED_ACCOUNT(31),
    DOCUMENT_CATEGORY_ENTITY(32),
    DOCUMENT_ENTITY(33),
    BUSINESS_GRANT(34),
    GIFT_CARD(35),
    NEW_DEVICE_LOGIN(36),
    CRYPTO_PAYROLL_PREFERENCE(37),
    ACCOUNT_STATEMENT(38),
    GROUP(39),
    GROUP_EXPENSE(40),
    INVEST_DEFAULT_DIVIDEND_SETTING(41),
    COUPON(42),
    REACTIONS(43),
    SPONSORSHIP_FEATURE_INVITATION(44);

    public static final SyncEntityType$Companion$ADAPTER$1 ADAPTER;
    public static final ResourceFileSystem.Companion Companion;
    public final int value;

    static {
        SyncEntityType syncEntityType = DO_NOT_USE_SYNC_ENTITY_TYPE;
        Companion = new ResourceFileSystem.Companion();
        ADAPTER = new SyncEntityType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SyncEntityType.class), Syntax.PROTO_2, syncEntityType);
    }

    SyncEntityType(int i) {
        this.value = i;
    }

    public static final SyncEntityType fromValue(int i) {
        Companion.getClass();
        return ResourceFileSystem.Companion.m4357fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
