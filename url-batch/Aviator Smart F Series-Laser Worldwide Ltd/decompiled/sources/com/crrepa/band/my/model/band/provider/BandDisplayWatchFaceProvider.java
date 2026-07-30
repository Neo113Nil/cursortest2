package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandDisplayWatchFaceProvider {
    private static final int DEFAULT_DOWNLOAD_WATCH_FACE_COUNT = 1;
    private static final int DEFAULT_STYLE = 0;
    private static final String JIELI_DOWNLOAD_WATCH_FACE_COUNT = "jieli_download_watch_face_count";
    private static final int MAX_DOWNLOAD_WATCH_FACE_COUNT = 10;

    private BandDisplayWatchFaceProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.BAND_DISPLAY_WATCH_FACE);
        g.getInstance().remove(JIELI_DOWNLOAD_WATCH_FACE_COUNT);
    }

    public static int getDisplayWatchFaceIndex() {
        return g.getInstance().getInt(BaseParamNames.BAND_DISPLAY_WATCH_FACE, 0);
    }

    public static int getJieliDownloadWatchFaceCount() {
        return g.getInstance().getInt(JIELI_DOWNLOAD_WATCH_FACE_COUNT, 1);
    }

    public static void saveJieliMultipleDownloadWatchFace() {
        g.getInstance().putInt(JIELI_DOWNLOAD_WATCH_FACE_COUNT, 10);
    }

    public static void setDisplayWatchFaceIndex(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_DISPLAY_WATCH_FACE, i8);
    }
}
