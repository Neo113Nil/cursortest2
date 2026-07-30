package n0;

import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;

/* loaded from: classes2.dex */
public interface a {
    void abort();

    void complete();

    void error();

    void recover(boolean z7);

    void release();

    void resume(String str);

    void setFirmwareUpgradeListener(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener);

    void start();
}
