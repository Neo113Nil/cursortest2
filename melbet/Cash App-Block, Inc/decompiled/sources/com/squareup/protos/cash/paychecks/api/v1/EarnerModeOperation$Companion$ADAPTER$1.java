package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class EarnerModeOperation$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EarnerModeOperation.Companion.getClass();
        if (i == 0) {
            return EarnerModeOperation.EARNER_MODE_OPERATION_UNSPECIFIED;
        }
        if (i == 1) {
            return EarnerModeOperation.EARNER_MODE_OPERATION_ENABLE;
        }
        if (i != 2) {
            return null;
        }
        return EarnerModeOperation.EARNER_MODE_OPERATION_DISABLE;
    }
}
