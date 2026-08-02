package com.squareup.protos.franklin.api;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum DirectDepositBlockerBenefitsIcon implements WireEnum {
    CARD(1),
    FDIC(2),
    LIGHTNING(3),
    BORROW(4),
    PHONE(5),
    ATM(6),
    DEPOSIT(7),
    OVERDRAFT(8),
    SAVINGS(9);

    public final int value;
    public static final TaxEnvironment.Companion Companion = new TaxEnvironment.Companion();
    public static final DirectDepositBlockerBenefitsIcon$Companion$ADAPTER$1 ADAPTER = new DirectDepositBlockerBenefitsIcon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DirectDepositBlockerBenefitsIcon.class), Syntax.PROTO_2, null);

    DirectDepositBlockerBenefitsIcon(int i) {
        this.value = i;
    }

    public static final DirectDepositBlockerBenefitsIcon fromValue(int i) {
        Companion.getClass();
        return TaxEnvironment.Companion.m3930fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
