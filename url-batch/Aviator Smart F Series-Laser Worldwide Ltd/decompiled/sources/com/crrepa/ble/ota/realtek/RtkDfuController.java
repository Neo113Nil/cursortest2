package com.crrepa.ble.ota.realtek;

import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.g1.d;
import java.io.File;

/* loaded from: classes3.dex */
public class RtkDfuController {
    private a controller = new a(d.a());

    public void abort() {
        this.controller.a();
    }

    public void setUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.controller.a(cRPBleFirmwareUpgradeListener);
    }

    public void start(String str) {
        this.controller.b(str);
    }

    public void start(String str, File file) {
        this.controller.b(str);
    }
}
