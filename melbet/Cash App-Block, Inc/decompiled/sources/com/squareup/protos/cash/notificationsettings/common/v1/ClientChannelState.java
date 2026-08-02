package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ClientChannelState implements WireEnum {
    CLIENT_CHANNEL_STATE_UNSPECIFIED(0),
    CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ALIASES(1),
    CLIENT_CHANNEL_STATE_CONFIG_DISALLOWED(2),
    CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED(3),
    CLIENT_CHANNEL_STATE_SWITCHED_OFF_ENABLED(4),
    CLIENT_CHANNEL_STATE_SWITCHED_ON_DISABLED(5),
    CLIENT_CHANNEL_STATE_SWITCHED_OFF_DISABLED(6),
    CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ENABLED_ALIASES(7);

    public static final ClientChannelState$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        ClientChannelState clientChannelState = CLIENT_CHANNEL_STATE_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new ClientChannelState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ClientChannelState.class), Syntax.PROTO_2, clientChannelState);
    }

    ClientChannelState(int i) {
        this.value = i;
    }

    public static final ClientChannelState fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return CLIENT_CHANNEL_STATE_UNSPECIFIED;
            case 1:
                return CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ALIASES;
            case 2:
                return CLIENT_CHANNEL_STATE_CONFIG_DISALLOWED;
            case 3:
                return CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED;
            case 4:
                return CLIENT_CHANNEL_STATE_SWITCHED_OFF_ENABLED;
            case 5:
                return CLIENT_CHANNEL_STATE_SWITCHED_ON_DISABLED;
            case 6:
                return CLIENT_CHANNEL_STATE_SWITCHED_OFF_DISABLED;
            case 7:
                return CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ENABLED_ALIASES;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
