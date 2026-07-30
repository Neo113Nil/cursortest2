package com.crrepa.ble.ota.sifli;

import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.g0.a;
import com.crrepa.g1.d;

/* loaded from: classes3.dex */
public class SifliDfuController {
    private a controller = new a(d.a());

    public void abort() {
        this.controller.a();
    }

    public void resume(String str) {
        this.controller.b(str);
    }

    public void setTimeout(int i8) {
        this.controller.a(i8);
    }

    public void setUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.controller.a(cRPBleFirmwareUpgradeListener);
    }

    public void start(String str) {
        this.controller.c(str);
    }
}
