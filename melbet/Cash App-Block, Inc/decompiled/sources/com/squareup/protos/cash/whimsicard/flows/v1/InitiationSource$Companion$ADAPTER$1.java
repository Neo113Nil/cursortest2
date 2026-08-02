package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class InitiationSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InitiationSource.Companion.getClass();
        if (i == 0) {
            return InitiationSource.INITIATION_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return InitiationSource.PLASMA;
        }
        if (i == 2) {
            return InitiationSource.DEEP_LINK;
        }
        if (i != 3) {
            return null;
        }
        return InitiationSource.SUPPORT;
    }
}
