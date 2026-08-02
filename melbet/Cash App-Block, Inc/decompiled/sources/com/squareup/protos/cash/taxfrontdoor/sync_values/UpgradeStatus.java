package com.squareup.protos.cash.taxfrontdoor.sync_values;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum UpgradeStatus implements WireEnum {
    NOT_STARTED(0),
    STARTED(1),
    COMPLETE(2);

    public static final UpgradeStatus$Companion$ADAPTER$1 ADAPTER;
    public static final TextSize.Companion Companion;
    public final int value;

    static {
        UpgradeStatus upgradeStatus = NOT_STARTED;
        Companion = new TextSize.Companion();
        ADAPTER = new UpgradeStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UpgradeStatus.class), Syntax.PROTO_2, upgradeStatus);
    }

    UpgradeStatus(int i) {
        this.value = i;
    }

    public static final UpgradeStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return NOT_STARTED;
        }
        if (i == 1) {
            return STARTED;
        }
        if (i != 2) {
            return null;
        }
        return COMPLETE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
