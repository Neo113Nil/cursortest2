package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public enum InvestmentEntityStatus implements WireEnum {
    ACTIVE(1),
    INACTIVE(2);

    public final int value;
    public static final ByteString.Companion Companion = new ByteString.Companion();
    public static final InvestmentEntityStatus$Companion$ADAPTER$1 ADAPTER = new InvestmentEntityStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InvestmentEntityStatus.class), Syntax.PROTO_2, null);

    InvestmentEntityStatus(int i) {
        this.value = i;
    }

    public static final InvestmentEntityStatus fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return INACTIVE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
