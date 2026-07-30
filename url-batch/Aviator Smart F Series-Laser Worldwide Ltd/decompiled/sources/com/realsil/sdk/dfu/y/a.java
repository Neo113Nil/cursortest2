package com.realsil.sdk.dfu.y;

import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.usb.UsbGatt;
import com.realsil.sdk.core.usb.UsbGattCharacteristic;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.m.j;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.r.g;
import com.realsil.sdk.dfu.r.h;
import com.realsil.sdk.dfu.y.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public class a extends com.realsil.sdk.dfu.y.b {

    /* renamed from: r, reason: collision with root package name */
    public UsbGattCharacteristic f16448r;

    /* renamed from: s, reason: collision with root package name */
    public UsbGattCharacteristic f16449s;

    /* renamed from: t, reason: collision with root package name */
    public UsbGattCharacteristic f16450t;

    /* renamed from: u, reason: collision with root package name */
    public UsbGattCharacteristic f16451u;

    /* renamed from: v, reason: collision with root package name */
    public UsbGattCharacteristic f16452v;

    /* renamed from: w, reason: collision with root package name */
    public b f16453w;

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            setName("AdapterXU0000-DeviceInfoThread");
            a.this.b(257);
            if (a.this.f16449s != null) {
                a aVar = a.this;
                if (aVar.f16457j.contains(aVar.f16449s)) {
                    a.this.b(260);
                    a aVar2 = a.this;
                    boolean a8 = aVar2.a(aVar2.f16449s);
                    a aVar3 = a.this;
                    aVar3.f16457j.remove(aVar3.f16449s);
                    ZLogger.v("read device info :" + a8);
                    if (a8) {
                        a.this.g();
                    }
                }
            }
            if (a.this.f16448r != null) {
                a aVar4 = a.this;
                if (aVar4.f16457j.contains(aVar4.f16448r)) {
                    a.this.b(261);
                    a aVar5 = a.this;
                    boolean a9 = aVar5.a(aVar5.f16448r);
                    a aVar6 = a.this;
                    aVar6.f16457j.remove(aVar6.f16448r);
                    ZLogger.v("read device mac :" + a9);
                    if (a9) {
                        a.this.g();
                    }
                }
            }
            if (a.this.f16450t != null) {
                a aVar7 = a.this;
                if (aVar7.f16457j.contains(aVar7.f16450t)) {
                    if (a.this.b().specVersion == 0) {
                        a.this.b(DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS);
                        a aVar8 = a.this;
                        boolean a10 = aVar8.a(aVar8.f16450t);
                        a aVar9 = a.this;
                        aVar9.f16457j.remove(aVar9.f16450t);
                        ZLogger.v("read app version :" + a10);
                        if (a10) {
                            a.this.g();
                        }
                    } else {
                        a aVar10 = a.this;
                        aVar10.f16457j.remove(aVar10.f16450t);
                    }
                }
            }
            if (a.this.f16451u != null) {
                a aVar11 = a.this;
                if (aVar11.f16457j.contains(aVar11.f16451u)) {
                    if (a.this.b().specVersion == 0) {
                        a.this.b(DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS);
                        a aVar12 = a.this;
                        boolean a11 = aVar12.a(aVar12.f16451u);
                        a aVar13 = a.this;
                        aVar13.f16457j.remove(aVar13.f16451u);
                        ZLogger.v("attempt to read patch version :" + a11);
                        if (a11) {
                            a.this.g();
                        }
                    } else {
                        a aVar14 = a.this;
                        aVar14.f16457j.remove(aVar14.f16451u);
                    }
                }
            }
            if (a.this.f16452v != null) {
                a aVar15 = a.this;
                if (aVar15.f16457j.contains(aVar15.f16452v)) {
                    if (a.this.b().specVersion == 0) {
                        a.this.b(DfuException.ERROR_CONNECT_ERROR);
                        a aVar16 = a.this;
                        boolean a12 = aVar16.a(aVar16.f16452v);
                        a aVar17 = a.this;
                        aVar17.f16457j.remove(aVar17.f16452v);
                        ZLogger.v("attempt to read patch extension version :" + a12);
                        if (a12) {
                            a.this.g();
                        }
                    } else {
                        a aVar18 = a.this;
                        aVar18.f16457j.remove(aVar18.f16452v);
                    }
                }
            }
            for (UsbGattCharacteristic usbGattCharacteristic : a.this.f16457j) {
                int shortValue = BluetoothUuidCompat.toShortValue(usbGattCharacteristic.getUuid());
                ZLogger.v(false, String.format("uuidShortValue=0x%4x", Integer.valueOf(shortValue)));
                if (shortValue >= 65504 && shortValue <= 65519 && a.this.b().specVersion != 0) {
                    a.this.b(DfuException.ERROR_WRITE_CHARAC_ERROR);
                    ZLogger.d("read image version :" + a.this.a(usbGattCharacteristic));
                    a.this.g();
                }
            }
            ZLogger.v(false, "no more characteristic to read");
            ZLogger.d(a.this.b().toString());
            a.this.f16457j.clear();
            a.this.b(1);
        }
    }

    public a(int i8) {
        this.f16455h = i8;
    }

    public final void h() {
        UsbGatt usbGatt = this.f16456i;
        if (usbGatt == null) {
            return;
        }
        UUID uuid = h.f16278b;
        UsbGattCharacteristic characteristic = usbGatt.getCharacteristic(uuid);
        this.f16448r = characteristic;
        if (characteristic == null) {
            ZLogger.w("OTA_DEVICE_MAC_CHARACTERISTIC_UUID not found");
        } else {
            ZLogger.d(true, "find OTA_DEVICE_MAC_CHARACTERISTIC_UUID = " + uuid);
            this.f16457j.add(this.f16448r);
        }
        UsbGatt usbGatt2 = this.f16456i;
        UUID uuid2 = h.f16279c;
        UsbGattCharacteristic characteristic2 = usbGatt2.getCharacteristic(uuid2);
        this.f16451u = characteristic2;
        if (characteristic2 == null) {
            ZLogger.d("OTA_READ_PATCH_CHARACTERISTIC_UUID not found");
        } else {
            ZLogger.v(false, "find OTA_READ_PATCH_CHARACTERISTIC_UUID = " + uuid2);
            this.f16457j.add(this.f16451u);
        }
        UsbGatt usbGatt3 = this.f16456i;
        UUID uuid3 = h.f16280d;
        UsbGattCharacteristic characteristic3 = usbGatt3.getCharacteristic(uuid3);
        this.f16450t = characteristic3;
        if (characteristic3 == null) {
            ZLogger.d("OTA_APP_VERSION_CHARACTERISTIC_UUID not found");
        } else {
            ZLogger.v(false, "find OTA_APP_VERSION_CHARACTERISTIC_UUID = " + uuid3);
            this.f16457j.add(this.f16450t);
        }
        UsbGatt usbGatt4 = this.f16456i;
        UUID uuid4 = h.f16281e;
        UsbGattCharacteristic characteristic4 = usbGatt4.getCharacteristic(uuid4);
        this.f16452v = characteristic4;
        if (characteristic4 == null) {
            ZLogger.d("OTA_READ_PATCH_EXTENSION_CHARACTERISTIC_UUID not found");
        } else {
            ZLogger.v(false, "find OTA_READ_PATCH_EXTENSION_CHARACTERISTIC_UUID = " + uuid4);
            this.f16457j.add(this.f16452v);
        }
        UsbGatt usbGatt5 = this.f16456i;
        UUID uuid5 = h.f16283g;
        UsbGattCharacteristic characteristic5 = usbGatt5.getCharacteristic(uuid5);
        this.f16449s = characteristic5;
        if (characteristic5 == null) {
            ZLogger.d("OTA_DEVICE_INFO_CHARACTERISTIC_UUID not found");
        } else {
            ZLogger.v(false, "find OTA_DEVICE_INFO_CHARACTERISTIC_UUID = " + uuid5);
            this.f16457j.add(this.f16449s);
        }
        for (int i8 = 65504; i8 <= 65519; i8++) {
            UUID fromShortValue = BluetoothUuidCompat.fromShortValue(i8);
            UsbGattCharacteristic characteristic6 = this.f16456i.getCharacteristic(fromShortValue);
            if (characteristic6 == null) {
                ZLogger.d(true, "not found image version characteristic:" + fromShortValue.toString());
                return;
            }
            ZLogger.d(true, "find image version characteristic: " + fromShortValue.toString());
            this.f16457j.add(characteristic6);
        }
    }

    @Override // com.realsil.sdk.dfu.y.b
    public void a() {
        super.a();
        b bVar = this.f16453w;
        if (bVar != null) {
            bVar.interrupt();
            this.f16453w = null;
        }
    }

    @Override // com.realsil.sdk.dfu.y.b
    public void e() {
        b bVar = new b();
        this.f16453w = bVar;
        bVar.start();
    }

    @Override // com.realsil.sdk.dfu.y.b
    public void a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic) {
        super.a(usbGatt, usbGattCharacteristic);
        usbGattCharacteristic.getUuid();
        byte[] value = usbGattCharacteristic.getValue();
        if (g.f16275c.equals(usbGattCharacteristic.getUuid())) {
            j a8 = j.a(value);
            if (a8 == null) {
                ZLogger.w("notification data invalid");
                return;
            }
            if (a8.b() && a8.f16062b == 13) {
                if (a8.f16064d[0] == 1) {
                    b().parseX0000(value, 3);
                } else {
                    ZLogger.w("Get temp dev info failed");
                }
                f();
            }
        }
    }

    @Override // com.realsil.sdk.dfu.y.b
    public void a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, int i8) {
        OtaDeviceInfo b8;
        int i9;
        OtaDeviceInfo b9;
        int i10;
        OtaDeviceInfo b10;
        int i11;
        super.a(usbGatt, usbGattCharacteristic, i8);
        UUID uuid = usbGattCharacteristic.getUuid();
        usbGattCharacteristic.getValue();
        if (i8 != 0) {
            ZLogger.w(true, "Characteristic read error: " + i8);
            if (h.f16283g.equals(uuid)) {
                b(2);
                return;
            } else {
                ZLogger.d("ignore exception when read other info");
                return;
            }
        }
        byte[] value = usbGattCharacteristic.getValue();
        int length = value != null ? value.length : 0;
        if (com.realsil.sdk.dfu.m.b.f16031b.equals(uuid)) {
            if (value.length > 0) {
                int i12 = value[0] & 255;
                ZLogger.v("current battery: " + i12);
                b().setBatteryLevel(i12);
            }
            f();
            return;
        }
        if (com.realsil.sdk.dfu.m.g.f16054e.equals(uuid)) {
            ZLogger.v("PNP_ID: " + DataConverter.bytes2Hex(value));
            b().setPnpId(value);
            f();
            return;
        }
        if (h.f16283g.equals(uuid)) {
            b().parseX0000(value);
            f();
            return;
        }
        if (h.f16278b.equals(uuid)) {
            b().parseDeviceMac(value);
            f();
            return;
        }
        if (h.f16279c.equals(uuid)) {
            if (length > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(value);
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
            f();
            return;
        }
        if (h.f16280d.equals(uuid)) {
            if (length > 0) {
                ByteBuffer wrap2 = ByteBuffer.wrap(value);
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
            f();
            return;
        }
        if (!h.f16281e.equals(uuid)) {
            int shortValue = BluetoothUuidCompat.toShortValue(uuid);
            if (shortValue >= 65504 && shortValue <= 65519) {
                b().appendActiveImageVersionBytes(value);
            }
            f();
            return;
        }
        ByteBuffer wrap3 = ByteBuffer.wrap(value);
        wrap3.order(ByteOrder.LITTLE_ENDIAN);
        if (length != 1) {
            if (length == 2) {
                b8 = b();
                i9 = wrap3.getShort(0) & u.MAX_VALUE;
            }
            f();
        }
        b8 = b();
        i9 = wrap3.get(0);
        b8.setPatchExtensionVersion(i9);
        f();
    }

    @Override // com.realsil.sdk.dfu.y.b
    public void a(String str, UsbGatt usbGatt, b.InterfaceC0338b interfaceC0338b) {
        super.a(str, usbGatt, interfaceC0338b);
        h();
        this.f16459l.add(new OtaModeInfo(16));
    }
}
