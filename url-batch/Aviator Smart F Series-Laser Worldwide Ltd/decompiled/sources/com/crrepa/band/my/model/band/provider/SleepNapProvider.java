package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.health.sleep.model.BandSleepNapChangeEvent;
import com.moyoung.dafit.module.common.network.provider.g;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class SleepNapProvider {
    private static final String KEY_IS_SUPPORT_SLEEP_NAP = "key_is_support_sleep_nap";

    private SleepNapProvider() {
    }

    public static void delete() {
        g.getInstance().remove(KEY_IS_SUPPORT_SLEEP_NAP);
        c.getDefault().post(new BandSleepNapChangeEvent());
    }

    public static boolean isSupportSleepNap() {
        return g.getInstance().getBoolean(KEY_IS_SUPPORT_SLEEP_NAP, false);
    }

    public static boolean notSupportSleepNap() {
        return !isSupportSleepNap();
    }

    public static void saveSupportSleepNap() {
        g.getInstance().putBoolean(KEY_IS_SUPPORT_SLEEP_NAP, true);
    }
}
