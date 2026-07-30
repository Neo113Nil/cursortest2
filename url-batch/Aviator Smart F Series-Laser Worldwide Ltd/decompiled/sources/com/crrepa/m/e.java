package com.crrepa.m;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.crrepa.ble.conn.listener.CRPStepChangeListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.m2;
import h4.d0;

/* loaded from: classes3.dex */
public class e extends c {

    /* renamed from: a, reason: collision with root package name */
    private CRPStepChangeListener f13342a;

    private void a(byte b8) {
        com.crrepa.p.c.d().a(new com.crrepa.p.a(3, new byte[]{b8}));
    }

    @SuppressLint({"MissingPermission"})
    private void b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            com.crrepa.p.c.d().h();
            return;
        }
        BluetoothGatt a8 = com.crrepa.l.a.b().a();
        if (a8 != null) {
            boolean readCharacteristic = a8.readCharacteristic(bluetoothGattCharacteristic);
            BleLog.d("readCharacteristic: " + readCharacteristic);
            if (readCharacteristic) {
                return;
            }
            c.a();
        }
    }

    public void c() {
        a((byte) 18);
    }

    public void d() {
        a((byte) 19);
    }

    public void e() {
        a((byte) 17);
    }

    public void f() {
        a((byte) 20);
        com.crrepa.p.c.d().a(new com.crrepa.p.a(0, com.crrepa.f.a.e()));
    }

    public void g() {
        a((byte) 16);
    }

    private void b(byte[] bArr) {
        String str = new String(bArr);
        com.crrepa.g1.d.b(str);
        com.crrepa.e.e.a().a(str);
    }

    private void c(byte[] bArr) {
        com.crrepa.e.c.a().a(m2.a(bArr));
    }

    private void d(byte[] bArr) {
        com.crrepa.e.g.a().a(new String(bArr));
    }

    private void e(byte[] bArr) {
        if (this.f13342a != null) {
            this.f13342a.onStepChange(d0.b(bArr));
        }
    }

    public void a(int i8) {
        BluetoothGattCharacteristic j8;
        com.crrepa.q.b b8 = b();
        if (b8 != null) {
            switch (i8) {
                case 16:
                    j8 = b8.j();
                    break;
                case 17:
                    j8 = b8.b();
                    break;
                case 18:
                    j8 = b8.a();
                    break;
                case 19:
                    j8 = b8.c();
                    if (j8 == null) {
                        com.crrepa.e.c.a().a(2);
                        break;
                    }
                    break;
                case 20:
                    j8 = b8.i();
                    break;
            }
            b(j8);
            return;
        }
        com.crrepa.p.c.d().h();
    }

    public void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        com.crrepa.p.c.d().h();
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (com.crrepa.g1.c.h(value)) {
            return;
        }
        String uuid = bluetoothGattCharacteristic.getUuid().toString();
        if (uuid.contains(a4.a.f45i)) {
            b(value);
            return;
        }
        if (uuid.contains(a4.a.f41h)) {
            a(value);
            return;
        }
        if (uuid.contains(a4.a.f29e)) {
            e(value);
        } else if (uuid.contains(a4.a.f53k)) {
            c(value);
        } else if (uuid.contains(a4.a.f49j)) {
            d(value);
        }
    }

    public void a(CRPStepChangeListener cRPStepChangeListener) {
        this.f13342a = cRPStepChangeListener;
    }

    private void a(byte[] bArr) {
        com.crrepa.n.b.a().a(com.crrepa.g1.c.a(bArr[0]));
    }
}
