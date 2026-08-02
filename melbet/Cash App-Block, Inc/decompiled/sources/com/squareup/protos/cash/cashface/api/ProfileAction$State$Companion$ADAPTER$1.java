package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.ProfileAction;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ProfileAction$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ProfileAction.State.Companion.getClass();
        if (i == 0) {
            return ProfileAction.State.STATE_UNKNOWN;
        }
        if (i == 1) {
            return ProfileAction.State.STATE_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return ProfileAction.State.STATE_DISABLED;
    }
}
