package com.squareup.protos.timecards;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes8.dex */
public enum ConfigurationType implements WireEnum {
    CONFIGURATION_TYPE_DO_NOT_USE(0),
    CUSTOM(1),
    DEFAULT(2);

    public static final ConfigurationType$Companion$ADAPTER$1 ADAPTER;
    public static final y0 Companion;
    public final int value;

    static {
        ConfigurationType configurationType = CONFIGURATION_TYPE_DO_NOT_USE;
        Companion = new y0();
        ADAPTER = new ConfigurationType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ConfigurationType.class), Syntax.PROTO_2, configurationType);
    }

    ConfigurationType(int i) {
        this.value = i;
    }

    public static final ConfigurationType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return CONFIGURATION_TYPE_DO_NOT_USE;
        }
        if (i == 1) {
            return CUSTOM;
        }
        if (i != 2) {
            return null;
        }
        return DEFAULT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
