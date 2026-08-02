package com.squareup.protos.cash.woodrow.model.v1;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum AssetDisposition$DispositionType implements WireEnum {
    TYPE_UNSPECIFIED(0),
    TRADE(1),
    WITHDRAW(2),
    TRANSFER(3),
    SANCTIONS_FREEZE(4);

    public static final AssetDisposition$DispositionType$Companion$ADAPTER$1 ADAPTER;
    public static final ActionType.Companion Companion;
    public final int value;

    static {
        AssetDisposition$DispositionType assetDisposition$DispositionType = TYPE_UNSPECIFIED;
        Companion = new ActionType.Companion();
        ADAPTER = new AssetDisposition$DispositionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AssetDisposition$DispositionType.class), Syntax.PROTO_3, assetDisposition$DispositionType);
    }

    AssetDisposition$DispositionType(int i) {
        this.value = i;
    }

    public static final AssetDisposition$DispositionType fromValue(int i) {
        Companion.getClass();
        return ActionType.Companion.m3936fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
