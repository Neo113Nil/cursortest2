package z1;

import android.util.Log;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceElementInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceScreenInfo;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.google.gson.Gson;
import com.realsil.sdk.dfu.DfuException;

/* loaded from: classes2.dex */
public class j {
    private static final String HISILICON_WATCH_FACE_ELEMENT_INFO = "hisilicon_watch_face_element_info";
    public static final String HISILICON_WATCH_FACE_LAYOUT_INFO = "hisilicon_watch_face_layout_info";
    private static final String HISILICON_WATCH_FACE_SCREEN_INFO = "hisilicon_watch_face_screen_info";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(HISILICON_WATCH_FACE_SCREEN_INFO);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(HISILICON_WATCH_FACE_LAYOUT_INFO + ((int) CRPWatchFaceType.PHOTO_WATCH_FACE.getValue()));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(HISILICON_WATCH_FACE_LAYOUT_INFO + ((int) CRPWatchFaceType.VIDEO_WATCH_FACE.getValue()));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(HISILICON_WATCH_FACE_LAYOUT_INFO + ((int) CRPWatchFaceType.AI_WATCH_FACE.getValue()));
    }

    public static CRPWatchFaceElementInfo getCRPWatchFaceElementInfo() {
        CRPWatchFaceElementInfo cRPWatchFaceElementInfo = (CRPWatchFaceElementInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(HISILICON_WATCH_FACE_ELEMENT_INFO, ""), CRPWatchFaceElementInfo.class);
        if (cRPWatchFaceElementInfo == null) {
            cRPWatchFaceElementInfo = new CRPWatchFaceElementInfo();
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
                cRPWatchFaceElementInfo.setWatchFaceType(CRPWatchFaceType.PHOTO_WATCH_FACE);
                cRPWatchFaceElementInfo.setDateWidth(com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME);
                cRPWatchFaceElementInfo.setDateHeight(44);
                cRPWatchFaceElementInfo.setTimeWidth(224);
                cRPWatchFaceElementInfo.setTimeHeight(115);
            } else {
                cRPWatchFaceElementInfo.setWatchFaceType(CRPWatchFaceType.PHOTO_WATCH_FACE);
                cRPWatchFaceElementInfo.setDateWidth(79);
                cRPWatchFaceElementInfo.setDateHeight(15);
                cRPWatchFaceElementInfo.setTimeWidth(107);
                cRPWatchFaceElementInfo.setTimeHeight(37);
            }
        }
        return cRPWatchFaceElementInfo;
    }

    public static CRPWatchFaceScreenInfo getCRPWatchFaceScreenInfo() {
        CRPWatchFaceScreenInfo cRPWatchFaceScreenInfo = (CRPWatchFaceScreenInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(HISILICON_WATCH_FACE_SCREEN_INFO, ""), CRPWatchFaceScreenInfo.class);
        if (cRPWatchFaceScreenInfo == null) {
            cRPWatchFaceScreenInfo = new CRPWatchFaceScreenInfo();
            cRPWatchFaceScreenInfo.setWidth(466);
            cRPWatchFaceScreenInfo.setHeight(466);
            cRPWatchFaceScreenInfo.setCornerRadius(233);
            cRPWatchFaceScreenInfo.setThumbHeight(DfuException.ERROR_ENTER_OTA_MODE_FAILED);
            cRPWatchFaceScreenInfo.setThumbWidth(DfuException.ERROR_ENTER_OTA_MODE_FAILED);
            cRPWatchFaceScreenInfo.setThumbCornerRadius(140);
            Log.d("NumberLabelInfoProvider", "screenInfo: null");
        }
        Log.d("NumberLabelInfoProvider", "screenInfo: " + new Gson().toJson(cRPWatchFaceScreenInfo));
        return cRPWatchFaceScreenInfo;
    }

    public static CRPHisiliconWatchFaceLayoutInfo getNewWatchFaceLayoutInfo(CRPWatchFaceType cRPWatchFaceType) {
        CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo = (CRPHisiliconWatchFaceLayoutInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(HISILICON_WATCH_FACE_LAYOUT_INFO + ((int) cRPWatchFaceType.getValue()), ""), CRPHisiliconWatchFaceLayoutInfo.class);
        if (cRPHisiliconWatchFaceLayoutInfo == null) {
            cRPHisiliconWatchFaceLayoutInfo = new CRPHisiliconWatchFaceLayoutInfo();
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
                cRPHisiliconWatchFaceLayoutInfo.setTextColor(w1.j.getWatchFaceTextColorInt(0));
                cRPHisiliconWatchFaceLayoutInfo.setTimeBottomContent(1);
                cRPHisiliconWatchFaceLayoutInfo.setTimeTopContent(3);
                cRPHisiliconWatchFaceLayoutInfo.setX(108);
                cRPHisiliconWatchFaceLayoutInfo.setY(75);
                cRPHisiliconWatchFaceLayoutInfo.setWatchFaceType(cRPWatchFaceType);
            } else {
                cRPHisiliconWatchFaceLayoutInfo.setTextColor(w1.j.getWatchFaceTextColorInt(0));
                cRPHisiliconWatchFaceLayoutInfo.setTimeTopContent(1);
                cRPHisiliconWatchFaceLayoutInfo.setTimeBottomContent(2);
                cRPHisiliconWatchFaceLayoutInfo.setX(67);
                cRPHisiliconWatchFaceLayoutInfo.setY(45);
                cRPHisiliconWatchFaceLayoutInfo.setWatchFaceType(cRPWatchFaceType);
            }
        }
        return cRPHisiliconWatchFaceLayoutInfo;
    }

    public static void saveCRPWatchFaceElementInfo(CRPWatchFaceElementInfo cRPWatchFaceElementInfo) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(HISILICON_WATCH_FACE_ELEMENT_INFO, new Gson().toJson(cRPWatchFaceElementInfo));
    }

    public static void saveCRPWatchFaceScreenInfo(CRPWatchFaceScreenInfo cRPWatchFaceScreenInfo) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(HISILICON_WATCH_FACE_SCREEN_INFO, new Gson().toJson(cRPWatchFaceScreenInfo));
    }

    public static void saveNewWatchFaceLayoutInfo(CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo) {
        String json = new Gson().toJson(cRPHisiliconWatchFaceLayoutInfo);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(HISILICON_WATCH_FACE_LAYOUT_INFO + ((int) cRPHisiliconWatchFaceLayoutInfo.getWatchFaceType().getValue()), json);
    }
}
