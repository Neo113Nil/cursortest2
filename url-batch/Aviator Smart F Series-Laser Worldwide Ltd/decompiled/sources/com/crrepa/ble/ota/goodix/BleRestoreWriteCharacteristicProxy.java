package com.crrepa.ble.ota.goodix;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.crrepa.ble.util.BleLog;
import com.crrepa.p.c;
import d4.a;

/* loaded from: classes3.dex */
public class BleRestoreWriteCharacteristicProxy extends BleRestoreGattProxy {
    private static final int DEFAULT_PACKAGE_LENGTH = 20;
    private static final long WRITE_DELAY_MILLIS = 50;
    private int packageLength;
    private boolean writeCompleted;
    private byte[] writeData;
    private int writeIndex;

    private static class Holder {
        private static final BleRestoreWriteCharacteristicProxy INSTANCE = new BleRestoreWriteCharacteristicProxy();

        private Holder() {
        }
    }

    private BleRestoreWriteCharacteristicProxy() {
        this.writeData = null;
        this.writeIndex = 0;
        this.writeCompleted = true;
        this.packageLength = 20;
    }

    private void characteristicWriteComplete() {
        a.a(new Runnable() { // from class: com.crrepa.ble.ota.goodix.BleRestoreWriteCharacteristicProxy.1
            @Override // java.lang.Runnable
            public void run() {
                BleRestoreWriteCharacteristicProxy.this.messageWriteComolete();
                c.d().h();
            }
        }, WRITE_DELAY_MILLIS);
    }

    public static BleRestoreWriteCharacteristicProxy getInstance() {
        return Holder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void messageWriteComolete() {
        this.writeIndex = 0;
        this.writeCompleted = true;
    }

    private synchronized void writeCharacteristicData() {
        int length = this.writeData.length - this.writeIndex;
        int i8 = this.packageLength;
        if (length > i8) {
            length = i8;
        } else if (length <= 0) {
            characteristicWriteComplete();
            return;
        }
        BluetoothGattCharacteristic writeCharacteristic = getDeviceServices().getWriteCharacteristic();
        BluetoothGatt f8 = com.crrepa.l.a.b().f();
        if (writeCharacteristic != null && f8 != null) {
            BleLog.i("characteristic uuid: " + writeCharacteristic.getUuid().toString());
            byte[] bArr = new byte[length];
            System.arraycopy(this.writeData, this.writeIndex, bArr, 0, length);
            writeCharacteristic.setValue(bArr);
            writeCharacteristic.setWriteType(1);
            BleLog.i("characteristic write data: " + com.crrepa.g1.c.c(bArr));
            boolean writeCharacteristic2 = f8.writeCharacteristic(writeCharacteristic);
            BleLog.i("characteristic write success: " + writeCharacteristic2);
            if (writeCharacteristic2) {
                this.writeIndex += length;
            }
            return;
        }
        BleRestoreGattProxy.disconnect();
    }

    public void insertBleMessage(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        c.d().a(new com.crrepa.p.a(48, bArr));
    }

    public void onCharacteristicWrite() {
        writeCharacteristicData();
    }

    public void reset() {
        messageWriteComolete();
    }

    public void sendBleMessage(byte[] bArr) {
        BleLog.i("sendBleMessage: " + this.writeCompleted);
        if (this.writeCompleted) {
            this.writeData = bArr;
            this.writeCompleted = false;
            writeCharacteristicData();
        }
    }

    public void setPackageLength(int i8) {
        this.packageLength = i8;
    }
}
