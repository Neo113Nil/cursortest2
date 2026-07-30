package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.band.util.BandFirmwareUtils;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandLastBindBandProvider {
    private BandLastBindBandProvider() {
    }

    public static String getFirmwareType() {
        return BandFirmwareUtils.getFirmwareType(g.getInstance().getString(BaseParamNames.LAST_BINDING_BAND_FIRMWARE, ""));
    }

    public static String getFirmwareVersion() {
        return g.getInstance().getString(BaseParamNames.LAST_BINDING_BAND_FIRMWARE, "");
    }

    public static String getName() {
        return g.getInstance().getString(BaseParamNames.LAST_BINDING_BAND_NAME, "");
    }

    public static void saveFirmwareVersion(String str) {
        g.getInstance().putString(BaseParamNames.LAST_BINDING_BAND_FIRMWARE, str);
    }

    public static void saveName(String str) {
        g.getInstance().putString(BaseParamNames.LAST_BINDING_BAND_NAME, str);
    }
}
