package com.crrepa.s0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import com.crrepa.ble.util.BleLog;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13785a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f13786a = new d();

        private b() {
        }
    }

    private d() {
        this.f13785a = false;
    }

    @SuppressLint({"MissingPermission"})
    private boolean b() {
        BluetoothDevice remoteDevice = ((BluetoothManager) com.crrepa.g1.d.a().getSystemService("bluetooth")).getAdapter().getRemoteDevice(com.crrepa.g1.d.b());
        if (remoteDevice != null) {
            return a(remoteDevice, 4) || a(remoteDevice, 1);
        }
        BleLog.e("btBluetoothDevice is null");
        return false;
    }

    public c a(byte b8) {
        return (this.f13785a && b()) ? new e(b8) : new c(b8);
    }

    public void c() {
        com.crrepa.p.c.d().a(new com.crrepa.p.a(0, com.crrepa.f.a.h()));
    }

    public void d() {
        this.f13785a = false;
    }

    public static d a() {
        return b.f13786a;
    }

    public void a(boolean z7) {
        BleLog.d("supportSPP: " + z7);
        this.f13785a = z7;
    }

    private static boolean a(BluetoothDevice bluetoothDevice, int i8) {
        return BluetoothProfileManager.getInstance().getConnectionState(i8, bluetoothDevice) == 2;
    }
}
