package com.crrepa.ble.nrf.dfu.internal.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* loaded from: classes3.dex */
public class BootloaderScannerJB implements BootloaderScanner, BluetoothAdapter.LeScanCallback {
    private String mBootloaderAddress;
    private String mDeviceAddress;
    private String mDeviceAddressIncremented;
    private boolean mFound;
    private final Object mLock = new Object();

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i8, byte[] bArr) {
        String address = bluetoothDevice.getAddress();
        if (this.mDeviceAddress.equals(address) || this.mDeviceAddressIncremented.equals(address)) {
            this.mBootloaderAddress = address;
            this.mFound = true;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
        }
    }

    @Override // com.crrepa.ble.nrf.dfu.internal.scanner.BootloaderScanner
    public String searchFor(String str) {
        String substring = str.substring(0, 15);
        String format = String.format("%02X", Integer.valueOf((Integer.valueOf(str.substring(15), 16).intValue() + 1) & 255));
        this.mDeviceAddress = str;
        this.mDeviceAddressIncremented = substring + format;
        this.mBootloaderAddress = null;
        this.mFound = false;
        new Thread(new Runnable() { // from class: com.crrepa.ble.nrf.dfu.internal.scanner.BootloaderScannerJB.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException unused) {
                }
                if (BootloaderScannerJB.this.mFound) {
                    return;
                }
                BootloaderScannerJB.this.mBootloaderAddress = null;
                BootloaderScannerJB.this.mFound = true;
                synchronized (BootloaderScannerJB.this.mLock) {
                    BootloaderScannerJB.this.mLock.notifyAll();
                }
            }
        }, "Scanner timer").start();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        defaultAdapter.startLeScan(this);
        try {
            synchronized (this.mLock) {
                while (!this.mFound) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException unused) {
        }
        defaultAdapter.stopLeScan(this);
        return this.mBootloaderAddress;
    }
}
