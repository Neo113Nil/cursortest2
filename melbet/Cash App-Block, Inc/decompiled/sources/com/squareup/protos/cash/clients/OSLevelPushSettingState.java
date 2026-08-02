package com.squareup.protos.cash.clients;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OSLevelPushSettingState implements WireEnum {
    OS_PUSH_STATE_UNKNOWN(0),
    OS_PUSH_STATE_ENABLED(1),
    OS_PUSH_STATE_DISABLED(2);

    public static final OSLevelPushSettingState$Companion$ADAPTER$1 ADAPTER;
    public static final Channel.Companion Companion;
    public final int value;

    static {
        OSLevelPushSettingState oSLevelPushSettingState = OS_PUSH_STATE_UNKNOWN;
        Companion = new Channel.Companion();
        ADAPTER = new OSLevelPushSettingState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OSLevelPushSettingState.class), Syntax.PROTO_2, oSLevelPushSettingState);
    }

    OSLevelPushSettingState(int i) {
        this.value = i;
    }

    public static final OSLevelPushSettingState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return OS_PUSH_STATE_UNKNOWN;
        }
        if (i == 1) {
            return OS_PUSH_STATE_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return OS_PUSH_STATE_DISABLED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
