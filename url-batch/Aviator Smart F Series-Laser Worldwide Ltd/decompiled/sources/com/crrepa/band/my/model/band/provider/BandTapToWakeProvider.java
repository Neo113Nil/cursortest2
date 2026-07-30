package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandTapToWakeProvider {
    private BandTapToWakeProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.TAP_TO_WAKE);
    }

    public static boolean getTapToWakeState() {
        return g.getInstance().getBoolean(BaseParamNames.TAP_TO_WAKE, false);
    }

    public static boolean hasTapToWake() {
        return g.getInstance().contains(BaseParamNames.TAP_TO_WAKE);
    }

    public static void saveTapToWakeState(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.TAP_TO_WAKE, z7);
    }
}
