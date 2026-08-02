package com.squareup.protos.cash.janus.api.trusthub;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class StatusIndicator$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StatusIndicator.Companion.getClass();
        if (i == 0) {
            return StatusIndicator.UNSPECIFIED;
        }
        if (i == 1) {
            return StatusIndicator.OK;
        }
        if (i == 2) {
            return StatusIndicator.WARNING;
        }
        if (i != 3) {
            return null;
        }
        return StatusIndicator.CRITICAL;
    }
}
