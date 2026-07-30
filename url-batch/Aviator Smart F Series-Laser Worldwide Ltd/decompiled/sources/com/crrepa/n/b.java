package com.crrepa.n;

import com.crrepa.ble.conn.listener.CRPDeviceBatteryListener;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private CRPDeviceBatteryListener f13366a;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f13367a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f13367a;
    }

    public void a(int i8) {
        BleLog.d("battery: " + i8);
        CRPDeviceBatteryListener cRPDeviceBatteryListener = this.f13366a;
        if (cRPDeviceBatteryListener != null) {
            cRPDeviceBatteryListener.onDeviceBattery(i8);
        }
    }

    public void a(CRPDeviceBatteryListener cRPDeviceBatteryListener) {
        this.f13366a = cRPDeviceBatteryListener;
    }

    public void a(boolean z7) {
        CRPDeviceBatteryListener cRPDeviceBatteryListener = this.f13366a;
        if (cRPDeviceBatteryListener != null) {
            cRPDeviceBatteryListener.onSubscribe(z7);
        }
    }
}
