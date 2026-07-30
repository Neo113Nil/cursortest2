package com.crrepa.band.my.training.utils;

/* loaded from: classes3.dex */
public class a {
    private static final String KEY_BAND_GPS_TRAINING = "key_band_gps_training";

    private a() {
    }

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_BAND_GPS_TRAINING);
    }

    public static boolean hasGpsTraining() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(KEY_BAND_GPS_TRAINING, false);
    }

    public static void setGpsTraining(boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(KEY_BAND_GPS_TRAINING, z7);
    }
}
