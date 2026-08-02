package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InstrumentLinkingConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class InstrumentLinkingConfig$IssuedCardDisabledStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InstrumentLinkingConfig.IssuedCardDisabledStyle.Companion.getClass();
        if (i == 1) {
            return InstrumentLinkingConfig.IssuedCardDisabledStyle.WHITE;
        }
        if (i != 2) {
            return null;
        }
        return InstrumentLinkingConfig.IssuedCardDisabledStyle.GREY;
    }
}
