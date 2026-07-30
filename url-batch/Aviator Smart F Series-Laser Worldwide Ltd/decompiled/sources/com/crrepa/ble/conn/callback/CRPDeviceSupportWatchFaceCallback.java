package com.crrepa.ble.conn.callback;

import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliSupportWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPSifliSupportWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPSupportWatchFaceInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPDeviceSupportWatchFaceCallback {
    void onHisiliconSupportWatchFace(CRPHisiliconWatchFaceInfo cRPHisiliconWatchFaceInfo);

    void onJieliDownloadWatchFaceList(List<Integer> list);

    void onJieliSupportWatchFace(CRPJieliSupportWatchFaceInfo cRPJieliSupportWatchFaceInfo);

    void onSifliSupportWatchFace(CRPSifliSupportWatchFaceInfo cRPSifliSupportWatchFaceInfo);

    void onSupportWatchFace(CRPSupportWatchFaceInfo cRPSupportWatchFaceInfo);
}
