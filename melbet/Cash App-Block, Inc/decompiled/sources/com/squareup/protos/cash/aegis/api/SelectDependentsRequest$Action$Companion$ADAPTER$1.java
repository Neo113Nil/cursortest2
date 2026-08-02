package com.squareup.protos.cash.aegis.api;

import com.squareup.protos.cash.aegis.api.SelectDependentsRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SelectDependentsRequest$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SelectDependentsRequest.Action.Companion.getClass();
        if (i == 0) {
            return SelectDependentsRequest.Action.SELECT;
        }
        if (i == 1) {
            return SelectDependentsRequest.Action.CANCEL;
        }
        if (i != 2) {
            return null;
        }
        return SelectDependentsRequest.Action.CONFIRM;
    }
}
