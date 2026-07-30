package com.realsil.sdk.core.bluetooth.connection.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.annotation.Keep;
import cn.hutool.core.text.l;
import com.realsil.sdk.core.bluetooth.GlobalGatt;
import com.realsil.sdk.core.bluetooth.compat.BluetoothGattCompat;
import com.realsil.sdk.core.bluetooth.connection.BluetoothClient;
import com.realsil.sdk.core.bluetooth.connection.le.GattConnParams;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.UUID;

/* loaded from: classes4.dex */
public class BluetoothGattClient extends BluetoothClient {
    public static final UUID CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final int GATT_HEADER_SIZE = 3;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15464k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f15465l = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15466m = false;

    @Keep
    protected BluetoothGatt mBluetoothGatt;

    @Keep
    protected GattConnParams mGattConnParams;

    @Keep
    protected GlobalGatt mGlobalGatt;

    public final void a(long j8) {
        synchronized (this.f15456h) {
            try {
                try {
                    if (this.TVDBG) {
                        ZLogger.v("waitConnLock");
                    }
                    this.f15456h.wait(j8);
                } catch (InterruptedException unused) {
                    if (this.VDBG) {
                        ZLogger.v("wait conn lock interrupted: ");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public final void c() {
        super.c();
        this.mGattConnParams = new GattConnParams.Builder().build();
        GlobalGatt globalGatt = GlobalGatt.getInstance();
        this.mGlobalGatt = globalGatt;
        if (globalGatt == null) {
            GlobalGatt.initial(this.mContext);
            this.mGlobalGatt = GlobalGatt.getInstance();
        }
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public synchronized void destroy() {
        super.destroy();
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public void disconnect() {
        super.disconnect();
        notifyConnLock();
    }

    @Override // com.realsil.sdk.core.bluetooth.connection.BluetoothClient
    public boolean isConnected() {
        GlobalGatt globalGatt = this.mGlobalGatt;
        if (globalGatt == null) {
            return false;
        }
        return globalGatt.isConnected(this.mDeviceAddress);
    }

    public void notifyCccdEnabled(boolean z7) {
        this.f15464k = z7;
        notifyConnLock();
    }

    public void notifyConnLock() {
        synchronized (this.f15456h) {
            if (this.TVDBG) {
                ZLogger.v("notifyConnLock");
            }
            try {
                this.f15456h.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    public void notifyConnLockWithState(int i8) {
        synchronized (this.f15456h) {
            try {
                if (this.f15465l == i8) {
                    try {
                        if (this.TVDBG) {
                            ZLogger.v("notifyConnLockWithState:" + i8);
                        }
                        this.f15456h.notifyAll();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean readCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            if (this.DBG) {
                ZLogger.w("characteristic can not be null.");
            }
            return false;
        }
        if (isConnected()) {
            this.mGlobalGatt.readCharacteristic(this.mDeviceAddress, bluetoothGattCharacteristic);
            return true;
        }
        if (this.DBG) {
            ZLogger.w("connection disconnected.");
        }
        return false;
    }

    public boolean setCharacteristicNotification(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z7) {
        if (bluetoothGattCharacteristic == null) {
            ZLogger.w(this.DBG, "setCharacteristicNotification failed, characteristic can not be null");
            return false;
        }
        int properties = bluetoothGattCharacteristic.getProperties();
        if ((properties & 16) == 0) {
            ZLogger.w(this.DBG, "check properties failed: " + properties);
            return false;
        }
        if (this.mBluetoothGatt == null) {
            ZLogger.v(this.DBG, "device disconnected");
            return false;
        }
        this.f15464k = false;
        if (this.VDBG) {
            ZLogger.v("setCharacteristicNotification(" + BluetoothHelper.formatAddress(this.mDeviceAddress, true) + ") - uuid:" + bluetoothGattCharacteristic.getUuid() + ", enabled:" + z7 + l.SPACE);
        }
        if (!this.mBluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z7)) {
            ZLogger.w(this.DBG, "setCharacteristicNotification failed");
            return false;
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID);
        if (descriptor == null) {
            ZLogger.w(this.DBG, "no descriptor exist");
            return false;
        }
        if (!BluetoothGattCompat.writeDescriptor(this.mBluetoothGatt, descriptor, z7 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
            ZLogger.w(this.DBG, "writeDescriptor failed");
            return false;
        }
        if (!this.f15464k) {
            a(5000L);
            if (!this.f15464k) {
                ZLogger.w(this.DBG, "setCharacteristicNotification timeout");
                return false;
            }
        }
        return true;
    }

    public boolean writeCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, boolean z7) {
        if (bluetoothGattCharacteristic == null) {
            if (this.DBG) {
                ZLogger.w("characteristic can not be null.");
            }
            return false;
        }
        if (!isConnected()) {
            if (this.DBG) {
                ZLogger.w("connection disconnected.");
            }
            return false;
        }
        if (z7) {
            this.mGlobalGatt.writeCharacteristic(this.mDeviceAddress, bluetoothGattCharacteristic, bArr);
            return true;
        }
        this.mGlobalGatt.writeCharacteristicSync(this.mDeviceAddress, bluetoothGattCharacteristic, bArr);
        return true;
    }
}
