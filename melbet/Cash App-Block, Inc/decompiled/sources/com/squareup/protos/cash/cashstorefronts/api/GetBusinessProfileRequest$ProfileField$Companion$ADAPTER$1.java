package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.cashstorefronts.api.GetBusinessProfileRequest;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetBusinessProfileRequest$ProfileField$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetBusinessProfileRequest.ProfileField.Companion.getClass();
        return RadioType.Companion.m3851fromValue(i);
    }
}
