package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPJieliPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceConfigInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceElementInfo;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPPhotoWatchFaceChangeListener {
    public static final int PLATFORM_HISILICON = 1;
    public static final int PLATFORM_JIELI = 2;

    void onAvailableSize(int i8, int i9);

    void onDisplayMode(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode);

    void onJieliPhotoWatchFace(CRPJieliPhotoWatchFaceInfo cRPJieliPhotoWatchFaceInfo);

    void onJieliWatchFaceConfig(CRPJieliWatchFaceConfigInfo cRPJieliWatchFaceConfigInfo);

    void onJieliWatchFaceLayout(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo);

    void onSavedWatchFace(List<String> list);

    void onWatchFaceElementInfo(CRPWatchFaceElementInfo cRPWatchFaceElementInfo);

    void onWatchFaceLayout(CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo);
}
