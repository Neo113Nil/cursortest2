package i0;

import com.crrepa.ble.conn.CRPBleConnection;
import com.crrepa.ble.ota.goodix.BleRestoreConnection;
import com.crrepa.ble.ota.goodix.BleRestoreGattCallback;
import com.crrepa.d0.b;
import com.crrepa.h.d;

/* loaded from: classes2.dex */
public interface a {
    CRPBleConnection a(d dVar);

    BleRestoreConnection a(BleRestoreGattCallback bleRestoreGattCallback);

    b a(com.crrepa.d0.d dVar);

    void disconnect();
}
