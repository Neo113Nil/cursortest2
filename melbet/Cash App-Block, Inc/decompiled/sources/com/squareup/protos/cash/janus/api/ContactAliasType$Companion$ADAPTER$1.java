package com.squareup.protos.cash.janus.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ContactAliasType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ContactAliasType.Companion.getClass();
        if (i == 1) {
            return ContactAliasType.ALIAS_TYPE_UNKNOWN;
        }
        if (i == 2) {
            return ContactAliasType.ALIAS_TYPE_EMAIL;
        }
        if (i != 3) {
            return null;
        }
        return ContactAliasType.ALIAS_TYPE_SMS;
    }
}
