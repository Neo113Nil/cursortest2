package com.crrepa.band.my.ble.band.utils;

import com.crrepa.band.my.model.band.BaseBandModel;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class g {
    private g() {
    }

    public static boolean hasUnitSystem() {
        BaseBandModel connectBand;
        if (u.isSimplified() || (connectBand = a.getInstance().getConnectBand()) == null) {
            return false;
        }
        return connectBand.hasUnitSystem();
    }
}
