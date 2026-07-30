package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandQuickViewProvider {
    private static final boolean DEFAULT_STATE = true;

    private BandQuickViewProvider() {
    }

    public static boolean getQuickView() {
        return g.getInstance().getBoolean(BaseParamNames.BAND_QUICK_VIEW, true);
    }

    public static void saveQuickView(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.BAND_QUICK_VIEW, z7);
    }
}
