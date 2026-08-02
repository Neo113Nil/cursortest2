package com.squareup.protos.cash.postcard.app;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AppThemeState implements WireEnum {
    UNKNOWN_STATE(0),
    LOCKED(1),
    UNLOCKED(2);

    public static final AppThemeState$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        AppThemeState appThemeState = UNKNOWN_STATE;
        Companion = new TransactionType.Companion();
        ADAPTER = new AppThemeState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AppThemeState.class), Syntax.PROTO_2, appThemeState);
    }

    AppThemeState(int i) {
        this.value = i;
    }

    public static final AppThemeState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return LOCKED;
        }
        if (i != 2) {
            return null;
        }
        return UNLOCKED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
