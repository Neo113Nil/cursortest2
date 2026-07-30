package com.crrepa.m;

import android.bluetooth.BluetoothGatt;
import com.crrepa.ble.util.BleLog;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class b {

    class a implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ BluetoothGatt f13339h;

        a(BluetoothGatt bluetoothGatt) {
            this.f13339h = bluetoothGatt;
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothGatt bluetoothGatt = this.f13339h;
            if (bluetoothGatt != null) {
                bluetoothGatt.disconnect();
            }
        }
    }

    /* renamed from: com.crrepa.m.b$b, reason: collision with other inner class name */
    class RunnableC0227b implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ BluetoothGatt f13340h;

        RunnableC0227b(BluetoothGatt bluetoothGatt) {
            this.f13340h = bluetoothGatt;
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothGatt bluetoothGatt = this.f13340h;
            if (bluetoothGatt != null) {
                b.d(bluetoothGatt);
                this.f13340h.close();
            }
        }
    }

    private b() {
    }

    public static synchronized void b(BluetoothGatt bluetoothGatt) {
        synchronized (b.class) {
            d4.a.a(new RunnableC0227b(bluetoothGatt), 0L);
        }
    }

    public static synchronized void c(BluetoothGatt bluetoothGatt) {
        synchronized (b.class) {
            d4.a.a(new a(bluetoothGatt), 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(BluetoothGatt bluetoothGatt) {
        try {
            Method method = BluetoothGatt.class.getMethod("refresh", new Class[0]);
            if (method == null || bluetoothGatt == null) {
                return;
            }
            BleLog.i("refreshDeviceCache, is success:  " + ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue());
        } catch (Exception e8) {
            BleLog.i("exception occur while refreshing device: " + e8.getMessage());
            e8.printStackTrace();
        }
    }
}
