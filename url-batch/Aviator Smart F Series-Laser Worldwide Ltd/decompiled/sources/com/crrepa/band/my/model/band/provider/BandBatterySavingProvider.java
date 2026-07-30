package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandBatterySavingProvider {
    private BandBatterySavingProvider() {
    }

    public static boolean isBatterySaving() {
        return g.getInstance().getBoolean(BaseParamNames.BAND_BATTERY_SAVING, false);
    }

    public static void saveBatterySaving(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.BAND_BATTERY_SAVING, z7);
    }

    public static void saveSupportBatterySaving(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.SUPPORT_BATTERY_SAVING, z7);
    }

    public static boolean supportBatterySaving() {
        return g.getInstance().getBoolean(BaseParamNames.SUPPORT_BATTERY_SAVING, false);
    }
}
