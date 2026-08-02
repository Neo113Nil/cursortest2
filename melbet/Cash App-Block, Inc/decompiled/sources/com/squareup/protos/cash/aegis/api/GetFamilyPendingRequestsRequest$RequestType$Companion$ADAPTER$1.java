package com.squareup.protos.cash.aegis.api;

import com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetFamilyPendingRequestsRequest$RequestType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetFamilyPendingRequestsRequest.RequestType.Companion.getClass();
        if (i == 1) {
            return GetFamilyPendingRequestsRequest.RequestType.REQUESTS;
        }
        if (i != 2) {
            return null;
        }
        return GetFamilyPendingRequestsRequest.RequestType.INVITATIONS;
    }
}
