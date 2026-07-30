package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandFirstConnectProvider {
    private BandFirstConnectProvider() {
    }

    public static boolean isFirstConnected() {
        return g.getInstance().getBoolean(BaseParamNames.BAND_FIRST_CONNECT, false);
    }

    public static void saveFirstConnected(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.BAND_FIRST_CONNECT, z7);
    }
}
