package com.crrepa.e;

import com.crrepa.ble.conn.callback.CRPDeviceDfuStatusCallback;
import com.crrepa.ble.conn.callback.CRPDeviceDfuTypeCallback;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private CRPDeviceDfuStatusCallback f12407a;

    /* renamed from: b, reason: collision with root package name */
    private CRPDeviceDfuTypeCallback f12408b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12409c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12410d;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f12411a = new c();

        private b() {
        }
    }

    private c() {
        this.f12409c = false;
        this.f12410d = false;
    }

    public static c a() {
        return b.f12411a;
    }

    public void b(int i8) {
        CRPDeviceDfuTypeCallback cRPDeviceDfuTypeCallback = this.f12408b;
        if (cRPDeviceDfuTypeCallback == null || this.f12410d) {
            return;
        }
        this.f12410d = true;
        cRPDeviceDfuTypeCallback.onDfuType(i8);
    }

    public void a(int i8) {
        if (this.f12407a == null || this.f12409c) {
            return;
        }
        this.f12409c = true;
        BleLog.d("onDeviceDfuStatus state: " + i8);
        this.f12407a.onDeviceDfuStatus(i8);
    }

    public void a(CRPDeviceDfuStatusCallback cRPDeviceDfuStatusCallback) {
        this.f12407a = cRPDeviceDfuStatusCallback;
        this.f12409c = false;
    }

    public void a(CRPDeviceDfuTypeCallback cRPDeviceDfuTypeCallback) {
        this.f12408b = cRPDeviceDfuTypeCallback;
        this.f12410d = false;
    }
}
