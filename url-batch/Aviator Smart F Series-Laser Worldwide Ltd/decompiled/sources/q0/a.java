package q0;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class a implements n0.a {
    private CRPBleFirmwareUpgradeListener upgradeListener;

    @Override // n0.a
    public void abort() {
        i4.getInstance().abortUpgrade();
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
    }

    @Override // n0.a
    public void setFirmwareUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.upgradeListener = cRPBleFirmwareUpgradeListener;
    }

    @Override // n0.a
    public void start() {
        boolean isGoodix = com.crrepa.band.my.ble.band.utils.a.getInstance().isGoodix();
        f.d("goodix: " + isGoodix);
        i4.getInstance().startUpgrade(isGoodix, this.upgradeListener);
    }
}
