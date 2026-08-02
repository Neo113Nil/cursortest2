package com.squareup.protos.payrollconnector.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public enum TaskType implements WireEnum {
    PAYSTUBS(1),
    INCOME(2),
    EMPLOYMENT(3),
    SHIFTS(4),
    DIRECT_DEPOSIT_SWITCH(5),
    DIRECT_DEPOSIT_PAYMENT(6),
    DIRECT_DEPOSIT_ALLOCATIONS(7),
    IDENTITY(8),
    TAX_FORMS(9),
    PAYOUT_CARDS(10),
    CARD_SWITCH(11),
    COMPANY_CENSUS(12),
    COMPANY_EMPLOYMENTS(13),
    COMPANY_INCOMES(14),
    BILL_CANCELLATION(15);

    public final int value;
    public static final LinkResolverDef Companion = new LinkResolverDef(2);
    public static final TaskType$Companion$ADAPTER$1 ADAPTER = new TaskType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TaskType.class), Syntax.PROTO_2, null);

    TaskType(int i) {
        this.value = i;
    }

    public static final TaskType fromValue(int i) {
        Companion.getClass();
        return LinkResolverDef.m4116fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
