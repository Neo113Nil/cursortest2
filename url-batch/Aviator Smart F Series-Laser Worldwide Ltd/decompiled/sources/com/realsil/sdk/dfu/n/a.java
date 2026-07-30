package com.realsil.sdk.dfu.n;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.m.a;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public final class a extends com.realsil.sdk.dfu.m.a {
    public a(int i8, ConnectParams connectParams, String str, BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, a.c cVar) {
        super(i8, connectParams, str, bluetoothGatt, bluetoothGattService, bluetoothGattService2, cVar);
        e();
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
            ZLogger.w(this.f16010i, "Characteristic read error: " + i8);
            if (!h.f16238g.equals(uuid)) {
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
        if (h.f16238g.equals(uuid)) {
            ZLogger.v(this.f16011j, "update device info");
            b().parseX0012(bArr);
            i();
            return;
        }
        if (h.f16233b.equals(uuid)) {
            b().parseDeviceMac(bArr);
            i();
            return;
        }
        if (h.f16234c.equals(uuid)) {
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
        if (h.f16235d.equals(uuid)) {
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
        if (!h.f16236e.equals(uuid)) {
            int shortValue = BluetoothUuidCompat.toShortValue(uuid);
            if (shortValue >= 65504 && shortValue <= 65519) {
                ZLogger.v(this.f16010i, "X0012:appendActiveImageVersionBytes");
                b().appendActiveImageVersionBytes(bArr);
            }
            i();
            return;
        }
        if (length > 0) {
            ByteBuffer wrap3 = ByteBuffer.wrap(bArr);
            wrap3.order(ByteOrder.LITTLE_ENDIAN);
            if (length == 1) {
                b8 = b();
                i9 = wrap3.get(0);
            } else if (length == 2) {
                b8 = b();
                i9 = wrap3.getShort(0) & u.MAX_VALUE;
            }
            b8.setPatchExtensionVersion(i9);
        }
        i();
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
        for (int i8 = 65504; i8 <= 65519; i8++) {
            UUID fromShortValue = BluetoothUuidCompat.fromShortValue(i8);
            BluetoothGattCharacteristic characteristic = this.f16018q.getCharacteristic(fromShortValue);
            if (characteristic == null) {
                ZLogger.v(this.f16011j, "not found image version characteristic:" + fromShortValue.toString());
                return true;
            }
            ZLogger.v(this.f16011j, "find image version characteristic: " + fromShortValue.toString());
            this.f16022u.add(characteristic);
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
            ZLogger.v(this.f16010i, "read battery level :" + a8);
        }
        if (this.f16017p != null) {
            b(259);
            boolean a9 = a(this.f16017p);
            ZLogger.v(this.f16010i, "read PnP_ID :" + a9);
        }
        if (this.f16020s != null) {
            b(260);
            boolean a10 = a(this.f16020s);
            ZLogger.v(this.f16010i, "read device info :" + a10);
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
            ZLogger.v(this.f16010i, "read device mac :" + a11);
        }
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16022u) {
            int shortValue = BluetoothUuidCompat.toShortValue(bluetoothGattCharacteristic.getUuid());
            ZLogger.v(this.f16011j, String.format("uuidShortValue=0x%4x", Integer.valueOf(shortValue)));
            if (shortValue >= 65504 && shortValue <= 65519) {
                b(DfuException.ERROR_WRITE_CHARAC_ERROR);
                boolean a12 = a(bluetoothGattCharacteristic, true);
                ZLogger.d(this.f16010i, "X0012: read image version :" + a12);
            }
        }
        if (this.f16011j) {
            ZLogger.d("readDeviceInfo complete: " + b().toString());
        }
        this.f16026y.clear();
        this.f16022u.clear();
        b(1);
    }
}
