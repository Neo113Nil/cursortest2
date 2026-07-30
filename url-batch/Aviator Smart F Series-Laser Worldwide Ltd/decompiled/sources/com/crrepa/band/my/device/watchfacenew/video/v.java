package com.crrepa.band.my.device.watchfacenew.video;

import com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel;
import java.io.File;

/* loaded from: classes2.dex */
public class v {
    private static final String AVAILABLE_SIZE = "available_size_video_watch_face";
    private static final String SAVED_VIDEO_WATCH_FACE_NAME = "saved_video_watch_face_name";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(AVAILABLE_SIZE);
    }

    public static void deleteVideoFiles() {
        new File(LocalVideoModel.getVideoWatchFaceFilePath()).delete();
        new File(LocalVideoModel.getVideoWatchFacePreviewFilePath()).delete();
        new File(LocalVideoModel.getVideoWatchFacePreviewImgPath()).delete();
    }

    public static int getAvailableSize() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(AVAILABLE_SIZE, 0);
    }

    public static String getSavedVideoWatchFaceName() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(SAVED_VIDEO_WATCH_FACE_NAME, "");
    }

    public static void saveAvailableSize(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(AVAILABLE_SIZE, i8);
    }

    public static void saveSavedVideoWatchFaceName(String str) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(SAVED_VIDEO_WATCH_FACE_NAME, str);
    }
}
