package com.crrepa.e;

import com.crrepa.ble.util.BleLog;
import h4.n;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private com.crrepa.e.b f12418a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12419b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final g f12420a = new g();

        private b() {
        }
    }

    private g() {
        this.f12419b = false;
    }

    public static g a() {
        return b.f12420a;
    }

    public void a(com.crrepa.e.b bVar) {
        this.f12418a = bVar;
        this.f12419b = false;
    }

    public void a(String str) {
        if (this.f12418a == null || this.f12419b) {
            return;
        }
        this.f12419b = true;
        BleLog.d("onProtocolVersion: " + str);
        this.f12418a.a(n.a(str));
    }
}
