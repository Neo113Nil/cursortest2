package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DisclosureAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DisclosureAction.Companion.getClass();
        if (i == 1) {
            return DisclosureAction.ACCEPT;
        }
        if (i == 2) {
            return DisclosureAction.REJECT;
        }
        if (i != 3) {
            return null;
        }
        return DisclosureAction.REVOKE;
    }
}
