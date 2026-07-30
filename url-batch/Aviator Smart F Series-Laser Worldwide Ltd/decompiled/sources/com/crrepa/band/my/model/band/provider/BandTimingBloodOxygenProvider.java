package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.ble.band.utils.a;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandTimingBloodOxygenProvider {
    public static final int DAY_MODE = 2;
    public static final int MANUAL_MODE = 0;
    public static final int SLEEP_MODE = 1;

    private BandTimingBloodOxygenProvider() {
    }

    public static boolean getTimingBloodOxygenEnable() {
        return g.getInstance().getBoolean(BaseParamNames.ENABLE_TIMING_BLOOD_OXYGEN, false);
    }

    public static int getTimingBloodOxygenInterval() {
        return g.getInstance().getInt(BaseParamNames.TIMING_BLOOD_OXYGEN_INTERVAL, 0);
    }

    public static int getTimingBloodOxygenMode() {
        if (getTimingBloodOxygenEnable()) {
            return g.getInstance().getInt(BaseParamNames.TIMING_BLOOD_OXYGEN_MODE, 0);
        }
        return 0;
    }

    public static boolean isDayTimingBloodOxygen() {
        int timingBloodOxygenMode = getTimingBloodOxygenMode();
        return (a.getInstance().isHisilicon() && timingBloodOxygenMode == 1) || timingBloodOxygenMode == 2;
    }

    public static void saveSupportTimingBloodOxygen(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.SUPPORT_TIMING_BLOOD_OXYGEN, z7);
    }

    public static void saveTimingBloodOxygenEnable(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.ENABLE_TIMING_BLOOD_OXYGEN, z7);
    }

    public static void saveTimingBloodOxygenInterval(int i8) {
        g.getInstance().putInt(BaseParamNames.TIMING_BLOOD_OXYGEN_INTERVAL, i8);
    }

    public static void saveTimingBloodOxygenMode(int i8) {
        g.getInstance().putInt(BaseParamNames.TIMING_BLOOD_OXYGEN_MODE, i8);
    }

    public static boolean supportTimingBloodOxygen() {
        return g.getInstance().getBoolean(BaseParamNames.SUPPORT_TIMING_BLOOD_OXYGEN, false);
    }
}
