package p0;

import android.text.TextUtils;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.ota.jieli.JieliDfuController;

/* loaded from: classes2.dex */
public class a implements n0.a {
    private JieliDfuController jieliDfuController = new JieliDfuController();
    private CRPBleFirmwareUpgradeListener upgradeListener;

    @Override // n0.a
    public void abort() {
        this.jieliDfuController.abort();
    }

    @Override // n0.a
    public void complete() {
    }

    @Override // n0.a
    public void error() {
    }

    @Override // n0.a
    public void recover(boolean z7) {
    }

    @Override // n0.a
    public void release() {
    }

    @Override // n0.a
    public void resume(String str) {
        this.jieliDfuController.start();
    }

    @Override // n0.a
    public void setFirmwareUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.upgradeListener = cRPBleFirmwareUpgradeListener;
        this.jieliDfuController.setUpgradeListener(cRPBleFirmwareUpgradeListener);
    }

    @Override // n0.a
    public void start() {
        if (TextUtils.isEmpty(com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getAddress())) {
            this.upgradeListener.onError(18, "The device's Mac address is null!");
        } else {
            this.jieliDfuController.start();
        }
    }
}
