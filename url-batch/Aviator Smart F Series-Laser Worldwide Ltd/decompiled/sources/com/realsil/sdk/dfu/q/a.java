package com.realsil.sdk.dfu.q;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.m.a;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes4.dex */
public class a extends com.realsil.sdk.dfu.m.a {
    public a(int i8, ConnectParams connectParams, String str, BluetoothGatt bluetoothGatt, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, a.c cVar) {
        super(i8, connectParams, str, bluetoothGatt, bluetoothGattService, bluetoothGattService2, cVar);
        k();
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
        this.A.clear();
        if (this.f16024w != null) {
            this.A.add(new OtaModeInfo(16));
        }
        if (!b().leNormalModeSupported || this.f16019r == null) {
            return;
        }
        this.A.add(new OtaModeInfo(0));
    }

    @Override // com.realsil.sdk.dfu.m.a
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
        super.a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        if (i8 != 0) {
            ZLogger.w(this.f16009h, "Characteristic read error: " + i8);
            if (!g.f16267c.equals(uuid)) {
                ZLogger.d(this.f16009h, "ignore exception when read other info");
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
            ZLogger.v("PNP_ID: " + DataConverter.bytes2Hex(bArr));
            b().setPnpId(bArr);
            i();
            return;
        }
        if (g.f16267c.equals(uuid)) {
            b().parseX0015(bArr);
            i();
        } else {
            if (g.f16266b.equals(uuid)) {
                b().parseDeviceMac(bArr);
                i();
                return;
            }
            int shortValue = BluetoothUuidCompat.toShortValue(uuid);
            if (shortValue == 65504) {
                b().appendImageVersionBytes(bArr);
            } else if (shortValue == 65524) {
                b().appendImageSectionSizeBytes(bArr);
            }
            i();
        }
    }

    @Override // com.realsil.sdk.dfu.m.a
    public boolean f() {
        if (!super.f()) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = this.f16018q.getCharacteristic(BluetoothUuidCompat.fromShortValue(65504));
        if (characteristic == null) {
            ZLogger.d(this.f16011j, "not found image version characteristic:65504");
        } else {
            ZLogger.d(this.f16011j, "find image version characteristic: " + characteristic.getUuid());
            this.f16022u.add(characteristic);
        }
        BluetoothGattCharacteristic characteristic2 = this.f16018q.getCharacteristic(BluetoothUuidCompat.fromShortValue(65524));
        if (characteristic2 == null) {
            ZLogger.v(this.f16011j, "not found image session size characteristic:65524");
            return true;
        }
        ZLogger.v(this.f16011j, "find image session size characteristic: " + characteristic2.getUuid());
        this.f16026y.add(characteristic2);
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
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16026y) {
            int shortValue = BluetoothUuidCompat.toShortValue(bluetoothGattCharacteristic.getUuid());
            ZLogger.v(this.f16011j, String.format("uuidShortValue=0x%4x", Integer.valueOf(shortValue)));
            if (shortValue == 65524) {
                b(DfuException.ERROR_SEND_COMMAND_REACH_MAX_RETRY_TIMES);
                boolean a12 = a(bluetoothGattCharacteristic, true);
                ZLogger.v(this.f16011j, "read image section size :" + a12);
            }
        }
        Iterator it = this.f16022u.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) it.next();
            int shortValue2 = BluetoothUuidCompat.toShortValue(bluetoothGattCharacteristic2.getUuid());
            ZLogger.v(this.f16011j, String.format("uuidShortValue=0x%4x", Integer.valueOf(shortValue2)));
            if (shortValue2 == 65504) {
                b(DfuException.ERROR_WRITE_CHARAC_ERROR);
                boolean a13 = a(bluetoothGattCharacteristic2, true);
                ZLogger.v(this.f16011j, "read image version :" + a13);
                break;
            }
        }
        l();
        if (this.f16011j) {
            ZLogger.d("readDeviceInfo complete: " + b().toString());
        }
        this.f16026y.clear();
        this.f16022u.clear();
        b(1);
    }
}
