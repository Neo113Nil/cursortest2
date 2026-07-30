package com.crrepa.q;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import com.crrepa.ble.ota.goodix.BleRestoreDeviceServices;
import com.crrepa.ble.ota.goodix.BleRestoreGattProxy;
import com.crrepa.ble.ota.goodix.RestoreDeviceChangeListener;
import com.crrepa.ble.ota.goodix.RestoreFirmwareController;
import com.crrepa.ble.util.BleLog;
import com.crrepa.d0.f;
import com.crrepa.d0.g;
import com.crrepa.g1.d;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private com.crrepa.q.b f13628a;

    /* renamed from: b, reason: collision with root package name */
    private f f13629b;

    /* renamed from: c, reason: collision with root package name */
    private BleRestoreDeviceServices f13630c;

    class a implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ BluetoothGatt f13631h;

        a(BluetoothGatt bluetoothGatt) {
            this.f13631h = bluetoothGatt;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            BluetoothGatt bluetoothGatt = this.f13631h;
            boolean discoverServices = bluetoothGatt != null ? bluetoothGatt.discoverServices() : false;
            BleLog.d("discoverServices: " + discoverServices);
            if (discoverServices) {
                return;
            }
            com.crrepa.m.c.a();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13633a = new c();

        private b() {
        }
    }

    public static c c() {
        return b.f13633a;
    }

    public com.crrepa.q.b a() {
        return this.f13628a;
    }

    public f b() {
        return this.f13629b;
    }

    public BleRestoreDeviceServices d() {
        return this.f13630c;
    }

    public void a(BluetoothGatt bluetoothGatt) {
        d4.a.a(new a(bluetoothGatt), 500L);
    }

    public boolean b(List<BluetoothGattService> list) {
        boolean z7;
        if (list != null) {
            BleRestoreDeviceServices bleRestoreDeviceServices = new BleRestoreDeviceServices(list);
            this.f13630c = bleRestoreDeviceServices;
            z7 = bleRestoreDeviceServices.isOrderly();
        } else {
            z7 = false;
        }
        if (!z7) {
            BleRestoreGattProxy.disconnect();
        }
        return z7;
    }

    public boolean c(List<BluetoothGattService> list) {
        boolean z7;
        RestoreDeviceChangeListener restoreDeviceChangeListener;
        if (list != null) {
            com.crrepa.q.b bVar = new com.crrepa.q.b(list);
            this.f13628a = bVar;
            z7 = bVar.p();
        } else {
            z7 = false;
        }
        if (!z7 && new BleRestoreDeviceServices(list).isOrderly() && (restoreDeviceChangeListener = RestoreFirmwareController.getInstance().getRestoreDeviceChangeListener()) != null) {
            restoreDeviceChangeListener.onRestoreDevice(d.b());
        }
        if (!z7) {
            com.crrepa.m.c.a();
        }
        return z7;
    }

    public boolean a(List<BluetoothGattService> list) {
        boolean z7;
        if (list != null) {
            f fVar = new f(list);
            this.f13629b = fVar;
            z7 = fVar.h();
        } else {
            z7 = false;
        }
        if (!z7) {
            g.a();
        }
        return z7;
    }
}
