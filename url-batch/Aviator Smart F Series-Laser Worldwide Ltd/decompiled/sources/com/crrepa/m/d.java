package com.crrepa.m;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes3.dex */
public class d extends c {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static d f13341a = new d();

        private b() {
        }
    }

    private d() {
    }

    public static d c() {
        return b.f13341a;
    }

    public void a(int i8) {
        com.crrepa.q.b b8 = b();
        if (b8 != null) {
            BluetoothGattCharacteristic a8 = i8 != 32 ? null : b8.a();
            if (a8 != null) {
                if (g.a(com.crrepa.l.a.b().a(), a8)) {
                    return;
                }
                com.crrepa.n.b.a().a(false);
                c.a();
                return;
            }
        }
        com.crrepa.p.c.d().h();
    }

    public void a(BluetoothGattDescriptor bluetoothGattDescriptor) {
        com.crrepa.p.c.d().h();
        if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().toLowerCase().contains(a4.a.f41h)) {
            com.crrepa.n.b.a().a(true);
        }
    }
}
