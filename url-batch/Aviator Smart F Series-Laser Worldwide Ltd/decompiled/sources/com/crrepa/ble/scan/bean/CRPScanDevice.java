package com.crrepa.ble.scan.bean;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes3.dex */
public class CRPScanDevice {
    private BluetoothDevice mDevice;
    private int mRssi;
    private byte[] mScanRecord;
    private String name;

    public CRPScanDevice(BluetoothDevice bluetoothDevice, byte[] bArr, int i8, String str) {
        this.mDevice = bluetoothDevice;
        this.mScanRecord = bArr;
        this.mRssi = i8;
        this.name = str;
    }

    public BluetoothDevice getDevice() {
        return this.mDevice;
    }

    public String getName() {
        return this.name;
    }

    public int getRssi() {
        return this.mRssi;
    }

    public byte[] getScanRecord() {
        return this.mScanRecord;
    }
}
