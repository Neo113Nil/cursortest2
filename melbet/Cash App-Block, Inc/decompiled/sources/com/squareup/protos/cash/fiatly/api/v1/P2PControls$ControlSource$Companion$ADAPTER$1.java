package com.squareup.protos.cash.fiatly.api.v1;

import com.squareup.protos.cash.fiatly.api.v1.P2PControls;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class P2PControls$ControlSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        P2PControls.ControlSource.Companion.getClass();
        if (i == 0) {
            return P2PControls.ControlSource.CONTROL_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return P2PControls.ControlSource.CONTROL_SOURCE_EXPLICIT;
        }
        if (i != 2) {
            return null;
        }
        return P2PControls.ControlSource.CONTROL_SOURCE_DEFAULT;
    }
}
