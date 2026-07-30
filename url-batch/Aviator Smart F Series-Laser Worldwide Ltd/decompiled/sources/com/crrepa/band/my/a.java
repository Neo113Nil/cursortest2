package com.crrepa.band.my;

import android.os.Environment;
import java.io.File;

/* loaded from: classes2.dex */
public class a {
    private static final String ALG = "alg";
    private static final String APP = "app";
    private static final String AVATAR = "avatar";
    private static final String BAND = "band";
    private static final String BAND_ICON = "icon";
    private static final String BAND_WATCH_FACE_ICON = "watchface";
    private static final String CACHE = "cache";
    private static final String CRREPA = "crrepa";
    private static final String CUSTOMIZE_WATCH_FACE = "customize";
    private static final String ECG = "ecg";
    private static final String EPO = "epo";
    private static final String EXTEND = "extend";
    private static final String IMAGE_FILE_FORMAT = ".png";
    private static final String LOG = "log";
    private static final String PDG = "pdf";
    private static final String RUN = "run";
    private static final String STORE = "store";
    private static final String TEMP = "temp";
    private static final String WATCH_FACE = "wf";
    private static final String WATCH_FACE_PREVIEW = "preview";
    private static final String WEB = "web";

    public static String getALGPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(CRREPA);
        sb.append(str);
        sb.append(BAND);
        sb.append(str);
        sb.append(ALG);
        return sb.toString();
    }

    public static String getAppPath() {
        return com.moyoung.dafit.module.common.utils.d.get().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + File.separator + APP;
    }

    public static String getBandIconPath() {
        return getBaseFilePath() + File.separator + BAND_ICON;
    }

    public static String getBandWatchFacePath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getBaseFilePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(BAND_WATCH_FACE_ICON);
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public static String getBaseFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getFilesDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append(CRREPA);
        sb.append(str);
        sb.append(BAND);
        return sb.toString();
    }

    public static String getContactAvatarPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getBaseFilePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(AVATAR);
        sb.append(str2);
        sb.append(str);
        sb.append(IMAGE_FILE_FORMAT);
        return sb.toString();
    }

    public static String getCustomizeWatchFacePath(String str, int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append(getBaseFilePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(CUSTOMIZE_WATCH_FACE);
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append(i8);
        sb.append(IMAGE_FILE_FORMAT);
        return sb.toString();
    }

    public static String getEcgFileDirPath() {
        return getBaseFilePath() + File.separator + ECG;
    }

    public static String getEpoDirPath() {
        return getBaseFilePath() + File.separator + EPO;
    }

    public static String getExtendPath() {
        return getBaseFilePath() + File.separator + EXTEND;
    }

    public static String getGpsTrainingDirPath() {
        return getBaseFilePath() + File.separator + RUN;
    }

    public static String getLogPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(CRREPA);
        sb.append(str);
        sb.append(BAND);
        sb.append(str);
        sb.append(LOG);
        return sb.toString();
    }

    public static String getPdfPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(CRREPA);
        sb.append(str);
        sb.append(BAND);
        sb.append(str);
        sb.append(PDG);
        return sb.toString();
    }

    public static String getTempContactAvatarPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getBaseFilePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(AVATAR);
        sb.append(str2);
        sb.append(TEMP);
        sb.append(str2);
        sb.append(str);
        sb.append(IMAGE_FILE_FORMAT);
        return sb.toString();
    }

    public static String getWatchFacePath() {
        return getBaseFilePath() + File.separator + "wf";
    }

    public static String getWatchFaceStorePath() {
        return getBaseFilePath() + File.separator + STORE;
    }

    public static String getWebViewCachePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getFilesDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append(CACHE);
        sb.append(str);
        sb.append(WEB);
        return sb.toString();
    }
}
