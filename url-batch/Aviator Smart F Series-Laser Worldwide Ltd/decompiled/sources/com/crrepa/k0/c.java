package com.crrepa.k0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.d;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothAdapter f13138a;

    /* renamed from: b, reason: collision with root package name */
    private com.crrepa.k0.a f13139b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13140a = new c();

        private b() {
        }
    }

    private c() {
        this.f13138a = ((BluetoothManager) d.a().getSystemService("bluetooth")).getAdapter();
    }

    public static c c() {
        return b.f13140a;
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void a(String str, boolean z7, com.crrepa.k0.b bVar) {
        try {
            BleLog.d("spp connect: " + str + " isHisilicon: " + z7);
            if (!a()) {
                BleLog.d("spp connecting");
                com.crrepa.k0.a aVar = this.f13139b;
                if (aVar != null) {
                    aVar.a(bVar);
                }
                bVar.onConnectionStateChanged(2);
                return;
            }
            BluetoothDevice remoteDevice = this.f13138a.getRemoteDevice(str);
            if (remoteDevice == null) {
                BleLog.d("address not found: " + str);
                return;
            }
            BleLog.d("bt bondState: " + remoteDevice.getBondState());
            com.crrepa.k0.a aVar2 = new com.crrepa.k0.a(remoteDevice);
            this.f13139b = aVar2;
            aVar2.a(bVar);
            this.f13139b.a(z7);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        if (this.f13139b != null) {
            BleLog.d("spp disconnect");
            this.f13139b.a();
            this.f13139b = null;
        }
    }

    public boolean d() {
        com.crrepa.k0.a aVar = this.f13139b;
        if (aVar != null) {
            return aVar.b();
        }
        return false;
    }

    private boolean a() {
        com.crrepa.k0.a aVar = this.f13139b;
        if (aVar != null) {
            return (aVar.b() || this.f13139b.c()) ? false : true;
        }
        return true;
    }

    public synchronized boolean a(byte[] bArr) {
        com.crrepa.k0.a aVar = this.f13139b;
        if (aVar == null) {
            return false;
        }
        return aVar.b(bArr);
    }
}
