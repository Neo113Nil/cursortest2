package com.crrepa.band.my.profile.strava;

/* loaded from: classes2.dex */
public class o {
    private static final String STRAVA_SHARED_TRAINING_IDS_KEY = "strava_shared_training_ids_key";

    public static String getUploadedTrainingIdList() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(STRAVA_SHARED_TRAINING_IDS_KEY, "");
    }

    public static boolean isSharedTraining(long j8) {
        return getUploadedTrainingIdList().contains("<" + j8 + ">");
    }

    public static boolean isUnsharedTrainingId(long j8) {
        return !isSharedTraining(j8);
    }

    public static void saveUploadedTrainingId(long j8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(STRAVA_SHARED_TRAINING_IDS_KEY, getUploadedTrainingIdList() + "<" + j8 + ">");
    }
}
