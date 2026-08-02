package com.squareup.protos.cash.blockstable.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InputSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InputSource.Companion.getClass();
        if (i == 0) {
            return InputSource.INPUT_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return InputSource.INPUT_SOURCE_QR_CODE_SCANNER;
        }
        if (i != 2) {
            return null;
        }
        return InputSource.INPUT_SOURCE_P2P_FLOW;
    }
}
