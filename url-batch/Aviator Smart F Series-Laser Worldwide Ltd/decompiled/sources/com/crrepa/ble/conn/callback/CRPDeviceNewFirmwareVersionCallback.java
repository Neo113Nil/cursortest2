package com.crrepa.ble.conn.callback;

import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;

/* loaded from: classes3.dex */
public interface CRPDeviceNewFirmwareVersionCallback {
    void onLatestVersion();

    void onNewFirmwareVersion(CRPFirmwareVersionInfo cRPFirmwareVersionInfo);
}
