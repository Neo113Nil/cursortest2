package com.crrepa.band.my.device.appmarket.openharmony.bridge.enm;

import com.crrepa.band.my.device.appmarket.openharmony.OpenWearPlayJSInterface;

/* loaded from: classes2.dex */
public enum CallNativeMethodEnum {
    UPDATE_APP_INSTALL_STATUS(OpenWearPlayJSInterface.UPDATE_APP_INSTALL_STATUS),
    GET_APP_INSTALL_STATUS("getAppInstallStatus"),
    DOWNLOAD_APP("downloadApp"),
    INSTALL_APP("installApp"),
    UNINSTALL_APP("uninstallApp"),
    GET_ALGORITHM_AND_PUBLIC_KEY("getAlgorithmAndPublicKey"),
    GET_WATCH_SYSTEM_INFO("getWatchSystemInfo"),
    GET_WATCH_DEVICE_CAPABILITY("getWatchDeviceCapability"),
    GET_WATCH_FACE_INFO("getWatchFaceInfo"),
    DOWNLOAD_WATCH_FACE("downloadWatchFace"),
    INSTALL_WATCH_FACE("installWatchFace"),
    UNINSTALL_WATCH_FACE("uninstallWatchFace"),
    SET_CURRENT_WATCH_FACE("setCurrentWatchFace"),
    GET_INSTALLED_WATCH_FACE("getInstalledWatchFace"),
    GET_CURRENT_WATCH_FACE("getCurrentWatchFace");

    private final String mValue;

    CallNativeMethodEnum(String str) {
        this.mValue = str;
    }

    public String value() {
        return this.mValue;
    }
}
