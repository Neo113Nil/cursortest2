package com.squareup.protos.cash.clients;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OSLevelPushSettingState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OSLevelPushSettingState.Companion.getClass();
        if (i == 0) {
            return OSLevelPushSettingState.OS_PUSH_STATE_UNKNOWN;
        }
        if (i == 1) {
            return OSLevelPushSettingState.OS_PUSH_STATE_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return OSLevelPushSettingState.OS_PUSH_STATE_DISABLED;
    }
}
