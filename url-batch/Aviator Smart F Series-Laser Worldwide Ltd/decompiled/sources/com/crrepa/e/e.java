package com.crrepa.e;

import com.crrepa.ble.conn.callback.CRPDeviceFirmwareVersionCallback;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private CRPDeviceFirmwareVersionCallback f12414a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12415b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final e f12416a = new e();

        private b() {
        }
    }

    private e() {
        this.f12415b = false;
    }

    public static e a() {
        return b.f12416a;
    }

    public void a(CRPDeviceFirmwareVersionCallback cRPDeviceFirmwareVersionCallback) {
        this.f12414a = cRPDeviceFirmwareVersionCallback;
        this.f12415b = false;
    }

    public void a(String str) {
        if (this.f12414a == null || this.f12415b) {
            return;
        }
        this.f12415b = true;
        BleLog.d("onDeviceFirmwareVersion: " + str);
        this.f12414a.onDeviceFirmwareVersion(str);
    }
}
