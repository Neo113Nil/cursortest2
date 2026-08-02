package com.squareup.protos.franklin.common;

import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum NetworkCongestionLevel implements WireEnum {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    public final int value;
    public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
    public static final NetworkCongestionLevel$Companion$ADAPTER$1 ADAPTER = new NetworkCongestionLevel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NetworkCongestionLevel.class), Syntax.PROTO_2, null);

    NetworkCongestionLevel(int i) {
        this.value = i;
    }

    public static final NetworkCongestionLevel fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return LOW;
        }
        if (i == 2) {
            return MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return HIGH;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
