package com.squareup.protos.cash.p2pencoreedge.plasma.flows;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Type.Companion.getClass();
        if (i == 0) {
            return Type.UNSPECIFIED;
        }
        if (i == 1) {
            return Type.ALLOWANCE;
        }
        if (i != 2) {
            return null;
        }
        return Type.P2P_FIAT;
    }
}
