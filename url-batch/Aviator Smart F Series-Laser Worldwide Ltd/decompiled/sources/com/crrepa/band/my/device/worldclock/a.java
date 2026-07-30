package com.crrepa.band.my.device.worldclock;

import com.crrepa.band.my.model.storage.BaseParamNames;

/* loaded from: classes2.dex */
public class a {
    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(BaseParamNames.WORLD_CLOCK_MAX_NUMBER);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(BaseParamNames.CHECK_WORLD_CLOCK);
    }

    public static boolean getCheckWorldClock() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(BaseParamNames.CHECK_WORLD_CLOCK, true);
    }

    public static int getWorldClockNumber() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(BaseParamNames.WORLD_CLOCK_MAX_NUMBER, 0);
    }

    public static boolean isSupportWorldClock() {
        return getWorldClockNumber() > 0;
    }

    public static void saveCheckWorldClock(boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(BaseParamNames.CHECK_WORLD_CLOCK, z7);
    }

    public static void saveWorldClockNumber(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(BaseParamNames.WORLD_CLOCK_MAX_NUMBER, i8);
    }
}
