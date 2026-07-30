package com.crrepa.band.my.model.band.provider;

import android.content.Context;
import android.text.format.DateFormat;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.d;

/* loaded from: classes2.dex */
public class BandTimeSystemProvider {
    private static final int DEFAULT_TIME_SYSTEM = -1;
    public static final int TIME_SYSTEM_12 = 0;
    public static final int TIME_SYSTEM_24 = 1;

    private BandTimeSystemProvider() {
    }

    public static int getTimeSystem(Context context) {
        int i8 = g.getInstance().getInt(BaseParamNames.BAND_TIME_SYSTEM, -1);
        return -1 == i8 ? DateFormat.is24HourFormat(context) ? 1 : 0 : i8;
    }

    public static boolean is12HourTime() {
        return !DateFormat.is24HourFormat(d.get());
    }

    public static void saveTimeSystem(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_TIME_SYSTEM, i8);
    }
}
