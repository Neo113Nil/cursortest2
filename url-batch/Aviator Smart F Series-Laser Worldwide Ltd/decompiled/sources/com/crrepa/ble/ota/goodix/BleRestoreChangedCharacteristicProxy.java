package com.crrepa.ble.ota.goodix;

import android.bluetooth.BluetoothGattCharacteristic;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.c;

/* loaded from: classes3.dex */
public class BleRestoreChangedCharacteristicProxy extends BleRestoreGattProxy {
    private static final int BOOTINFO_PACKAGE_LENGTH = 9;
    private static final int MAX_PACKAGE_COUNT = 350;
    private byte[] allFlashBytes;
    private BleBootInfoChangeListener bootInfoChangeListener;
    private int flashIndex;
    private boolean packageEnded;
    private int packageLength;
    private byte[] receiveBytes;
    private int receiveIndex;

    private static class Holder {
        private static final BleRestoreChangedCharacteristicProxy INSTANCE = new BleRestoreChangedCharacteristicProxy();

        private Holder() {
        }
    }

    private BleRestoreChangedCharacteristicProxy() {
        this.flashIndex = 0;
        this.receiveBytes = null;
        this.packageEnded = true;
        this.packageLength = 0;
        this.receiveIndex = 0;
        this.allFlashBytes = new byte[358400];
    }

    private boolean checkRecevieBytes(byte[] bArr) {
        BleLog.i("checkRecevieBytes: " + bArr.length);
        int i8 = 0;
        for (int i9 = 2; i9 < bArr.length - 2; i9++) {
            i8 += c.a(bArr[i9]);
        }
        byte[] a8 = c.a(i8);
        return a8[0] == bArr[bArr.length - 2] && a8[1] == bArr[bArr.length - 1];
    }

    public static BleRestoreChangedCharacteristicProxy getInstance() {
        return Holder.INSTANCE;
    }

    private void onBootInfoSendState(boolean z7) {
        BleBootInfoChangeListener bleBootInfoChangeListener = this.bootInfoChangeListener;
        if (bleBootInfoChangeListener != null) {
            bleBootInfoChangeListener.onBootInfoSendState(z7);
        }
    }

    private void parseFlashData(byte[] bArr) {
        boolean z7 = false;
        if (checkRecevieBytes(bArr)) {
            int b8 = c.b(bArr[12], bArr[11]);
            BleLog.i("flashLength: " + b8);
            byte[] bArr2 = new byte[b8];
            System.arraycopy(bArr, 13, bArr2, 0, b8);
            System.arraycopy(bArr2, 0, this.allFlashBytes, this.flashIndex * 1024, b8);
            z7 = true;
        }
        readFalshBytes(z7);
    }

    private void readFalshBytes(boolean z7) {
        if (z7) {
            this.flashIndex++;
        }
        if (this.flashIndex < MAX_PACKAGE_COUNT) {
            BleLog.i("read flash index: " + this.flashIndex);
            BleRestoreWriteCharacteristicProxy.getInstance().insertBleMessage(BleRestoreWriteFormatter.getReadFlashCmd(this.flashIndex));
            return;
        }
        byte[] bArr = this.allFlashBytes;
        byte[] bArr2 = BleRestoreWriteFormatter.BOOT_FLAG_BYTES;
        int a8 = c.a(bArr, bArr2);
        BleLog.i("boot index: " + a8);
        byte[] bArr3 = new byte[40];
        System.arraycopy(this.allFlashBytes, a8 - (40 - bArr2.length), bArr3, 0, 40);
        BleLog.i("bootBytes: " + c.c(bArr3));
        BleBootInfoChangeListener bleBootInfoChangeListener = this.bootInfoChangeListener;
        if (bleBootInfoChangeListener != null) {
            bleBootInfoChangeListener.onBootInfo(bArr3);
        }
    }

    public void onCharacteristicChanged(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        BleLog.i("onCharacteristicChanged: " + c.c(value));
        if (this.packageEnded && value[0] == BleRestoreWriteFormatter.HEAD_FIRST_BYTE && value[1] == BleRestoreWriteFormatter.HEAD_SECOND_BYTE) {
            boolean z7 = value.length == 9;
            if (value[6] != 1) {
                if (z7) {
                    onBootInfoSendState(false);
                    return;
                } else {
                    readFalshBytes(false);
                    return;
                }
            }
            if (z7) {
                onBootInfoSendState(true);
                return;
            }
            byte[] bArr = new byte[2];
            System.arraycopy(value, 11, bArr, 0, 2);
            this.packageLength = c.b(bArr[1], bArr[0]) + 15;
            BleLog.i("onCharacteristicChanged packageLength: " + this.packageLength);
            this.receiveBytes = new byte[this.packageLength];
            this.packageEnded = false;
            this.receiveIndex = 0;
        }
        int i8 = this.packageLength;
        int i9 = this.receiveIndex;
        if (value.length > i8 - i9) {
            this.packageEnded = true;
        } else if (i9 < i8) {
            System.arraycopy(value, 0, this.receiveBytes, i9, value.length);
            this.receiveIndex += value.length;
        }
        if (this.receiveIndex >= this.packageLength) {
            this.packageEnded = true;
        }
        BleLog.i("packetEnded: " + this.packageEnded);
        if (this.packageEnded) {
            parseFlashData(this.receiveBytes);
        }
    }

    public void setBootInfoListener(BleBootInfoChangeListener bleBootInfoChangeListener) {
        this.bootInfoChangeListener = bleBootInfoChangeListener;
    }

    public void setFlashIndex(int i8) {
        this.flashIndex = i8;
    }
}
