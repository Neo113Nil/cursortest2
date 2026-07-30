package com.crrepa.band.my.model.band.provider;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BandDisplayTimeProvider {
    public static final int DEFAULT_DISPLAY_TIME = 0;
    public static final int DISPLAY_TIME_UNIT = 5;
    public static final int MAX_DISPLAY_TIME = 30;

    private BandDisplayTimeProvider() {
    }

    public static int getDisplayTime(int i8) {
        int i9 = (i8 + 1) * 5;
        if (30 < i9) {
            return 255;
        }
        return i9;
    }

    public static List<String> getDisplayTimeList(Context context) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 5; i8 <= 30; i8 += 5) {
            arrayList.add(context.getString(R.string.display_time_value, Integer.valueOf(i8)));
        }
        if (isAlwayOn()) {
            arrayList.add(context.getString(R.string.display_alway_on));
        }
        return arrayList;
    }

    public static int getDisplayTimePosition(int i8) {
        if (i8 == 255) {
            return 6;
        }
        if (i8 < 5) {
            i8 = 5;
        }
        if (30 < i8) {
            i8 = 30;
        }
        return (i8 / 5) - 1;
    }

    public static boolean isAlwayOn() {
        return g.getInstance().getBoolean(BaseParamNames.DISPLAY_TIME_ALWAY_ON, false);
    }

    public static void saveAlwayOn(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.DISPLAY_TIME_ALWAY_ON, z7);
    }

    public static void saveDisplayTime(int i8) {
        g.getInstance().putInt(BaseParamNames.DISPLAY_TIME, i8);
    }

    public static int getDisplayTime() {
        return g.getInstance().getInt(BaseParamNames.DISPLAY_TIME, 0);
    }
}
