package com.squareup.protos.cash.plasma.callcontext;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AuthorizedRelationship$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AuthorizedRelationship.Companion.getClass();
        if (i == 0) {
            return AuthorizedRelationship.AUTHORIZED_RELATIONSHIP_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return AuthorizedRelationship.SPONSOR;
    }
}
