package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPAiWatchFacePreviewInfo;
import com.crrepa.ble.conn.bean.CRPJieliPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPBleRecordingType;

/* loaded from: classes3.dex */
public interface CRPAiWatchFaceChangeListener {
    void onActivateRecording();

    void onCancel();

    void onConfirmPreview();

    void onPhotoWatchFace(CRPJieliPhotoWatchFaceInfo cRPJieliPhotoWatchFaceInfo);

    void onPhotoWatchFaceLayout(CRPPhotoWatchFaceLayoutInfo cRPPhotoWatchFaceLayoutInfo);

    void onRequestPreview(CRPAiWatchFacePreviewInfo cRPAiWatchFacePreviewInfo);

    void onStartRecording(byte[] bArr);

    void onStopRecording(CRPBleRecordingType cRPBleRecordingType);

    void onWatchFaceLayout(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo);
}
