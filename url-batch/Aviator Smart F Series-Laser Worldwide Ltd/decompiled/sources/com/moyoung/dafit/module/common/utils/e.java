package com.moyoung.dafit.module.common.utils;

import android.text.format.DateUtils;

/* loaded from: classes4.dex */
public class e {
    private static final String CONTINUE_USE_DAYS = "continue_use_days";
    private static final String LAST_USE_TIME = "last_use_time";
    private static final long MIN_USE_TIME = 60000;
    private static final long USE_DAY_PERIOD = 86400000;

    private static long getLastUseTime() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getLong(LAST_USE_TIME, 0L);
    }

    public static int getUseDays() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(CONTINUE_USE_DAYS, 0);
    }

    private static void saveLastUseTime() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putLong(LAST_USE_TIME, System.currentTimeMillis());
    }

    private static void saveUseDays(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(CONTINUE_USE_DAYS, i8);
    }

    public static void saveUseTime(long j8) {
        com.orhanobut.logger.f.d("app use time: " + j8);
        if (j8 < 60000) {
            return;
        }
        long lastUseTime = getLastUseTime();
        if (DateUtils.isToday(lastUseTime)) {
            return;
        }
        int useDays = System.currentTimeMillis() - lastUseTime < USE_DAY_PERIOD ? 1 + getUseDays() : 1;
        com.orhanobut.logger.f.d("useDays: " + useDays);
        saveUseDays(useDays);
        saveLastUseTime();
    }
}
