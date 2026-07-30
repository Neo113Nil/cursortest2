package com.crrepa.band.my.device.watchfacenew.delegate.displaymode;

import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class a {
    public static final String PHOTO_WATCH_FACE_DISPLAY_MODE = "custom_photo_watch_face_display_mode";
    public static final String VIDEO_WATCH_FACE_DISPLAY_MODE = "video_watch_face_display_mode";

    public static void delete() {
        g.getInstance().remove(PHOTO_WATCH_FACE_DISPLAY_MODE);
        g.getInstance().remove(VIDEO_WATCH_FACE_DISPLAY_MODE);
    }

    public static CRPPhotoWatchFaceDisplayMode getPhotoDisplayMode() {
        CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode = (CRPPhotoWatchFaceDisplayMode) new Gson().fromJson(g.getInstance().getString(PHOTO_WATCH_FACE_DISPLAY_MODE, ""), CRPPhotoWatchFaceDisplayMode.class);
        return cRPPhotoWatchFaceDisplayMode == null ? CRPPhotoWatchFaceDisplayMode.SEQUENCE : cRPPhotoWatchFaceDisplayMode;
    }

    public static CRPVideoWatchFaceDisplayMode getVideoDisplayMode() {
        return (CRPVideoWatchFaceDisplayMode) new Gson().fromJson(g.getInstance().getString(VIDEO_WATCH_FACE_DISPLAY_MODE, ""), CRPVideoWatchFaceDisplayMode.class);
    }

    public static void savePhotoDisplayMode(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode) {
        g.getInstance().putString(PHOTO_WATCH_FACE_DISPLAY_MODE, new Gson().toJson(cRPPhotoWatchFaceDisplayMode));
    }

    public static void saveVideoDisplayMode(CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode) {
        g.getInstance().putString(VIDEO_WATCH_FACE_DISPLAY_MODE, new Gson().toJson(cRPVideoWatchFaceDisplayMode));
    }
}
