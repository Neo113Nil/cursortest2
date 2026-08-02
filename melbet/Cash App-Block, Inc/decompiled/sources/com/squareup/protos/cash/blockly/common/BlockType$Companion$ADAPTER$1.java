package com.squareup.protos.cash.blockly.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BlockType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BlockType.Companion.getClass();
        if (i == 0) {
            return BlockType.SELF;
        }
        if (i != 1) {
            return null;
        }
        return BlockType.SPONSOR;
    }
}
