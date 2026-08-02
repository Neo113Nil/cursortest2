package com.squareup.protos.cash.cashabilities.api;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CapabilityName implements WireEnum {
    UNDEFINED(0),
    CRYPTO_BITCOIN(1),
    CRYPTO_BITCOIN_P2P(2),
    CRYPTO_BITCOIN_DEPOSIT(5),
    CRYPTO_BITCOIN_WITHDRAW(6),
    CRYPTO_BITCOIN_LIGHTNING(7),
    CARDS(8),
    INVESTING(9),
    BANKING(10),
    FIAT_P2P(11),
    FIAT_P2P_MULTI_CURRENCY_SELECTION(12),
    ONBOARDING_IDV_INTERNATIONAL(13),
    CRYPTO_BITCOIN_LIGHTNING_DEPOSIT(14),
    CRYPTO_BITCOIN_LIGHTNING_WITHDRAW(15),
    CRYPTO_BITCOIN_BUY_MARKET(16),
    CRYPTO_BITCOIN_SELL_MARKET(17),
    CRYPTO_BITCOIN_BUY_CUSTOM(18),
    CRYPTO_BITCOIN_SELL_CUSTOM(24),
    CRYPTO_BITCOIN_AUTO_INVEST_BUY(19),
    CRYPTO_BITCOIN_PAYROLL(20),
    CRYPTO_BITCOIN_ROUNDUP(21),
    CRYPTO_BITCOIN_BOOSTS(22),
    CRYPTO_BITCOIN_GIFTING(23),
    CRYPTO_XUS(25),
    CRYPTO_FIAT_TO_XUS_MARKET(26),
    CRYPTO_BTC_TO_XUS_MARKET(27),
    CRYPTO_XUS_TO_BTC_MARKET(28),
    CRYPTO_XUS_TO_FIAT_MARKET(29),
    CRYPTO_XUS_P2P(30),
    CRYPTO_BITKEY_TRANSFER(31),
    CRYPTO_BITKEY_BUY_AND_TRANSFER(32),
    CRYPTO_BITKEY_SELL(33),
    CRYPTO_STABLECOIN_WITHDRAW(34),
    CRYPTO_STABLECOIN_DEPOSIT(35),
    CRYPTO_BTC_MAP(36);

    public static final CapabilityName$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        CapabilityName capabilityName = UNDEFINED;
        Companion = new Error.Code.Companion(19);
        ADAPTER = new CapabilityName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CapabilityName.class), Syntax.PROTO_2, capabilityName);
    }

    CapabilityName(int i) {
        this.value = i;
    }

    public static final CapabilityName fromValue(int i) {
        Companion.getClass();
        return Error.Code.Companion.m3840fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
