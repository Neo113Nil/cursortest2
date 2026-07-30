package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandHrvProvider {
    private BandHrvProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.SUPPORT_HRV);
    }

    public static boolean hasHrv() {
        return g.getInstance().getBoolean(BaseParamNames.SUPPORT_HRV, false);
    }

    public static void saveSupportHrv(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.SUPPORT_HRV, z7);
    }
}
