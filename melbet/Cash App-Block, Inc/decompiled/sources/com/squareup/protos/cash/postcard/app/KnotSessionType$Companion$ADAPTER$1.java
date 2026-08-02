package com.squareup.protos.cash.postcard.app;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class KnotSessionType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        KnotSessionType.Companion.getClass();
        if (i == 0) {
            return KnotSessionType.KNOT_SESSION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return KnotSessionType.CARD_SWITCHER;
        }
        if (i != 2) {
            return null;
        }
        return KnotSessionType.LINK;
    }
}
