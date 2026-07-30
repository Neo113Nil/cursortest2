package com.realsil.sdk.core.bluetooth.scanner;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter;
import java.util.Calendar;

/* loaded from: classes4.dex */
public class ExtendedBluetoothDevice {
    public static final boolean DEVICE_IS_BONDED = true;
    public static final boolean DEVICE_NOT_BONDED = false;
    public static final int NO_RSSI = -1000;

    /* renamed from: c, reason: collision with root package name */
    public static final ParcelUuid f15577c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f15578d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f15579e;

    /* renamed from: a, reason: collision with root package name */
    public int f15580a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15581b;
    public BluetoothDevice device;
    public boolean isBonded;
    public boolean isConnected;
    public boolean isMatterSupported;
    public String name;
    public int rssi;
    public byte[] scanRecord;
    public SpecScanRecord specScanRecord;
    public long timestamp;
    public long updateTime;

    public static class AddressComparator {
        public String address;

        public boolean equals(Object obj) {
            return obj instanceof ExtendedBluetoothDevice ? this.address.equals(((ExtendedBluetoothDevice) obj).device.getAddress()) : super.equals(obj);
        }
    }

    static {
        new ParcelUuid(BluetoothUuidCompat.fromShortValue(65526));
        ParcelUuid.fromString("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF");
        f15577c = ParcelUuid.fromString("0000fff6-0000-1000-8000-00805f9b34fb");
        f15578d = new byte[]{0};
        f15579e = new byte[]{0};
    }

    public ExtendedBluetoothDevice(BluetoothDevice bluetoothDevice, String str) {
        this(bluetoothDevice, str, -1000, false, false, null);
    }

    public boolean equals(Object obj) {
        return obj instanceof ExtendedBluetoothDevice ? this.device.getAddress().equals(((ExtendedBluetoothDevice) obj).device.getAddress()) : super.equals(obj);
    }

    public int getConnectState() {
        return this.f15580a;
    }

    public BluetoothDevice getDevice() {
        return this.device;
    }

    public String getName() {
        return this.name;
    }

    public int getRssi() {
        return this.rssi;
    }

    public byte[] getScanRecord() {
        return this.scanRecord;
    }

    public SpecScanRecord getSpecScanRecord() {
        return this.specScanRecord;
    }

    public boolean isBonded() {
        return this.isBonded;
    }

    public boolean isConnect() {
        return this.isConnected;
    }

    public boolean isHogp() {
        return this.f15581b;
    }

    public boolean isUpdateExpired() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        long j8 = this.updateTime;
        return timeInMillis >= j8 && timeInMillis - j8 > 10000;
    }

    public void setBonded(boolean z7) {
        this.isBonded = z7;
    }

    public void setConnect(boolean z7) {
        this.isConnected = z7;
    }

    public void setConnectState(int i8) {
        this.f15580a = i8;
        this.isConnected = i8 == 2;
    }

    public void setDevice(BluetoothDevice bluetoothDevice) {
        this.device = bluetoothDevice;
    }

    public void setHogp(boolean z7) {
        this.f15581b = z7;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRssi(int i8) {
        this.rssi = i8;
    }

    public void setScanRecord(byte[] bArr) {
        this.scanRecord = bArr;
        SpecScanRecord parseFromBytes = SpecScanRecord.parseFromBytes(bArr);
        this.specScanRecord = parseFromBytes;
        if (parseFromBytes != null) {
            if (parseFromBytes.getServiceUuids() != null) {
                this.f15581b = this.specScanRecord.getServiceUuids().contains(BluetoothUuidCompat.HOGP);
            }
            this.isMatterSupported = CompatScanFilter.matchesPartialData(f15578d, f15579e, this.specScanRecord.getServiceData(f15577c));
        }
    }

    public ExtendedBluetoothDevice(BluetoothDevice bluetoothDevice, String str, int i8) {
        this(bluetoothDevice, str, i8, false, false, null);
    }

    public boolean isUpdateExpired(long j8) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        long j9 = this.updateTime;
        return timeInMillis >= j9 && timeInMillis - j9 > j8;
    }

    public ExtendedBluetoothDevice(BluetoothDevice bluetoothDevice, String str, int i8, boolean z7, boolean z8) {
        this(bluetoothDevice, str, i8, z7, z8, null);
    }

    public ExtendedBluetoothDevice(BluetoothDevice bluetoothDevice, String str, int i8, boolean z7, boolean z8, byte[] bArr) {
        this.updateTime = 0L;
        this.isMatterSupported = false;
        this.device = bluetoothDevice;
        this.name = str;
        this.rssi = i8;
        this.isBonded = z7;
        this.isConnected = z8;
        setScanRecord(bArr);
        this.updateTime = Calendar.getInstance().getTimeInMillis();
    }
}
