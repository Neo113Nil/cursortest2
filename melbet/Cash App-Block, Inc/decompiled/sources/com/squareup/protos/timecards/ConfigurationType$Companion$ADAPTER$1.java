package com.squareup.protos.timecards;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ConfigurationType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ConfigurationType.Companion.getClass();
        if (i == 0) {
            return ConfigurationType.CONFIGURATION_TYPE_DO_NOT_USE;
        }
        if (i == 1) {
            return ConfigurationType.CUSTOM;
        }
        if (i != 2) {
            return null;
        }
        return ConfigurationType.DEFAULT;
    }
}
