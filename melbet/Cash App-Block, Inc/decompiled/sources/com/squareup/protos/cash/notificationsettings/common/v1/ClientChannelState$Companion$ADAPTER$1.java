package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ClientChannelState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ClientChannelState.Companion.getClass();
        switch (i) {
            case 0:
                return ClientChannelState.CLIENT_CHANNEL_STATE_UNSPECIFIED;
            case 1:
                return ClientChannelState.CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ALIASES;
            case 2:
                return ClientChannelState.CLIENT_CHANNEL_STATE_CONFIG_DISALLOWED;
            case 3:
                return ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED;
            case 4:
                return ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_OFF_ENABLED;
            case 5:
                return ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_DISABLED;
            case 6:
                return ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_OFF_DISABLED;
            case 7:
                return ClientChannelState.CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ENABLED_ALIASES;
            default:
                return null;
        }
    }
}
