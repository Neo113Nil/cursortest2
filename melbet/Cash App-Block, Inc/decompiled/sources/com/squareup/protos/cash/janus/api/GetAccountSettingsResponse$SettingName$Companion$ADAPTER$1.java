package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.Path;

/* loaded from: classes.dex */
public final class GetAccountSettingsResponse$SettingName$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetAccountSettingsResponse.SettingName.Companion.getClass();
        return Path.Companion.fromValue(i);
    }
}
