package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public enum EnableCryptocurrencyTransferInStatus implements WireEnum {
    DEPOSITS_DISALLOWED(1),
    DEPOSITS_CAN_ENABLE(2),
    DEPOSITS_PENDING_REVIEW(3),
    DEPOSITS_ENABLED(4),
    DEPOSITS_MISMATCHED_IDV(5);

    public final int value;
    public static final UiAlias.Type.Companion Companion = new UiAlias.Type.Companion();
    public static final EnableCryptocurrencyTransferInStatus$Companion$ADAPTER$1 ADAPTER = new EnableCryptocurrencyTransferInStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EnableCryptocurrencyTransferInStatus.class), Syntax.PROTO_2, null);

    EnableCryptocurrencyTransferInStatus(int i) {
        this.value = i;
    }

    public static final EnableCryptocurrencyTransferInStatus fromValue(int i) {
        Companion.getClass();
        return UiAlias.Type.Companion.m3945fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
