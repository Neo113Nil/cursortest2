package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PriceStrategy implements WireEnum {
    NO_INCORPORATED_SPREAD(1),
    TWENTY_FIVE_PERCENT_INCORPORATED_SPREAD(2),
    TWENTY_FIVE_BASIS_POINTS_INCORPORATED_SPREAD(3),
    FIFTY_BASIS_POINTS_INCORPORATED_SPREAD(4),
    ONE_HUNDRED_BASIS_POINTS_INCORPORATED_SPREAD(5),
    SEVENTY_FIVE_BASIS_POINTS_INCORPORATED_SPREAD(6);

    public final int value;
    public static final SliceStatus.Companion Companion = new SliceStatus.Companion();
    public static final PriceStrategy$Companion$ADAPTER$1 ADAPTER = new PriceStrategy$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PriceStrategy.class), Syntax.PROTO_2, null);

    PriceStrategy(int i) {
        this.value = i;
    }

    public static final PriceStrategy fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 1:
                return NO_INCORPORATED_SPREAD;
            case 2:
                return TWENTY_FIVE_PERCENT_INCORPORATED_SPREAD;
            case 3:
                return TWENTY_FIVE_BASIS_POINTS_INCORPORATED_SPREAD;
            case 4:
                return FIFTY_BASIS_POINTS_INCORPORATED_SPREAD;
            case 5:
                return ONE_HUNDRED_BASIS_POINTS_INCORPORATED_SPREAD;
            case 6:
                return SEVENTY_FIVE_BASIS_POINTS_INCORPORATED_SPREAD;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
