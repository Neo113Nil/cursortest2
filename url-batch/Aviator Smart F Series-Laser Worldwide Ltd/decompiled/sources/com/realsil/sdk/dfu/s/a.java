package com.realsil.sdk.dfu.s;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.realsil.sdk.core.bluetooth.compat.BluetoothGattCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.m.a;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public class a extends com.realsil.sdk.dfu.m.a {
    public a(int i8, ConnectParams connectParams, String str, BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, a.c cVar) {
        super(i8, connectParams, str, bluetoothGatt, bluetoothGattService, bluetoothGattService2, cVar);
        k();
        e();
    }

    private void k() {
        if (this.f16024w != null) {
            this.A.add(new OtaModeInfo(16));
        }
        if (this.f16019r != null) {
            this.A.add(new OtaModeInfo(0));
        }
    }

    private void l() {
        List list;
        OtaModeInfo otaModeInfo;
        this.A.clear();
        if (this.f16024w != null) {
            if (b().isRwsEnabled()) {
                list = this.A;
                otaModeInfo = new OtaModeInfo(21);
            } else {
                list = this.A;
                otaModeInfo = new OtaModeInfo(16);
            }
            list.add(otaModeInfo);
            if (b().isVpIdOtaSupported()) {
                this.A.add(new OtaModeInfo(24));
            }
            if (b().isSeqOtaSupported()) {
                this.A.add(new OtaModeInfo(23));
            }
        }
        if (!b().leNormalModeSupported || this.f16019r == null) {
            return;
        }
        this.A.add(new OtaModeInfo(0));
        if (b().isSeqOtaSupported()) {
            this.A.add(new OtaModeInfo(22));
        }
    }

    @Override // com.realsil.sdk.dfu.m.a
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        com.realsil.sdk.dfu.m.j a8;
        super.a(bluetoothGatt, bluetoothGattCharacteristic, bArr);
        if (!com.realsil.sdk.dfu.r.g.f16275c.equals(bluetoothGattCharacteristic.getUuid()) || (a8 = com.realsil.sdk.dfu.m.j.a(bArr)) == null) {
            return;
        }
        if (this.f16012k) {
            ZLogger.v(a8.toString());
        }
        if (a8.b() && a8.f16062b == 13) {
            b().appendImageVersionBytes(a8.a());
            i();
        }
    }

    public final boolean c(int i8) {
        if (i8 >= 4) {
            BluetoothGattService bluetoothGattService = this.f16018q;
            if (bluetoothGattService == null) {
                return true;
            }
            BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(BluetoothUuidCompat.fromShortValue(65524));
            b(DfuException.ERROR_SEND_COMMAND_REACH_MAX_RETRY_TIMES);
            boolean a8 = a(characteristic, true);
            ZLogger.v(this.f16011j, String.format("read section size from %s, ret=%b", characteristic.getUuid(), Boolean.valueOf(a8)));
            return a8;
        }
        boolean z7 = true;
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16022u) {
            ZLogger.v(this.f16011j, String.format("uuidShortValue=0x%4x", Integer.valueOf(BluetoothUuidCompat.toShortValue(bluetoothGattCharacteristic.getUuid()))));
            b(DfuException.ERROR_SEND_COMMAND_REACH_MAX_RETRY_TIMES);
            boolean a9 = a(bluetoothGattCharacteristic, true);
            ZLogger.v(this.f16011j, String.format("read section size from %s, ret=%b", bluetoothGattCharacteristic.getUuid(), Boolean.valueOf(a9)));
            z7 = a9;
        }
        return z7;
    }

    public final boolean d(int i8) {
        if (i8 >= 4) {
            BluetoothGattService bluetoothGattService = this.f16018q;
            if (bluetoothGattService != null) {
                BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(BluetoothUuidCompat.fromShortValue(65504));
                b(DfuException.ERROR_WRITE_CHARAC_ERROR);
                ZLogger.v(this.f16011j, String.format("read image version from %s, ret=%b", characteristic.getUuid(), Boolean.valueOf(a(characteristic, true))));
            }
            return a((byte) 1);
        }
        boolean z7 = true;
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16022u) {
            ZLogger.v(this.f16011j, String.format("uuidShortValue=0x%4x", Integer.valueOf(BluetoothUuidCompat.toShortValue(bluetoothGattCharacteristic.getUuid()))));
            b(DfuException.ERROR_WRITE_CHARAC_ERROR);
            boolean a8 = a(bluetoothGattCharacteristic, true);
            ZLogger.v(this.f16011j, String.format("read image version from %s, ret=%b", bluetoothGattCharacteristic.getUuid(), Boolean.valueOf(a8)));
            z7 = a8;
        }
        return z7;
    }

    @Override // com.realsil.sdk.dfu.m.a
    public boolean f() {
        if (!super.f()) {
            return false;
        }
        int i8 = 65504;
        while (true) {
            if (i8 > 65519) {
                break;
            }
            UUID fromShortValue = BluetoothUuidCompat.fromShortValue(i8);
            BluetoothGattCharacteristic characteristic = this.f16018q.getCharacteristic(fromShortValue);
            if (characteristic == null) {
                ZLogger.v(this.f16011j, "not found image version characteristic:" + fromShortValue.toString());
                break;
            }
            ZLogger.v(this.f16011j, "find image version characteristic: " + fromShortValue.toString());
            this.f16022u.add(characteristic);
            i8++;
        }
        for (int i9 = 65524; i9 <= 65526; i9++) {
            UUID fromShortValue2 = BluetoothUuidCompat.fromShortValue(i9);
            BluetoothGattCharacteristic characteristic2 = this.f16018q.getCharacteristic(fromShortValue2);
            if (characteristic2 == null) {
                ZLogger.d(this.f16009h, "not found image session size characteristic:" + fromShortValue2.toString());
                return true;
            }
            ZLogger.d(this.f16011j, "find image session size characteristic: " + fromShortValue2.toString());
            this.f16023v.add(characteristic2);
        }
        return true;
    }

    @Override // com.realsil.sdk.dfu.m.a
    public void g() {
        int i8;
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
                i8 = 2;
                b(i8);
            }
        }
        if (this.f16021t != null) {
            b(261);
            boolean a11 = a(this.f16021t);
            ZLogger.v(this.f16011j, "read device mac :" + a11);
        }
        int i9 = b().specVersion;
        ZLogger.v(this.f16011j, "specVersion=" + i9);
        d(i9);
        c(i9);
        l();
        if (this.f16011j) {
            ZLogger.d("readDeviceInfo complete: " + b().toString());
        }
        this.f16026y.clear();
        this.f16022u.clear();
        i8 = 1;
        b(i8);
    }

    @Override // com.realsil.sdk.dfu.m.a
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
        super.a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        if (i8 != 0) {
            ZLogger.w(this.f16009h, "Characteristic read error: " + i8);
            if (!j.f16297c.equals(uuid)) {
                ZLogger.d("ignore exception when read other info");
                return;
            } else {
                b(2);
                i();
                return;
            }
        }
        if (com.realsil.sdk.dfu.m.b.f16031b.equals(uuid)) {
            a(bArr);
            i();
            return;
        }
        if (com.realsil.sdk.dfu.m.g.f16054e.equals(uuid)) {
            ZLogger.v(this.f16011j, "PNP_ID: " + DataConverter.bytes2Hex(bArr));
            b().setPnpId(bArr);
            i();
            return;
        }
        if (j.f16297c.equals(uuid)) {
            b().parseX0010(bArr);
            i();
            return;
        }
        if (j.f16296b.equals(uuid)) {
            b().parseDeviceMac(bArr);
            i();
            return;
        }
        int shortValue = BluetoothUuidCompat.toShortValue(uuid);
        if (shortValue >= 65504 && shortValue <= 65519) {
            b().appendImageVersionBytes(bArr);
        } else if (shortValue >= 65524 && shortValue <= 65526) {
            b().appendImageSectionSizeBytes(bArr);
        }
        i();
    }

    public final boolean a(byte b8) {
        BluetoothGatt bluetoothGatt = this.f16015n;
        if (bluetoothGatt == null) {
            ZLogger.w("mBtGatt is null maybe disconnected just now");
            return false;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f16025x;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        if (!a(bluetoothGatt, bluetoothGattCharacteristic, true)) {
            ZLogger.w(this.f16010i, "setCharacteristicNotification failed");
            return false;
        }
        b(DfuException.ERROR_BATTERY_LEVEL_LOW);
        ZLogger.v(this.f16011j, String.format("attempt to read inactive device info, backInd=0x%02X", Byte.valueOf(b8)));
        boolean writeCharacteristic = BluetoothGattCompat.writeCharacteristic(this.f16015n, this.f16025x, new byte[]{13, b8});
        if (writeCharacteristic) {
            j();
            return writeCharacteristic;
        }
        ZLogger.w("read inactive device info failed");
        return writeCharacteristic;
    }
}
