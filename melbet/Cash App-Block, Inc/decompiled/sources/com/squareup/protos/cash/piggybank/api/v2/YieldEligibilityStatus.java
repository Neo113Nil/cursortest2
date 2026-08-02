package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum YieldEligibilityStatus implements WireEnum {
    YIELD_ELIGIBILITY_STATUS_UNSPECIFIED(0),
    YIELD_ELIGIBILITY_STATUS_INELIGIBLE(1),
    YIELD_ELIGIBILITY_STATUS_ELIGIBLE(2);

    public static final YieldEligibilityStatus$Companion$ADAPTER$1 ADAPTER;
    public static final ActionType.Companion Companion;
    public final int value;

    static {
        YieldEligibilityStatus yieldEligibilityStatus = YIELD_ELIGIBILITY_STATUS_UNSPECIFIED;
        Companion = new ActionType.Companion();
        ADAPTER = new YieldEligibilityStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(YieldEligibilityStatus.class), Syntax.PROTO_2, yieldEligibilityStatus);
    }

    YieldEligibilityStatus(int i) {
        this.value = i;
    }

    public static final YieldEligibilityStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return YIELD_ELIGIBILITY_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return YIELD_ELIGIBILITY_STATUS_INELIGIBLE;
        }
        if (i != 2) {
            return null;
        }
        return YIELD_ELIGIBILITY_STATUS_ELIGIBLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
