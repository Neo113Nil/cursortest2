package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class BandTempSystemProvider {
    public static final int CELSIUS_SYSTEM = 0;
    public static final int FAHRENHEIT_SYSTEM = 1;

    private BandTempSystemProvider() {
    }

    public static int getTempSystem() {
        return g.getInstance().getInt(BaseParamNames.WEATHER_TEMP_SYSTEM, 0);
    }

    public static boolean isFahrenheit() {
        return getTempSystem() == 1;
    }

    public static void setBandTempSystemOfLocale() {
        if (u.isZH()) {
            setTempSystem(0);
        }
    }

    public static void setTempSystem(int i8) {
        g.getInstance().putInt(BaseParamNames.WEATHER_TEMP_SYSTEM, i8);
    }
}
