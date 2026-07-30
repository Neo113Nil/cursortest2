package com.crrepa.band.my.model.band.provider;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BandTimingHeartRateProvider {
    private static final int[] HEART_RATE_INTERVAL_ARRAY = {1, 2, 4, 6};

    private BandTimingHeartRateProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.TIMING_HEART_RATE_INTERVAL);
    }

    public static int getInterval(int i8) {
        if (i8 > 0) {
            int[] iArr = HEART_RATE_INTERVAL_ARRAY;
            if (i8 <= iArr.length) {
                return iArr[i8 - 1];
            }
        }
        return 0;
    }

    public static int getIntervalIndex() {
        int timingHeartRateInterval = getTimingHeartRateInterval();
        int i8 = 0;
        while (true) {
            int[] iArr = HEART_RATE_INTERVAL_ARRAY;
            if (i8 >= iArr.length) {
                return 0;
            }
            if (iArr[i8] == timingHeartRateInterval) {
                return i8 + 1;
            }
            i8++;
        }
    }

    public static List<String> getIntervalList(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(R.string.close));
        for (int i8 : HEART_RATE_INTERVAL_ARRAY) {
            arrayList.add((i8 * 5) + context.getString(R.string.minute_unit));
        }
        return arrayList;
    }

    public static int getTimingHeartRateInterval() {
        return g.getInstance().getInt(BaseParamNames.TIMING_HEART_RATE_INTERVAL, 0);
    }

    public static boolean getTimingHeartRateState() {
        return getTimingHeartRateInterval() > 0;
    }

    public static boolean hasTimingHeartRate() {
        return g.getInstance().contains(BaseParamNames.TIMING_HEART_RATE_INTERVAL);
    }

    public static boolean isValid(int i8) {
        if (i8 == 0) {
            return true;
        }
        for (int i9 : HEART_RATE_INTERVAL_ARRAY) {
            if (i9 == i8) {
                return true;
            }
        }
        return false;
    }

    public static void saveTimingHeartRateInterval(int i8) {
        g.getInstance().putInt(BaseParamNames.TIMING_HEART_RATE_INTERVAL, i8);
    }
}
