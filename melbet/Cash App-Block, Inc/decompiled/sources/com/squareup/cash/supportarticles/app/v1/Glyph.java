package com.squareup.cash.supportarticles.app.v1;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Glyph implements WireEnum {
    GLYPH_UNSPECIFIED(0),
    GLYPH_CARD(1),
    GLYPH_BITCOIN(2),
    GLYPH_INVESTING(3),
    GLYPH_STAR(4),
    GLYPH_DEPOSIT(5),
    GLYPH_LIMITS(6),
    GLYPH_PERSONAL(7),
    GLYPH_BOOST(8),
    GLYPH_BORROW(9),
    GLYPH_PAY_WITH_CASH(10),
    GLYPH_BUSINESS_ACCOUNT(11),
    GLYPH_TAXES(12),
    GLYPH_ADD(13),
    GLYPH_WITHDRAW(14),
    GLYPH_PEOPLE(15),
    GLYPH_DEFAULT(16),
    GLYPH_INFO(17),
    GLYPH_PAYMENT_PLAN(18),
    GLYPH_SAVINGS(19),
    GLYPH_AFTERPAY(20);

    public static final Glyph$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public final int value;

    static {
        Glyph glyph = GLYPH_UNSPECIFIED;
        Companion = new CardProduct.Companion(11);
        ADAPTER = new Glyph$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Glyph.class), Syntax.PROTO_3, glyph);
    }

    Glyph(int i) {
        this.value = i;
    }

    public static final Glyph fromValue(int i) {
        Companion.getClass();
        return CardProduct.Companion.m3831fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
