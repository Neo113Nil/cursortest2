package com.crrepa.band.my.device.localphoto;

import com.crrepa.ble.conn.bean.CRPGalleryInfo;
import com.google.gson.Gson;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class l {
    private static final String AVAILABLE_SIZE = "available_size_local_photo";
    public static final String CRP_LOCAL_PHOTO_INFO = "crp_local_photo_info";
    private static final String PHOTO_MAX_COUNT = "photo_max_count";
    private static final String PHOTO_SAVED_COUNT = "photo_saved_count";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(CRP_LOCAL_PHOTO_INFO);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(PHOTO_SAVED_COUNT);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(PHOTO_MAX_COUNT);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(AVAILABLE_SIZE);
    }

    public static int getAvailableSize() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(AVAILABLE_SIZE, 0);
    }

    public static CRPGalleryInfo getCRPLocalPhotoInfo() {
        CRPGalleryInfo cRPGalleryInfo = (CRPGalleryInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(CRP_LOCAL_PHOTO_INFO, ""), CRPGalleryInfo.class);
        if (cRPGalleryInfo != null) {
            return cRPGalleryInfo;
        }
        CRPGalleryInfo cRPGalleryInfo2 = new CRPGalleryInfo();
        cRPGalleryInfo2.setWidth(466);
        cRPGalleryInfo2.setHeight(466);
        cRPGalleryInfo2.setPhotoCount(0);
        cRPGalleryInfo2.setAvailableSize(0);
        cRPGalleryInfo2.setPhotoList(new ArrayList());
        return cRPGalleryInfo2;
    }

    public static int getPhotoSavedCount() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(PHOTO_SAVED_COUNT, -1);
    }

    public static boolean isSupport() {
        return getPhotoSavedCount() >= 0;
    }

    private static void saveAvailableSize(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(AVAILABLE_SIZE, i8);
    }

    public static void saveCRPLocalPhotoInfo(CRPGalleryInfo cRPGalleryInfo) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(CRP_LOCAL_PHOTO_INFO, new Gson().toJson(cRPGalleryInfo));
        savePhotoSavedCount(cRPGalleryInfo.getPhotoCount());
        saveAvailableSize(cRPGalleryInfo.getAvailableSize());
    }

    private static void savePhotoSavedCount(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(PHOTO_SAVED_COUNT, i8);
    }
}
