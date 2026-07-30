package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandStressProvider {
    private BandStressProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.SUPPORT_STRESS);
        g.getInstance().remove(BaseParamNames.TIMING_STRESS_STATE);
    }

    public static boolean getTimingStressState() {
        return g.getInstance().getBoolean(BaseParamNames.TIMING_STRESS_STATE, false);
    }

    public static boolean hasStress() {
        return g.getInstance().getBoolean(BaseParamNames.SUPPORT_STRESS, false);
    }

    public static boolean hasTimingStress() {
        return g.getInstance().contains(BaseParamNames.TIMING_STRESS_STATE);
    }

    public static void saveSupportStress(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.SUPPORT_STRESS, z7);
    }

    public static void saveTimingStressState(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.TIMING_STRESS_STATE, z7);
    }
}
