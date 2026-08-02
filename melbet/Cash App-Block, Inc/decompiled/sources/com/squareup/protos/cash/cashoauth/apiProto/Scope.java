package com.squareup.protos.cash.cashoauth.apiProto;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Scope implements WireEnum {
    API_KEYS_READ(1),
    API_KEYS_WRITE(2),
    BRANDS_READ(3),
    BRANDS_WRITE(4),
    CUSTOMERS_READ(5),
    DISPUTES_READ(6),
    DISPUTES_WRITE(7),
    GRANTS_READ(8),
    GRANTS_WRITE(9),
    MERCHANTS_READ(10),
    MERCHANTS_WRITE(11),
    PAYMENTS_READ(12),
    PAYMENTS_WRITE(13),
    REFUNDS_READ(14),
    REFUNDS_WRITE(15),
    WEBHOOK_CONFIG_READ(16),
    WEBHOOK_CONFIG_WRITE(17),
    WEBHOOK_EVENTS_READ(18),
    OFFERS_WRITE(19),
    OFFERS_READ(20),
    ORDERS_WRITE(21),
    ORDERS_READ(22),
    MESSAGES_WRITE(23),
    MESSAGES_READ(24),
    FEE_PLANS_READ(25),
    BTC_WITHDRAWALS_WRITE(26),
    BTC_WITHDRAWALS_READ(27),
    DEPOSITS_READ(28),
    DEPOSITS_WRITE(29),
    BANK_ACCOUNTS_READ(30),
    BANK_ACCOUNTS_WRITE(31),
    SETTLEMENT_CONFIGURATIONS_READ(32),
    SETTLEMENT_CONFIGURATIONS_WRITE(33),
    FINPLAT_ISSUING_3DS_WRITE(34),
    FDX_TRANSACTIONS_READ(35),
    FDX_ACCOUNT_BASIC_READ(36),
    FDX_ACCOUNT_DETAILED_READ(37),
    CUSTOMER_PROFILE_READ(38),
    FDX_CUSTOMER_CONTACT_READ(39),
    FDX_CUSTOMER_PERSONAL_READ(40),
    PAYOUTS_READ(41),
    PAYOUTS_WRITE(42),
    OPENID(43),
    FDX_STATEMENTS(44),
    CASH_C_TOKEN(45),
    FDX_TRANSACTIONS(46),
    CLIENT_CREATE(47),
    BALANCES_READ(48),
    CLIENT_READ(49),
    CLIENT_UPDATE(50),
    CLIENT_DELETE(51),
    ISSUING_ALIAS_DIRECTORY_READ(52),
    FDX_STATEMENTS_READ(53),
    FDX_RECIPIENT_CREATE(54),
    FDX_RECIPIENT_READ(55),
    FDX_RECIPIENT_UPDATE(56),
    FDX_RECIPIENT_DELETE(57),
    FDX_CONSENT_READ(58),
    FDX_CONSENT_REVOKE(59),
    AGENT_PAYMENT_REQUEST_WRITE(60),
    FDX_PAYMENT_SUPPORT_READ(61);

    public final int value;
    public static final Channel.Companion Companion = new Channel.Companion();
    public static final Scope$Companion$ADAPTER$1 ADAPTER = new Scope$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Scope.class), Syntax.PROTO_2, null);

    Scope(int i) {
        this.value = i;
    }

    public static final Scope fromValue(int i) {
        Companion.getClass();
        return Channel.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
