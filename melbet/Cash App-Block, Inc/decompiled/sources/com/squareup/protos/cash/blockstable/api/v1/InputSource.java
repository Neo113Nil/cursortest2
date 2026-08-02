package com.squareup.protos.cash.blockstable.api.v1;

import com.squareup.cropview.Edge;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum InputSource implements WireEnum {
    INPUT_SOURCE_UNSPECIFIED(0),
    INPUT_SOURCE_QR_CODE_SCANNER(1),
    INPUT_SOURCE_P2P_FLOW(2);

    public static final InputSource$Companion$ADAPTER$1 ADAPTER;
    public static final Edge.Companion Companion;
    public final int value;

    static {
        InputSource inputSource = INPUT_SOURCE_UNSPECIFIED;
        Companion = new Edge.Companion(18);
        ADAPTER = new InputSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InputSource.class), Syntax.PROTO_2, inputSource);
    }

    InputSource(int i) {
        this.value = i;
    }

    public static final InputSource fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return INPUT_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return INPUT_SOURCE_QR_CODE_SCANNER;
        }
        if (i != 2) {
            return null;
        }
        return INPUT_SOURCE_P2P_FLOW;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
