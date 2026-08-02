package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.P2pInstrumentSelectionRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class P2pInstrumentSelectionRequest$NewLinkOption$LinkType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        P2pInstrumentSelectionRequest.NewLinkOption.LinkType.Companion.getClass();
        if (i == 0) {
            return P2pInstrumentSelectionRequest.NewLinkOption.LinkType.LINK_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return P2pInstrumentSelectionRequest.NewLinkOption.LinkType.LINK_TYPE_DEBIT_CARD;
    }
}
