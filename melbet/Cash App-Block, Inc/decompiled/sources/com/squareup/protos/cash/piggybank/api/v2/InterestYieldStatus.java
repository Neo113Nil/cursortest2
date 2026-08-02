package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum InterestYieldStatus implements WireEnum {
    INTEREST_YIELD_STATUS_DEFAULT_UNSPECIFIED(0),
    INTEREST_YIELD_STATUS_UNONBOARDED(1),
    INTEREST_YIELD_STATUS_ACTIVE(2),
    INTEREST_YIELD_STATUS_DISMISSED(3),
    INTEREST_YIELD_STATUS_INACTIVE(4),
    INTEREST_YIELD_STATUS_MANUALLY_DISABLED(5);

    public static final InterestYieldStatus$Companion$ADAPTER$1 ADAPTER;
    public static final ActionType.Companion Companion;
    public final int value;

    static {
        InterestYieldStatus interestYieldStatus = INTEREST_YIELD_STATUS_DEFAULT_UNSPECIFIED;
        Companion = new ActionType.Companion();
        ADAPTER = new InterestYieldStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InterestYieldStatus.class), Syntax.PROTO_2, interestYieldStatus);
    }

    InterestYieldStatus(int i) {
        this.value = i;
    }

    public static final InterestYieldStatus fromValue(int i) {
        Companion.getClass();
        return ActionType.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
