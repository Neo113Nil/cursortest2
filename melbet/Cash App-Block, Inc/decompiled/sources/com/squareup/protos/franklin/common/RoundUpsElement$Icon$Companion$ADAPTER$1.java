package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RoundUpsElement$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RoundUpsElement.Icon.Companion.getClass();
        if (i == 1) {
            return RoundUpsElement.Icon.ROUND_ARROW_UP;
        }
        return null;
    }
}
