package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle;

import android.util.Log;
import com.baidu.location.BDLocation;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.proxy.WatchFaceDaoProxy;
import com.crrepa.ble.conn.bean.CRPJieliPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceConfigInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.google.gson.Gson;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class e {
    public static final String IS_JIELI_WATCH_FACE_CONFIG_INFO_SYNCED = "is_jieli_watch_face_config_info_synced";
    public static final String JIELI_707_PLATFORM = "jieli_707_platform";
    public static final String JIELI_PHOTO_WATCH_FACE_INFO = "jieli_photo_watch_face_info";
    private static final String JIELI_SELECTED_HAND_ID = "jieli_selected_hand_id";
    private static final String JIELI_SELECTED_POINTER_PREVIEW_PATH = "jieli_selected_pointer_preview_path";
    public static final String JIELI_WATCH_FACE_CONFIG_INFO = "jieli_watch_face_config_info";
    public static final String JIELI_WATCH_FACE_LAYOUT_INFO = "jieli_watch_face_layout_info";

    public static void delete() {
        CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.PHOTO_WATCH_FACE;
        deleteSelectedHandId(cRPWatchFaceType);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(JIELI_WATCH_FACE_LAYOUT_INFO + ((int) cRPWatchFaceType.getValue()));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(JIELI_PHOTO_WATCH_FACE_INFO + ((int) cRPWatchFaceType.getValue()));
        CRPWatchFaceType cRPWatchFaceType2 = CRPWatchFaceType.VIDEO_WATCH_FACE;
        deleteSelectedHandId(cRPWatchFaceType2);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(JIELI_WATCH_FACE_LAYOUT_INFO + ((int) cRPWatchFaceType2.getValue()));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(JIELI_PHOTO_WATCH_FACE_INFO + ((int) cRPWatchFaceType2.getValue()));
        CRPWatchFaceType cRPWatchFaceType3 = CRPWatchFaceType.AI_WATCH_FACE;
        deleteSelectedHandId(cRPWatchFaceType3);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(JIELI_WATCH_FACE_LAYOUT_INFO + ((int) cRPWatchFaceType3.getValue()));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(JIELI_PHOTO_WATCH_FACE_INFO + ((int) cRPWatchFaceType3.getValue()));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(JIELI_WATCH_FACE_CONFIG_INFO);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(IS_JIELI_WATCH_FACE_CONFIG_INFO_SYNCED);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(JIELI_707_PLATFORM);
    }

    public static void deleteSelectedHandId(CRPWatchFaceType cRPWatchFaceType) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(getSelectedHandIdKey(cRPWatchFaceType));
    }

    public static void deleteSelectedPointerPreviewPath(CRPWatchFaceType cRPWatchFaceType) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(getSelectedPointerPreviewPathKey(cRPWatchFaceType));
    }

    public static CRPJieliPhotoWatchFaceInfo getJieliPhotoWatchFaceInfo(CRPWatchFaceType cRPWatchFaceType) {
        CRPJieliPhotoWatchFaceInfo cRPJieliPhotoWatchFaceInfo = (CRPJieliPhotoWatchFaceInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(JIELI_PHOTO_WATCH_FACE_INFO + ((int) cRPWatchFaceType.getValue()), ""), CRPJieliPhotoWatchFaceInfo.class);
        if (cRPJieliPhotoWatchFaceInfo == null) {
            Log.d("JieliProvider", "watchFaceInfo == null");
            cRPJieliPhotoWatchFaceInfo = new CRPJieliPhotoWatchFaceInfo();
            cRPJieliPhotoWatchFaceInfo.setPhotoCount(0);
            cRPJieliPhotoWatchFaceInfo.setSupportPointer(false);
            cRPJieliPhotoWatchFaceInfo.setSupportSecondHand(false);
            cRPJieliPhotoWatchFaceInfo.setSupportScale(false);
            cRPJieliPhotoWatchFaceInfo.setHandX(67);
            cRPJieliPhotoWatchFaceInfo.setHandY(45);
            cRPJieliPhotoWatchFaceInfo.setPhotoList(new ArrayList());
            cRPJieliPhotoWatchFaceInfo.setWatchHandID(0);
        }
        Log.d("JieliProvider", "watchFaceInfo == " + cRPJieliPhotoWatchFaceInfo);
        return cRPJieliPhotoWatchFaceInfo;
    }

    public static CRPJieliWatchFaceConfigInfo getJieliWatchFaceConfigInfo() {
        int i8;
        int i9;
        int i10;
        int i11;
        CRPJieliWatchFaceConfigInfo cRPJieliWatchFaceConfigInfo = (CRPJieliWatchFaceConfigInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(JIELI_WATCH_FACE_CONFIG_INFO, ""), CRPJieliWatchFaceConfigInfo.class);
        if (cRPJieliWatchFaceConfigInfo == null) {
            Log.d("JieliProvider", "configInfo == null");
            WatchFace watchFace = new WatchFaceDaoProxy().getWatchFace(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
            if (watchFace != null) {
                i8 = watchFace.getWidth().intValue();
                i9 = watchFace.getHeight().intValue();
                i10 = watchFace.getThumWidth().intValue();
                i11 = watchFace.getThumHeight().intValue();
            } else {
                i8 = 368;
                i9 = 448;
                i10 = 200;
                i11 = 243;
            }
            CRPJieliWatchFaceConfigInfo cRPJieliWatchFaceConfigInfo2 = new CRPJieliWatchFaceConfigInfo();
            cRPJieliWatchFaceConfigInfo2.setMaxPhotoCount(8);
            cRPJieliWatchFaceConfigInfo2.setCurrentPhotoCount(4);
            cRPJieliWatchFaceConfigInfo2.setApiVersion(3);
            cRPJieliWatchFaceConfigInfo2.setSupportType(GattError.GATT_CANCEL);
            cRPJieliWatchFaceConfigInfo2.setWidth(i8);
            cRPJieliWatchFaceConfigInfo2.setHeight(i9);
            cRPJieliWatchFaceConfigInfo2.setCornerRadius(com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null ? com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getRoundedRadius() : 40);
            cRPJieliWatchFaceConfigInfo2.setThumbWidth(i10);
            cRPJieliWatchFaceConfigInfo2.setThumbHeight(i11);
            cRPJieliWatchFaceConfigInfo2.setThumbCornerRadius(40);
            cRPJieliWatchFaceConfigInfo2.setTimeWidth(181);
            cRPJieliWatchFaceConfigInfo2.setTimeHeight(65);
            cRPJieliWatchFaceConfigInfo2.setOtherWidth(181);
            cRPJieliWatchFaceConfigInfo2.setOtherHeight(26);
            cRPJieliWatchFaceConfigInfo = cRPJieliWatchFaceConfigInfo2;
        }
        Log.d("JieliProvider", "configInfo == " + cRPJieliWatchFaceConfigInfo);
        Log.d("getCornerRadius", "configInfo: " + cRPJieliWatchFaceConfigInfo.getCornerRadius());
        return cRPJieliWatchFaceConfigInfo;
    }

    public static CRPJieliWatchFaceLayoutInfo getJieliWatchFaceLayoutInfo(CRPWatchFaceType cRPWatchFaceType) {
        CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo = (CRPJieliWatchFaceLayoutInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(JIELI_WATCH_FACE_LAYOUT_INFO + ((int) cRPWatchFaceType.getValue()), ""), CRPJieliWatchFaceLayoutInfo.class);
        if (cRPJieliWatchFaceLayoutInfo == null) {
            Log.d("JieliProvider", "layoutInfo == null");
            cRPJieliWatchFaceLayoutInfo = new CRPJieliWatchFaceLayoutInfo(cRPWatchFaceType, false);
            if (cRPWatchFaceType == CRPWatchFaceType.PHOTO_WATCH_FACE) {
                cRPJieliWatchFaceLayoutInfo.setPhotoDisplayMode(CRPPhotoWatchFaceDisplayMode.FIXED);
            } else {
                cRPJieliWatchFaceLayoutInfo.setVideoDisplayMode(CRPVideoWatchFaceDisplayMode.ONCE);
            }
            cRPJieliWatchFaceLayoutInfo.setFixedPhotoIndex((byte) 0);
            cRPJieliWatchFaceLayoutInfo.setElementColor(w1.j.getWatchFaceTextColorInt(0));
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
                cRPJieliWatchFaceLayoutInfo.setElementArray(new CRPJieliWatchFaceLayoutInfo.ElementBean[]{new CRPJieliWatchFaceLayoutInfo.ElementBean((byte) 3, BDLocation.TypeServerError, 26), new CRPJieliWatchFaceLayoutInfo.ElementBean((byte) 7, GattError.GATT_NOT_ENCRYPTED, 64), new CRPJieliWatchFaceLayoutInfo.ElementBean((byte) 1, 159, GattError.GATT_ENCRYPED_NO_MITM), new CRPJieliWatchFaceLayoutInfo.ElementBean((byte) 0, 159, 218)});
            } else {
                cRPJieliWatchFaceLayoutInfo.setElementArray(new CRPJieliWatchFaceLayoutInfo.ElementBean[]{new CRPJieliWatchFaceLayoutInfo.ElementBean((byte) 3, 81, 26), new CRPJieliWatchFaceLayoutInfo.ElementBean((byte) 7, 62, 53), new CRPJieliWatchFaceLayoutInfo.ElementBean((byte) 1, 76, 102), new CRPJieliWatchFaceLayoutInfo.ElementBean((byte) 0, 76, 129)});
            }
        }
        Log.d("JieliProvider", "layoutInfo == " + cRPJieliWatchFaceLayoutInfo);
        return cRPJieliWatchFaceLayoutInfo;
    }

    public static int getSelectedHandId(CRPWatchFaceType cRPWatchFaceType) {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(getSelectedHandIdKey(cRPWatchFaceType), 0);
    }

    private static String getSelectedHandIdKey(CRPWatchFaceType cRPWatchFaceType) {
        return "jieli_selected_hand_id_" + (com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress() != null ? com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress() : "") + "_" + ((int) cRPWatchFaceType.getValue());
    }

    public static String getSelectedPointerPreviewPath(CRPWatchFaceType cRPWatchFaceType) {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(getSelectedPointerPreviewPathKey(cRPWatchFaceType), "");
    }

    private static String getSelectedPointerPreviewPathKey(CRPWatchFaceType cRPWatchFaceType) {
        return "jieli_selected_pointer_preview_path_" + (com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress() != null ? com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress() : "") + "_" + ((int) cRPWatchFaceType.getValue());
    }

    public static boolean isJieli707Platform() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(JIELI_707_PLATFORM, false);
    }

    public static boolean isJieliWatchFaceConfigInfoSynced() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(IS_JIELI_WATCH_FACE_CONFIG_INFO_SYNCED, false);
    }

    public static void saveJieli707Platform() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(JIELI_707_PLATFORM, true);
    }

    public static void saveJieliPhotoWatchFaceInfo(CRPWatchFaceType cRPWatchFaceType, CRPJieliPhotoWatchFaceInfo cRPJieliPhotoWatchFaceInfo) {
        String json = new Gson().toJson(cRPJieliPhotoWatchFaceInfo);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(JIELI_PHOTO_WATCH_FACE_INFO + ((int) cRPWatchFaceType.getValue()), json);
    }

    public static void saveJieliWatchFaceConfigInfo(CRPJieliWatchFaceConfigInfo cRPJieliWatchFaceConfigInfo) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(JIELI_WATCH_FACE_CONFIG_INFO, new Gson().toJson(cRPJieliWatchFaceConfigInfo));
    }

    public static void saveJieliWatchFaceConfigInfoSynced(boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(IS_JIELI_WATCH_FACE_CONFIG_INFO_SYNCED, z7);
    }

    public static void saveJieliWatchFaceLayoutInfo(CRPWatchFaceType cRPWatchFaceType, CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        com.crrepa.band.my.device.watchfacenew.delegate.img.m.saveSentToBandSelectedIndex(cRPJieliWatchFaceLayoutInfo.getFixedPhotoIndex());
        com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.savePhotoDisplayMode(cRPJieliWatchFaceLayoutInfo.getPhotoDisplayMode());
        String json = new Gson().toJson(cRPJieliWatchFaceLayoutInfo);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(JIELI_WATCH_FACE_LAYOUT_INFO + ((int) cRPWatchFaceType.getValue()), json);
    }

    public static void saveSelectedHandId(CRPWatchFaceType cRPWatchFaceType, int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(getSelectedHandIdKey(cRPWatchFaceType), i8);
    }

    public static void saveSelectedPointerPreviewPath(CRPWatchFaceType cRPWatchFaceType, String str) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(getSelectedPointerPreviewPathKey(cRPWatchFaceType), str);
    }
}
