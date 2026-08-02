package com.squareup.protos.cash.nearby.api.v1;

import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetNearbySessionResponse$ErrorCode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetNearbySessionResponse.ErrorCode.Companion.getClass();
        if (i == 0) {
            return GetNearbySessionResponse.ErrorCode.ERROR_CODE_UNSPECIFIED;
        }
        if (i == 1) {
            return GetNearbySessionResponse.ErrorCode.ERROR_CODE_SESSION_NOT_FOUND;
        }
        if (i != 2) {
            return null;
        }
        return GetNearbySessionResponse.ErrorCode.ERROR_CODE_INVALID_UUID_FORMAT;
    }
}
