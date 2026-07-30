package com.crrepa.h;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.crrepa.ble.conn.callback.CRPMtuChangeCallback;
import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.conn.listener.CRPDeviceRssiListener;
import com.crrepa.ble.hisilicon.ridecode.tcp.NetworkReceiver;
import com.crrepa.ble.util.BleLog;
import com.crrepa.e.f;
import com.crrepa.m.e;
import com.crrepa.m.g;

/* loaded from: classes3.dex */
public class d extends BluetoothGattCallback {

    /* renamed from: d, reason: collision with root package name */
    private CRPBleConnectionStateListener f12949d;

    /* renamed from: e, reason: collision with root package name */
    private CRPDeviceRssiListener f12950e;

    /* renamed from: f, reason: collision with root package name */
    private CRPMtuChangeCallback f12951f;

    /* renamed from: a, reason: collision with root package name */
    private g f12946a = new g();

    /* renamed from: b, reason: collision with root package name */
    private e f12947b = new e();

    /* renamed from: c, reason: collision with root package name */
    private com.crrepa.m.a f12948c = new com.crrepa.m.a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f12952g = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f12947b.f();
        }
    }

    private void c() {
        BleLog.d("readProtocolVersion");
        this.f12952g = true;
        com.crrepa.e.g.a().a(new f(this.f12949d));
        d4.a.a(new a(), 300L);
    }

    private void d() {
        com.crrepa.p.c.d().i();
        com.crrepa.p.c.d().a();
    }

    public com.crrepa.m.a a() {
        return this.f12948c;
    }

    public e b() {
        return this.f12947b;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        this.f12948c.a(bluetoothGattCharacteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i8);
        BleLog.i("onCharacteristicRead: " + bluetoothGattCharacteristic.getUuid().toString());
        BleLog.i("onCharacteristicRead: " + com.crrepa.g1.c.c(bluetoothGattCharacteristic.getValue()));
        this.f12947b.a(bluetoothGattCharacteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
        BleLog.i("onCharacteristicWrite: " + bluetoothGattCharacteristic.getUuid().toString());
        try {
            Thread.sleep(20L);
        } catch (InterruptedException e8) {
            e8.printStackTrace();
        }
        BleLog.i("onCharacteristicWrite: " + com.crrepa.g1.c.c(bluetoothGattCharacteristic.getValue()));
        com.crrepa.m.f.e().h(bluetoothGattCharacteristic.getValue());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
        super.onConnectionStateChange(bluetoothGatt, i8, i9);
        BleLog.i("BleGattCallback：onConnectionStateChange \nstatus: " + i8 + "\nnewState: " + i9);
        if (i9 == 2) {
            com.crrepa.q.c.c().a(bluetoothGatt);
            d();
            com.crrepa.s0.d.a().d();
        } else if (i9 == 0) {
            a(i9);
            com.crrepa.g1.g.a().b();
            NetworkReceiver.b();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i8);
        BleLog.i("onDescriptorWrite: " + bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
        BleLog.i("onDescriptorWrite: " + com.crrepa.g1.c.c(bluetoothGattDescriptor.getValue()));
        BleLog.i("onDescriptorWrite: " + this.f12946a.c());
        if (this.f12946a.c()) {
            com.crrepa.m.d.c().a(bluetoothGattDescriptor);
            return;
        }
        this.f12946a.a(bluetoothGattDescriptor.getCharacteristic());
        if (this.f12946a.a(bluetoothGatt)) {
            this.f12946a.a(true);
            c();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
        super.onMtuChanged(bluetoothGatt, i8, i9);
        BleLog.i("onMtuChanged: " + i8);
        com.crrepa.p.c.d().h();
        com.crrepa.l.a.b().a(i8);
        CRPMtuChangeCallback cRPMtuChangeCallback = this.f12951f;
        if (cRPMtuChangeCallback != null) {
            cRPMtuChangeCallback.onMtuChange(i8);
            a((CRPMtuChangeCallback) null);
        } else if (this.f12952g) {
            BleLog.i("STATE_CONNECTED");
            this.f12952g = false;
            com.crrepa.s0.d.a().c();
            com.crrepa.e.d.b().c();
            a(2);
            NetworkReceiver.a();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i8, int i9) {
        super.onReadRemoteRssi(bluetoothGatt, i8, i9);
        CRPDeviceRssiListener cRPDeviceRssiListener = this.f12950e;
        if (cRPDeviceRssiListener != null) {
            cRPDeviceRssiListener.onDeviceRssi(i8);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
        super.onServicesDiscovered(bluetoothGatt, i8);
        com.crrepa.q.c c8 = com.crrepa.q.c.c();
        if (c8.c(bluetoothGatt.getServices())) {
            this.f12946a.a(c8.a().h());
            this.f12946a.a(bluetoothGatt);
        }
    }

    private void a(int i8) {
        CRPBleConnectionStateListener cRPBleConnectionStateListener = this.f12949d;
        if (cRPBleConnectionStateListener != null) {
            cRPBleConnectionStateListener.onConnectionStateChange(i8);
        }
    }

    public void a(CRPMtuChangeCallback cRPMtuChangeCallback) {
        this.f12951f = cRPMtuChangeCallback;
    }

    public void a(CRPBleConnectionStateListener cRPBleConnectionStateListener) {
        this.f12949d = cRPBleConnectionStateListener;
        a(1);
    }

    public void a(CRPDeviceRssiListener cRPDeviceRssiListener) {
        this.f12950e = cRPDeviceRssiListener;
    }
}
