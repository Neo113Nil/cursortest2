package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.AdminSyncAuthzRelationshipPoliciesResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AdminSyncAuthzRelationshipPoliciesResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AdminSyncAuthzRelationshipPoliciesResponse.Status.Companion.getClass();
        if (i == 0) {
            return AdminSyncAuthzRelationshipPoliciesResponse.Status.STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return AdminSyncAuthzRelationshipPoliciesResponse.Status.STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return AdminSyncAuthzRelationshipPoliciesResponse.Status.STATUS_FAILURE;
    }
}
