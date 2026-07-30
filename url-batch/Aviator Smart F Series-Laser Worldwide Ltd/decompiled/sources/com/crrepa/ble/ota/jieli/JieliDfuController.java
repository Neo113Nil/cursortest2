package com.crrepa.ble.ota.jieli;

import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.ota.jieli.JieliDfuController;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.crrepa.y0.b;
import java.io.File;
import m4.a;

/* loaded from: classes3.dex */
public class JieliDfuController {
    private CRPBleFirmwareUpgradeListener upgradeListener;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(String str) {
        start(new File(str));
    }

    public void abort() {
        b.a().abort();
    }

    public void setUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.upgradeListener = cRPBleFirmwareUpgradeListener;
        b.a().a(cRPBleFirmwareUpgradeListener);
    }

    public void start() {
        FirmwareUpgradePresenter.getInstance().downloadNewFirmware(this.upgradeListener, new a() { // from class: y3.a
            @Override // m4.a
            public final void onComplete(String str) {
                JieliDfuController.this.lambda$start$0(str);
            }
        });
    }

    public void start(File file) {
        b.a().a(file);
        b.a().b();
    }
}
