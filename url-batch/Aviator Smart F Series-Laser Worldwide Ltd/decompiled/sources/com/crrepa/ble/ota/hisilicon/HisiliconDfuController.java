package com.crrepa.ble.ota.hisilicon;

import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.c0.d;

/* loaded from: classes3.dex */
public class HisiliconDfuController {
    private final d controller = new d();

    public void abort() {
        this.controller.a();
    }

    public void setUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.controller.a(cRPBleFirmwareUpgradeListener);
    }

    public void start() {
        this.controller.f();
    }
}
