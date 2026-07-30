package com.crrepa.ble.ota.hs;

import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.d0.h;

/* loaded from: classes3.dex */
public class HsDfuController {
    private h manager;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static HsDfuController f12295a = new HsDfuController();

        private b() {
        }
    }

    private HsDfuController() {
        this.manager = new h();
    }

    public static HsDfuController getInstance() {
        return b.f12295a;
    }

    public void abort() {
        this.manager.a();
    }

    public void resume() {
        this.manager.f();
    }

    public void setAddress(String str) {
        this.manager.e(str);
    }

    public void setUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.manager.a(cRPBleFirmwareUpgradeListener);
    }

    public void start(boolean z7) {
        this.manager.a(z7);
    }
}
