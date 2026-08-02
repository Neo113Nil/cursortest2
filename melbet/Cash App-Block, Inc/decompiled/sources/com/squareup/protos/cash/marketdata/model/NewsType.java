package com.squareup.protos.cash.marketdata.model;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum NewsType implements WireEnum {
    GLOBAL_EQUITY(1),
    EQUITY(2),
    CRYPTO(3);

    public final int value;
    public static final SliceStatus.Companion Companion = new SliceStatus.Companion();
    public static final NewsType$Companion$ADAPTER$1 ADAPTER = new NewsType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NewsType.class), Syntax.PROTO_2, null);

    NewsType(int i) {
        this.value = i;
    }

    public static final NewsType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return GLOBAL_EQUITY;
        }
        if (i == 2) {
            return EQUITY;
        }
        if (i != 3) {
            return null;
        }
        return CRYPTO;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
