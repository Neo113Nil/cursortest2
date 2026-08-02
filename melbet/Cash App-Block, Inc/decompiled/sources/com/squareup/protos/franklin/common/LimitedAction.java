package com.squareup.protos.franklin.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public enum LimitedAction implements WireEnum {
    ADD_CASH(1),
    BUY_CRYPTOCURRENCY(2),
    SELL_CRYPTOCURRENCY(3);

    public final int value;
    public static final ResourceFileSystem.Companion Companion = new ResourceFileSystem.Companion();
    public static final LimitedAction$Companion$ADAPTER$1 ADAPTER = new LimitedAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LimitedAction.class), Syntax.PROTO_2, null);

    LimitedAction(int i) {
        this.value = i;
    }

    public static final LimitedAction fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ADD_CASH;
        }
        if (i == 2) {
            return BUY_CRYPTOCURRENCY;
        }
        if (i != 3) {
            return null;
        }
        return SELL_CRYPTOCURRENCY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
