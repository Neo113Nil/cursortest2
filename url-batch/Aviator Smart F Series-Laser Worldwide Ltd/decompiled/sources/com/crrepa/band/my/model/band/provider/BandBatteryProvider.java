package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.ble.band.utils.a;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandBatteryProvider {
    public static final int DEFAULT_BATTERY = 0;
    private static final int MEASURE_LOW_BATTERY = 10;
    private static final int OTA_LOW_BATTERY = 30;

    private BandBatteryProvider() {
    }

    public static int getBandBattery() {
        return g.getInstance().getInt(BaseParamNames.BAND_BATTERY, 0);
    }

    public static boolean isMeasureLowBattery() {
        return isOverLimit(10);
    }

    public static boolean isOtaLowBattery() {
        return isOverLimit(30);
    }

    private static boolean isOverLimit(int i8) {
        int bandBattery = getBandBattery();
        if (a.getInstance().isJieli() && 100 < bandBattery) {
            bandBattery -= 100;
        }
        return bandBattery <= i8;
    }

    public static void reset() {
        g.getInstance().putInt(BaseParamNames.BAND_BATTERY, 0);
    }

    public static void saveBandBattery(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_BATTERY, i8);
    }
}
