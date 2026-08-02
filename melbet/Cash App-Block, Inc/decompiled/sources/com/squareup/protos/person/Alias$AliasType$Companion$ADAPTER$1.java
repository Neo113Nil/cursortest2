package com.squareup.protos.person;

import com.squareup.protos.person.Alias;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Alias$AliasType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Alias.AliasType.Companion.getClass();
        if (i == 0) {
            return Alias.AliasType.UNKNOWN;
        }
        if (i == 1) {
            return Alias.AliasType.EMAIL;
        }
        if (i == 2) {
            return Alias.AliasType.PHONE;
        }
        if (i != 3) {
            return null;
        }
        return Alias.AliasType.PAN_FIDELIUS;
    }
}
