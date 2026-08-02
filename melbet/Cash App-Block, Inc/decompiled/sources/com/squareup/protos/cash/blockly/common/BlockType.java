package com.squareup.protos.cash.blockly.common;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum BlockType implements WireEnum {
    SELF(0),
    SPONSOR(1);

    public static final BlockType$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public final int value;

    static {
        BlockType blockType = SELF;
        Companion = new CardProduct.Companion(18);
        ADAPTER = new BlockType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BlockType.class), Syntax.PROTO_2, blockType);
    }

    BlockType(int i) {
        this.value = i;
    }

    public static final BlockType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return SELF;
        }
        if (i != 1) {
            return null;
        }
        return SPONSOR;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
