package com.squareup.protos.franklin.common;

import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum InvestingAutomationFeature implements WireEnum {
    ROUND_UPS(1),
    INVEST_WHERE_YOU_SHOP(2),
    INVEST_YOUR_PAYCHECK(3);

    public final int value;
    public static final KeyScope.Companion Companion = new KeyScope.Companion();
    public static final InvestingAutomationFeature$Companion$ADAPTER$1 ADAPTER = new InvestingAutomationFeature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InvestingAutomationFeature.class), Syntax.PROTO_2, null);

    InvestingAutomationFeature(int i) {
        this.value = i;
    }

    public static final InvestingAutomationFeature fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ROUND_UPS;
        }
        if (i == 2) {
            return INVEST_WHERE_YOU_SHOP;
        }
        if (i != 3) {
            return null;
        }
        return INVEST_YOUR_PAYCHECK;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
