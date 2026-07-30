package com.crrepa.d0;

import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.trans.upgrade.bean.HSFirmwareInfo;

/* loaded from: classes3.dex */
public interface b {
    void a(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener, HSFirmwareInfo hSFirmwareInfo);

    boolean a();

    void b();

    void setConnectionStateListener(CRPBleConnectionStateListener cRPBleConnectionStateListener);
}
