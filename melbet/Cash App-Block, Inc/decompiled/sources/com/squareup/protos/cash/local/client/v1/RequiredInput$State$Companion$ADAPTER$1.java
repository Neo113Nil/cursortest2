package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.RequiredInput;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RequiredInput$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RequiredInput.State.Companion.getClass();
        if (i == 0) {
            return RequiredInput.State.STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return RequiredInput.State.STATE_PENDING;
        }
        if (i == 2) {
            return RequiredInput.State.STATE_COMPLETE;
        }
        if (i != 3) {
            return null;
        }
        return RequiredInput.State.STATE_INVALID;
    }
}
