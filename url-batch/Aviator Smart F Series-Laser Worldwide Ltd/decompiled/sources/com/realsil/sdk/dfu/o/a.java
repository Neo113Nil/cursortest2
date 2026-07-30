package com.realsil.sdk.dfu.o;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.m.a;
import com.realsil.sdk.dfu.m.j;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.r.g;
import com.realsil.sdk.dfu.r.h;
import com.realsil.sdk.dfu.utils.ConnectParams;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public final class a extends com.realsil.sdk.dfu.m.a {
    public BluetoothGattCharacteristic N;
    public BluetoothGattCharacteristic O;
    public BluetoothGattCharacteristic P;
    public boolean Q;

    public a(int i8, ConnectParams connectParams, String str, BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, a.c cVar) {
        super(i8, connectParams, str, bluetoothGatt, bluetoothGattService, bluetoothGattService2, cVar);
        this.Q = false;
        e();
    }

    @Override // com.realsil.sdk.dfu.m.a
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        super.a(bluetoothGatt, bluetoothGattCharacteristic, bArr);
        bluetoothGattCharacteristic.getUuid();
        if (g.f16275c.equals(bluetoothGattCharacteristic.getUuid())) {
            j a8 = j.a(bArr);
            if (a8 == null) {
                ZLogger.w("notification data invalid");
                return;
            }
            if (this.f16011j) {
                ZLogger.v(a8.toString());
            }
            if (a8.b() && a8.f16062b == 13) {
                if (a8.f16064d[0] == 1) {
                    b().parseX0000(bArr, 3);
                } else {
                    ZLogger.w("Get temp dev info failed");
                }
                i();
            }
        }
    }

    @Override // com.realsil.sdk.dfu.m.a
    public void e() {
        super.e();
        if (this.f16024w != null) {
            this.A.add(new OtaModeInfo(16));
        }
        if (this.f16019r != null) {
            this.A.add(new OtaModeInfo(0));
        }
    }

    @Override // com.realsil.sdk.dfu.m.a
    public boolean f() {
        if (!super.f()) {
            return false;
        }
        BluetoothGattService bluetoothGattService = this.f16018q;
        UUID uuid = h.f16279c;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.O = characteristic;
        if (characteristic == null) {
            if (this.f16010i) {
                ZLogger.d("OTA_READ_PATCH_CHARACTERISTIC_UUID not found");
            }
        } else if (this.f16011j) {
            ZLogger.v("find OTA_READ_PATCH_CHARACTERISTIC_UUID = " + uuid);
        }
        BluetoothGattService bluetoothGattService2 = this.f16018q;
        UUID uuid2 = h.f16280d;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.N = characteristic2;
        if (characteristic2 == null) {
            if (this.f16010i) {
                ZLogger.d("OTA_APP_VERSION_CHARACTERISTIC_UUID not found");
            }
        } else if (this.f16011j) {
            ZLogger.v("find OTA_APP_VERSION_CHARACTERISTIC_UUID = " + uuid2);
        }
        BluetoothGattService bluetoothGattService3 = this.f16018q;
        UUID uuid3 = h.f16281e;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.P = characteristic3;
        if (characteristic3 == null) {
            ZLogger.d(this.f16010i, "OTA_READ_PATCH_EXTENSION_CHARACTERISTIC_UUID not found");
        } else if (this.f16011j) {
            ZLogger.v("find OTA_READ_PATCH_EXTENSION_CHARACTERISTIC_UUID = " + uuid3);
        }
        for (int i8 = 65504; i8 <= 65519; i8++) {
            UUID fromShortValue = BluetoothUuidCompat.fromShortValue(i8);
            BluetoothGattCharacteristic characteristic4 = this.f16018q.getCharacteristic(fromShortValue);
            if (characteristic4 == null) {
                ZLogger.d(this.f16011j, "not found image version characteristic:" + fromShortValue.toString());
                return true;
            }
            ZLogger.d(this.f16011j, "find image version characteristic: " + fromShortValue.toString());
            this.f16022u.add(characteristic4);
        }
        return true;
    }

    @Override // com.realsil.sdk.dfu.m.a
    public void g() {
        super.g();
        b(257);
        if (this.f16016o != null) {
            b(258);
            boolean a8 = a(this.f16016o);
            ZLogger.v(this.f16011j, "read battery level :" + a8);
        }
        if (this.f16017p != null) {
            b(259);
            boolean a9 = a(this.f16017p);
            ZLogger.v(this.f16011j, "read PnP_ID :" + a9);
        }
        if (this.f16020s != null) {
            b(260);
            boolean a10 = a(this.f16020s);
            ZLogger.v(this.f16011j, "read device info :" + a10);
            if (!a10) {
                this.f16026y.clear();
                this.f16022u.clear();
                b(2);
                return;
            }
        }
        if (this.f16021t != null) {
            b(261);
            boolean a11 = a(this.f16021t);
            ZLogger.v(this.f16011j, "read device mac :" + a11);
        }
        if (b().specVersion == 0) {
            if (this.N != null) {
                b(DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS);
                boolean a12 = a(this.N);
                ZLogger.v(this.f16011j, "read app version :" + a12);
            }
            if (this.O != null) {
                b(DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS);
                boolean a13 = a(this.O);
                ZLogger.v(this.f16011j, "attempt to read patch version :" + a13);
            }
            if (this.P != null) {
                b(DfuException.ERROR_CONNECT_ERROR);
                boolean a14 = a(this.P);
                ZLogger.v(this.f16011j, "attempt to read patch extension version :" + a14);
            }
        }
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16022u) {
            int shortValue = BluetoothUuidCompat.toShortValue(bluetoothGattCharacteristic.getUuid());
            ZLogger.v(this.f16009h, String.format("uuidShortValue=0x%4x", Integer.valueOf(shortValue)));
            if (shortValue >= 65504 && shortValue <= 65519 && b().specVersion != 0) {
                b(DfuException.ERROR_WRITE_CHARAC_ERROR);
                boolean a15 = a(bluetoothGattCharacteristic, true);
                ZLogger.v(this.f16011j, "read image version :" + a15);
            }
        }
        if (this.f16011j) {
            ZLogger.v("readDeviceInfo complete: " + b().toString());
        }
        this.f16026y.clear();
        this.f16022u.clear();
        b(1);
    }

    @Override // com.realsil.sdk.dfu.m.a
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
        OtaDeviceInfo b8;
        int i9;
        OtaDeviceInfo b9;
        int i10;
        OtaDeviceInfo b10;
        int i11;
        super.a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        if (i8 != 0) {
            ZLogger.w(this.f16009h, "Characteristic read error: " + i8);
            if (!h.f16283g.equals(uuid)) {
                ZLogger.d("ignore exception when read other info");
                return;
            } else {
                b(2);
                i();
                return;
            }
        }
        int length = bArr != null ? bArr.length : 0;
        if (com.realsil.sdk.dfu.m.b.f16031b.equals(uuid)) {
            a(bArr);
            i();
            return;
        }
        if (com.realsil.sdk.dfu.m.g.f16054e.equals(uuid)) {
            ZLogger.v("PNP_ID: " + DataConverter.bytes2Hex(bArr));
            b().setPnpId(bArr);
            i();
            return;
        }
        if (h.f16283g.equals(uuid)) {
            b().parseX0000(bArr);
            i();
            return;
        }
        if (h.f16278b.equals(uuid)) {
            b().parseDeviceMac(bArr);
            i();
            return;
        }
        if (h.f16279c.equals(uuid)) {
            if (length > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                if (length == 2) {
                    b10 = b();
                    i11 = wrap.getShort(0);
                } else if (length >= 4) {
                    b10 = b();
                    i11 = wrap.getInt(0);
                }
                b10.setPatchVersion(i11 & 65535);
            }
            i();
            return;
        }
        if (h.f16280d.equals(uuid)) {
            if (length > 0) {
                ByteBuffer wrap2 = ByteBuffer.wrap(bArr);
                wrap2.order(ByteOrder.LITTLE_ENDIAN);
                if (length == 2) {
                    b9 = b();
                    i10 = wrap2.getShort(0) & u.MAX_VALUE;
                } else if (length >= 4) {
                    b9 = b();
                    i10 = wrap2.getInt(0);
                }
                b9.setAppVersion(i10);
            }
            i();
            return;
        }
        if (!h.f16281e.equals(uuid)) {
            int shortValue = BluetoothUuidCompat.toShortValue(uuid);
            if (shortValue >= 65504 && shortValue <= 65519) {
                b().appendActiveImageVersionBytes(bArr);
            }
            i();
            return;
        }
        ByteBuffer wrap3 = ByteBuffer.wrap(bArr);
        wrap3.order(ByteOrder.LITTLE_ENDIAN);
        if (length != 1) {
            if (length == 2) {
                b8 = b();
                i9 = wrap3.getShort(0) & u.MAX_VALUE;
            }
            i();
        }
        b8 = b();
        i9 = wrap3.get(0);
        b8.setPatchExtensionVersion(i9);
        i();
    }
}
