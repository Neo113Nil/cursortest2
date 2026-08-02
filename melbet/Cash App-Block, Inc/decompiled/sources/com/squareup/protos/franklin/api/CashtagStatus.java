package com.squareup.protos.franklin.api;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public enum CashtagStatus implements WireEnum {
    AVAILABLE(1),
    INVALID_CASHTAG(2),
    UNAVAILABLE(3);

    public final int value;
    public static final ResourceFileSystem.Companion Companion = new ResourceFileSystem.Companion();
    public static final CashtagStatus$Companion$ADAPTER$1 ADAPTER = new CashtagStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CashtagStatus.class), Syntax.PROTO_2, null);

    CashtagStatus(int i) {
        this.value = i;
    }

    public static final CashtagStatus fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return AVAILABLE;
        }
        if (i == 2) {
            return INVALID_CASHTAG;
        }
        if (i != 3) {
            return null;
        }
        return UNAVAILABLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
