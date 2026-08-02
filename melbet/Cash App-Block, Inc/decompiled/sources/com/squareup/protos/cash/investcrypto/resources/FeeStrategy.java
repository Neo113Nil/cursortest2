package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum FeeStrategy implements WireEnum {
    TIERED_V1(1),
    WAIVE_ALL(2),
    SPREAD_ONLY(3),
    FLAT_FEE_1_PERCENT(4),
    CUSTOM_SPREAD(5),
    TIERED_V1_WITH_CUSTOM_SPREAD(6),
    TIERED_V2_VARIABLE(7),
    TIRED_V2_VARIABLE_FIXED_HYBRID(8),
    TIERED_V2_VARIABLE_FIXED_HYBRID_WITH_CUSTOM_SPREAD(9),
    TIERED_V3(10),
    FLAT_FEE_0_9_PERCENT(11);

    public final int value;
    public static final FeeType.Companion Companion = new FeeType.Companion();
    public static final FeeStrategy$Companion$ADAPTER$1 ADAPTER = new FeeStrategy$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FeeStrategy.class), Syntax.PROTO_2, null);

    FeeStrategy(int i) {
        this.value = i;
    }

    public static final FeeStrategy fromValue(int i) {
        Companion.getClass();
        return FeeType.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
