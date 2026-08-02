package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RoundUpsElement$Font$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RoundUpsElement.Font.Companion.getClass();
        if (i == 1) {
            return RoundUpsElement.Font.MEDIUM;
        }
        if (i != 2) {
            return null;
        }
        return RoundUpsElement.Font.SMALL;
    }
}
