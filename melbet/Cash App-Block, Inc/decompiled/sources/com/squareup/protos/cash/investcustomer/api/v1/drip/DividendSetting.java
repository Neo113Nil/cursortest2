package com.squareup.protos.cash.investcustomer.api.v1.drip;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DividendSetting implements WireEnum {
    PAYOUT(1),
    REINVEST(2);

    public final int value;
    public static final SliceStatus.Companion Companion = new SliceStatus.Companion();
    public static final DividendSetting$Companion$ADAPTER$1 ADAPTER = new DividendSetting$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DividendSetting.class), Syntax.PROTO_2, null);

    DividendSetting(int i) {
        this.value = i;
    }

    public static final DividendSetting fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return PAYOUT;
        }
        if (i != 2) {
            return null;
        }
        return REINVEST;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
