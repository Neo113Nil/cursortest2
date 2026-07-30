package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.device.ota.model.BandNewFirmwareVersionEvent;
import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;
import com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback;

/* loaded from: classes2.dex */
public class k implements CRPDeviceNewFirmwareVersionCallback {
    @Override // com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback
    public void onLatestVersion() {
        com.orhanobut.logger.f.d("onLatestVersion");
        org.greenrobot.eventbus.c.getDefault().post(new BandNewFirmwareVersionEvent(null));
    }

    @Override // com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback
    public void onNewFirmwareVersion(CRPFirmwareVersionInfo cRPFirmwareVersionInfo) {
        com.orhanobut.logger.f.d("onNewFirmwareVersion");
        org.greenrobot.eventbus.c.getDefault().post(new BandNewFirmwareVersionEvent(cRPFirmwareVersionInfo));
    }
}
