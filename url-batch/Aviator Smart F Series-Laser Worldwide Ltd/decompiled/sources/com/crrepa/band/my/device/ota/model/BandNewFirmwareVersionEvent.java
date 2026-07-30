package com.crrepa.band.my.device.ota.model;

import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;

/* loaded from: classes2.dex */
public class BandNewFirmwareVersionEvent {
    private CRPFirmwareVersionInfo versionInfo;

    public BandNewFirmwareVersionEvent(CRPFirmwareVersionInfo cRPFirmwareVersionInfo) {
        this.versionInfo = cRPFirmwareVersionInfo;
    }

    public CRPFirmwareVersionInfo getVersionInfo() {
        return this.versionInfo;
    }
}
