package o0;

import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.ota.hisilicon.HisiliconDfuController;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class a implements n0.a {
    private final HisiliconDfuController controller = new HisiliconDfuController();

    @Override // n0.a
    public void abort() {
        this.controller.abort();
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
        this.controller.setUpgradeListener(cRPBleFirmwareUpgradeListener);
    }

    @Override // n0.a
    public void start() {
        f.d("start Hisilicon ota");
        this.controller.start();
    }
}
