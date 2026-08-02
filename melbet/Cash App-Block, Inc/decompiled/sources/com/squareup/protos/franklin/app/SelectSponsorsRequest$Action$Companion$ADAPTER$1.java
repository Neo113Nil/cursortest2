package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SelectSponsorsRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SelectSponsorsRequest$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SelectSponsorsRequest.Action.Companion.getClass();
        if (i == 0) {
            return SelectSponsorsRequest.Action.SELECT;
        }
        if (i == 1) {
            return SelectSponsorsRequest.Action.CANCEL;
        }
        if (i != 2) {
            return null;
        }
        return SelectSponsorsRequest.Action.CONFIRM;
    }
}
