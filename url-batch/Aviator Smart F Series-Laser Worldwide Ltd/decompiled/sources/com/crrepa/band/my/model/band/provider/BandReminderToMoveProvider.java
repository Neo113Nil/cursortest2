package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandReminderToMoveProvider {
    private static final boolean DEFAULT_STATE = true;

    private BandReminderToMoveProvider() {
    }

    public static boolean getBandReminderToMove() {
        return g.getInstance().getBoolean(BaseParamNames.BAND_REMINDER_TO_MOVE, true);
    }

    public static void saveBandReminderToMove(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.BAND_REMINDER_TO_MOVE, z7);
    }
}
