package com.realsil.sdk.dfu.y;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.usb.GlobalUsbGatt;
import com.realsil.sdk.core.usb.UsbGatt;
import com.realsil.sdk.core.usb.UsbGattCallback;
import com.realsil.sdk.core.usb.UsbGattCharacteristic;
import com.realsil.sdk.dfu.m.o;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b implements o {

    /* renamed from: h, reason: collision with root package name */
    public int f16455h;

    /* renamed from: i, reason: collision with root package name */
    public UsbGatt f16456i;

    /* renamed from: j, reason: collision with root package name */
    public List f16457j;

    /* renamed from: k, reason: collision with root package name */
    public OtaDeviceInfo f16458k;

    /* renamed from: m, reason: collision with root package name */
    public String f16460m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0338b f16461n;

    /* renamed from: l, reason: collision with root package name */
    public List f16459l = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final UsbGattCallback f16462o = new a();

    /* renamed from: p, reason: collision with root package name */
    public int f16463p = 0;

    /* renamed from: q, reason: collision with root package name */
    public Object f16464q = new Object();

    public class a extends UsbGattCallback {
        public a() {
        }

        public void onCharacteristicChanged(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic) {
            b.this.a(usbGatt, usbGattCharacteristic);
        }

        public void onCharacteristicRead(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, int i8) {
            b.this.a(usbGatt, usbGattCharacteristic, i8);
        }

        public void onConnectionStateChange(UsbGatt usbGatt, int i8, int i9) {
            if (i8 == 0 && i9 == 0 && b.this.d()) {
                b.this.b(2);
            }
        }
    }

    /* renamed from: com.realsil.sdk.dfu.y.b$b, reason: collision with other inner class name */
    public interface InterfaceC0338b {
        void a(int i8);
    }

    public OtaModeInfo a(int i8) {
        List list = this.f16459l;
        if (list == null || list.size() <= 0) {
            return new OtaModeInfo(i8);
        }
        for (OtaModeInfo otaModeInfo : this.f16459l) {
            if (otaModeInfo != null && otaModeInfo.getWorkmode() == i8) {
                return otaModeInfo;
            }
        }
        return (OtaModeInfo) this.f16459l.get(0);
    }

    public OtaDeviceInfo b() {
        if (this.f16458k == null) {
            this.f16458k = new OtaDeviceInfo(this.f16455h, 2);
        }
        return this.f16458k;
    }

    public List c() {
        return this.f16459l;
    }

    public boolean d() {
        return (this.f16463p & 256) == 256;
    }

    public abstract void e();

    public void f() {
        ZLogger.v(false, "triggerSyncLock");
        synchronized (this.f16464q) {
            this.f16464q.notifyAll();
        }
    }

    public void g() {
        ZLogger.v(false, "waitSyncLock");
        synchronized (this.f16464q) {
            try {
                this.f16464q.wait(30000L);
            } catch (InterruptedException e8) {
                ZLogger.w("wait sync data interrupted: " + e8.toString());
            }
        }
    }

    public void a() {
        this.f16463p = 0;
        GlobalUsbGatt.getInstance().unRegisterCallback(this.f16460m, this.f16462o);
    }

    public void b(int i8) {
        ZLogger.d(String.format("syncState: 0x%04X >> 0x%04X", Integer.valueOf(this.f16463p), Integer.valueOf(i8)));
        this.f16463p = i8;
        InterfaceC0338b interfaceC0338b = this.f16461n;
        if (interfaceC0338b != null) {
            interfaceC0338b.a(i8);
        } else {
            ZLogger.v(false, "no callback registered");
        }
    }

    public void a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic) {
    }

    public void a(UsbGatt usbGatt, UsbGattCharacteristic usbGattCharacteristic, int i8) {
    }

    public void a(String str, UsbGatt usbGatt, InterfaceC0338b interfaceC0338b) {
        this.f16460m = str;
        this.f16456i = usbGatt;
        this.f16461n = interfaceC0338b;
        this.f16459l = new ArrayList();
        this.f16457j = new ArrayList();
        GlobalUsbGatt.getInstance().registerCallback(this.f16460m, this.f16462o);
    }

    public boolean a(UsbGattCharacteristic usbGattCharacteristic) {
        UsbGatt usbGatt = this.f16456i;
        if (usbGatt != null) {
            return usbGatt.readCharacteristic(usbGattCharacteristic);
        }
        ZLogger.w("mUsbGatt is null maybe disconnected just now");
        return false;
    }
}
