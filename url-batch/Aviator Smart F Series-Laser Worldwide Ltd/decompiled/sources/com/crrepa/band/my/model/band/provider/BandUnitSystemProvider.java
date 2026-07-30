package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.health.weight.model.WeightChangeEvent;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.u;
import com.orhanobut.logger.f;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class BandUnitSystemProvider {
    public static final int INCH_SYSTEM = 1;
    public static final int METRIC_SYSTEM = 0;

    public static int getUnitSystem() {
        int i8 = g.getInstance().getInt(BaseParamNames.BAND_MEASUREMENT_SYSTEM, 0);
        if (isUnitSystem(i8)) {
            return i8;
        }
        return 0;
    }

    public static boolean isImperialSystem() {
        return getUnitSystem() == 1;
    }

    private static boolean isUnitSystem(int i8) {
        return i8 == 0 || i8 == 1;
    }

    public static void saveUnitSystem(int i8) {
        if (!isUnitSystem(i8) || i8 == getUnitSystem()) {
            return;
        }
        g.getInstance().putInt(BaseParamNames.BAND_MEASUREMENT_SYSTEM, i8);
        c.getDefault().post(new WeightChangeEvent());
    }

    public static void setUnitSystemOfLocale() {
        if (u.isZH()) {
            f.d("setBandUnitSystemOfLocale");
            saveUnitSystem(0);
        }
    }
}
