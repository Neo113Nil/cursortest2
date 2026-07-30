package com.crrepa.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.crrepa.ble.conn.CRPBleDevice;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.scan.callback.CRPScanCallback;
import com.crrepa.g1.d;
import com.crrepa.h.c;
import com.crrepa.z.b;
import com.crrepa.z.e;
import com.crrepa.z.h;
import com.crrepa.z.j;
import f4.a;
import java.util.Set;

/* loaded from: classes3.dex */
public class CRPBleClient {
    private static CRPBleClient mClient;
    private a mBleAdapter;
    private e4.a mBleScanManager;
    private BluetoothManager mBluetoothManager;
    private com.crrepa.w0.a mFirmwareFixManager;

    private CRPBleClient(Context context) {
        d.a(context);
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        this.mBluetoothManager = bluetoothManager;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.mBleAdapter = new a(adapter);
        this.mBleScanManager = new e4.a(adapter);
        j.a().a(false).a(0).b(2).a("MY").a();
        h.a((e) new b());
    }

    public static CRPBleClient create(@NonNull Context context) {
        if (mClient == null) {
            synchronized (CRPBleClient.class) {
                try {
                    if (mClient == null) {
                        if (context == null) {
                            throw new IllegalArgumentException("the provided context must not be null!");
                        }
                        mClient = new CRPBleClient(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return mClient;
    }

    public void cancelScan() {
        this.mBleScanManager.a();
    }

    public void fixOtaDevice(String str, String str2, boolean z7, CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        if (this.mFirmwareFixManager == null) {
            this.mFirmwareFixManager = new com.crrepa.w0.a();
        }
        this.mFirmwareFixManager.a(str, str2, z7, cRPBleFirmwareUpgradeListener);
    }

    public CRPBleDevice getBleDevice(String str) {
        BluetoothDevice a8;
        if (TextUtils.isEmpty(str) || (a8 = this.mBleAdapter.a(str)) == null) {
            return null;
        }
        return new c(d.a(), a8, this.mBluetoothManager);
    }

    public Set<BluetoothDevice> getBondedDevices() {
        return this.mBleAdapter.a();
    }

    public boolean isBluetoothEnable() {
        return this.mBleAdapter.c();
    }

    public boolean scanDevice(CRPScanCallback cRPScanCallback, long j8) {
        return this.mBleScanManager.a(cRPScanCallback, j8);
    }
}
