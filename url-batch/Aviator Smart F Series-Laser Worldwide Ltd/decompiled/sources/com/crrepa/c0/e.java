package com.crrepa.c0;

import com.crrepa.ble.util.BleLog;
import com.crrepa.f.g;
import com.crrepa.m.f;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private com.crrepa.c0.a f12331a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final e f12332a = new e();

        private b() {
        }
    }

    private e() {
    }

    public static e a() {
        return b.f12332a;
    }

    private static byte[] b() {
        return g.a(-73, new byte[]{10, 8});
    }

    public void c() {
        this.f12331a = null;
    }

    public void a(int i8) {
        BleLog.d("onAvailableSize: " + i8);
        com.crrepa.c0.a aVar = this.f12331a;
        if (aVar != null) {
            aVar.onAvailableSize(i8);
            c();
        }
    }

    public void a(com.crrepa.c0.a aVar) {
        f.e().c(b());
        this.f12331a = aVar;
    }
}
