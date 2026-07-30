package com.crrepa.g0;

import com.crrepa.ble.conn.callback.CRPDeviceUIVersionCodeCallback;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private CRPDeviceUIVersionCodeCallback f12910a;

    /* renamed from: com.crrepa.g0.b$b, reason: collision with other inner class name */
    private static class C0219b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f12911a = new b();

        private C0219b() {
        }
    }

    private b() {
    }

    public static b b() {
        return C0219b.f12911a;
    }

    public void a() {
        this.f12910a = null;
    }

    public void a(CRPDeviceUIVersionCodeCallback cRPDeviceUIVersionCodeCallback) {
        this.f12910a = cRPDeviceUIVersionCodeCallback;
    }

    public void a(String str) {
        CRPDeviceUIVersionCodeCallback cRPDeviceUIVersionCodeCallback = this.f12910a;
        if (cRPDeviceUIVersionCodeCallback != null) {
            cRPDeviceUIVersionCodeCallback.onUIVersionCode(str);
        }
    }
}
