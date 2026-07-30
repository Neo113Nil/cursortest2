package com.crrepa.band.my.device.localvideo;

import com.crrepa.ble.conn.bean.CRPLocalVideoInfo;
import com.google.gson.Gson;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class m {
    private static final String AVAILABLE_SIZE = "available_size_local_video";
    public static final String CRP_LOCAL_VIDEO_INFO = "crp_local_video_info";
    private static final String VIDEO_MAX_COUNT = "video_max_count";
    private static final String VIDEO_MAX_DURATION = "video_max_duration";
    private static final String VIDEO_SAVED_COUNT = "video_saved_count";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(CRP_LOCAL_VIDEO_INFO);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(VIDEO_SAVED_COUNT);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(VIDEO_MAX_COUNT);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(AVAILABLE_SIZE);
    }

    public static int getAvailableSize() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(AVAILABLE_SIZE, 0);
    }

    public static CRPLocalVideoInfo getCRPLocalVideoInfo() {
        CRPLocalVideoInfo cRPLocalVideoInfo = (CRPLocalVideoInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(CRP_LOCAL_VIDEO_INFO, ""), CRPLocalVideoInfo.class);
        if (cRPLocalVideoInfo != null) {
            return cRPLocalVideoInfo;
        }
        CRPLocalVideoInfo cRPLocalVideoInfo2 = new CRPLocalVideoInfo();
        cRPLocalVideoInfo2.setWidth(466);
        cRPLocalVideoInfo2.setHeight(466);
        cRPLocalVideoInfo2.setVideoWidth(466);
        cRPLocalVideoInfo2.setVideoHeight(466);
        cRPLocalVideoInfo2.setVideoCornerRadius(233);
        cRPLocalVideoInfo2.setMaxDuration(15);
        cRPLocalVideoInfo2.setMaxCount(3);
        cRPLocalVideoInfo2.setSavedCount(0);
        cRPLocalVideoInfo2.setAvailableSize(0);
        cRPLocalVideoInfo2.setVideoList(new ArrayList());
        return cRPLocalVideoInfo2;
    }

    public static int getVideoMaxCount() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(VIDEO_MAX_COUNT, -1);
    }

    public static int getVideoMaxDuration() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(VIDEO_MAX_DURATION, 15);
    }

    public static int getVideoSavedCount() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(VIDEO_SAVED_COUNT, -1);
    }

    public static boolean isSupport() {
        return getVideoSavedCount() >= 0;
    }

    private static void saveAvailableSize(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(AVAILABLE_SIZE, i8);
    }

    public static void saveCRPLocalVideoInfo(CRPLocalVideoInfo cRPLocalVideoInfo) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(CRP_LOCAL_VIDEO_INFO, new Gson().toJson(cRPLocalVideoInfo));
        saveVideoMaxDuration(cRPLocalVideoInfo.getMaxDuration());
        saveVideoSavedCount(cRPLocalVideoInfo.getSavedCount());
        saveVideoMaxCount(cRPLocalVideoInfo.getMaxCount());
        saveAvailableSize(cRPLocalVideoInfo.getAvailableSize());
    }

    private static void saveVideoMaxCount(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(VIDEO_MAX_COUNT, i8);
    }

    private static void saveVideoMaxDuration(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(VIDEO_MAX_DURATION, i8);
    }

    private static void saveVideoSavedCount(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(VIDEO_SAVED_COUNT, i8);
    }
}
