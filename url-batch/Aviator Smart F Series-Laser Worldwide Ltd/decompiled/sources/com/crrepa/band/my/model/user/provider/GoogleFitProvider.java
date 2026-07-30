package com.crrepa.band.my.model.user.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class GoogleFitProvider {
    private GoogleFitProvider() {
    }

    public static boolean getConnected() {
        return g.getInstance().getBoolean(BaseParamNames.GOOGLE_FIT_CONNECTED, false);
    }

    public static int getUpdateSteps() {
        return g.getInstance().getInt(BaseParamNames.GOOGLE_FIT_UPDATE_STEPS, 0);
    }

    public static long getUpdateTime() {
        return g.getInstance().getLong(BaseParamNames.GOOGLE_FIT_UPDATE_TIME, 0L);
    }

    public static void saveConnected(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.GOOGLE_FIT_CONNECTED, z7);
    }

    public static void saveUpdateSteps(int i8) {
        g.getInstance().putInt(BaseParamNames.GOOGLE_FIT_UPDATE_STEPS, i8);
    }

    public static void saveUpdateTime(long j8) {
        g.getInstance().putLong(BaseParamNames.GOOGLE_FIT_UPDATE_TIME, j8);
    }
}
