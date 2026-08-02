package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BitcoinState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BitcoinState.Companion.getClass();
        return UiControl.Type.Companion.fromValue(i);
    }
}
