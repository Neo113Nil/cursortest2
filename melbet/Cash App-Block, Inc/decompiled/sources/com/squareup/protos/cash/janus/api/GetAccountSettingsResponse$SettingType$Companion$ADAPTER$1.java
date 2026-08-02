package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final class GetAccountSettingsResponse$SettingType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetAccountSettingsResponse.SettingType.Companion.getClass();
        return ResourceFileSystem.Companion.m4351fromValue(i);
    }
}
