package com.squareup.protos.cash.unicorn.balance_home_ui;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BalanceHomeUi$FocusArea implements WireEnum {
    public static final /* synthetic */ BalanceHomeUi$FocusArea[] $VALUES;
    public static final BalanceHomeUi$FocusArea ACCOUNT_AND_ROUTING;
    public static final PoolVisibility.Companion Companion;

    static {
        BalanceHomeUi$FocusArea balanceHomeUi$FocusArea = new BalanceHomeUi$FocusArea("ACCOUNT_AND_ROUTING", 0);
        ACCOUNT_AND_ROUTING = balanceHomeUi$FocusArea;
        $VALUES = new BalanceHomeUi$FocusArea[]{balanceHomeUi$FocusArea};
        Companion = new PoolVisibility.Companion();
        new BalanceHomeUi$FocusArea$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BalanceHomeUi$FocusArea.class), Syntax.PROTO_2, null);
    }

    public static final BalanceHomeUi$FocusArea fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ACCOUNT_AND_ROUTING;
        }
        return null;
    }

    public static BalanceHomeUi$FocusArea valueOf(String str) {
        return (BalanceHomeUi$FocusArea) Enum.valueOf(BalanceHomeUi$FocusArea.class, str);
    }

    public static BalanceHomeUi$FocusArea[] values() {
        return (BalanceHomeUi$FocusArea[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return 1;
    }
}
