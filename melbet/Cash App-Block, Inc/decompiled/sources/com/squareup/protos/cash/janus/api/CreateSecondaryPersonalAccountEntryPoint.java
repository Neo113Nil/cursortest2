package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CreateSecondaryPersonalAccountEntryPoint implements WireEnum {
    CREATE_SECONDARY_PERSONAL_ACCOUNT_ENTRY_POINT_UNSPECIFIED(0),
    KYB(1),
    ACCOUNT_SWITCHER(2),
    FAMILIES(3),
    CASH_CARD(4),
    INVESTING(5),
    BTC(6),
    DDA(7),
    WIRE_TRANSFERS(8),
    BORROW(9),
    SAVINGS(10),
    TAXES(11),
    ACCOUNT_FOOTER(12),
    PAYCHECKS(13),
    MONEY_TAB(14),
    RESTRICTION_BANNER(16),
    ELIGIBILITY_FLOW(17),
    ACTIVITY_ROW_UPSELL(18);

    public static final CreateSecondaryPersonalAccountEntryPoint$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        CreateSecondaryPersonalAccountEntryPoint createSecondaryPersonalAccountEntryPoint = CREATE_SECONDARY_PERSONAL_ACCOUNT_ENTRY_POINT_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new CreateSecondaryPersonalAccountEntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CreateSecondaryPersonalAccountEntryPoint.class), Syntax.PROTO_2, createSecondaryPersonalAccountEntryPoint);
    }

    CreateSecondaryPersonalAccountEntryPoint(int i) {
        this.value = i;
    }

    public static final CreateSecondaryPersonalAccountEntryPoint fromValue(int i) {
        Companion.getClass();
        return RetailerType.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
