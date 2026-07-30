package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandQuickContactProvider {
    private BandQuickContactProvider() {
    }

    public static void saveSupportSymbol(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.CONTACT_NUMBER_SYMBOL, z7);
    }

    public static boolean supportSymbol() {
        return g.getInstance().getBoolean(BaseParamNames.CONTACT_NUMBER_SYMBOL, false);
    }
}
