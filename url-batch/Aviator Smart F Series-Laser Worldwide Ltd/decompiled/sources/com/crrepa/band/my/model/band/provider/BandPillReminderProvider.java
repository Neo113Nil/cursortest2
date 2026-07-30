package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandPillReminderProvider {
    private static final int DEFAULT_COUNT = 0;

    private BandPillReminderProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.MAX_PILLS);
    }

    public static int getPillReminderCount() {
        return g.getInstance().getInt(BaseParamNames.MAX_PILLS, 0);
    }

    public static boolean hasPillReminder() {
        return g.getInstance().contains(BaseParamNames.MAX_PILLS);
    }

    public static void savePillReminderCount(int i8) {
        g.getInstance().putInt(BaseParamNames.MAX_PILLS, i8);
    }
}
