package com.squareup.protos.cash.janus.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetAuthorizedAccountAuthorizedRelationship$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetAuthorizedAccountAuthorizedRelationship.Companion.getClass();
        if (i == 0) {
            return GetAuthorizedAccountAuthorizedRelationship.RELATIONSHIP_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GetAuthorizedAccountAuthorizedRelationship.RELATIONSHIP_SPONSOR;
    }
}
