package com.crrepa.f0;

import com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.m1;
import com.crrepa.m.f;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private CRPJieliDfuPackageLengthCallback f12835a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f12836a = new a();

        private b() {
        }
    }

    private a() {
    }

    public static a a() {
        return b.f12836a;
    }

    public void b() {
        this.f12835a = null;
    }

    public void a(int i8) {
        BleLog.d("onPackageLength: " + i8);
        CRPJieliDfuPackageLengthCallback cRPJieliDfuPackageLengthCallback = this.f12835a;
        if (cRPJieliDfuPackageLengthCallback != null) {
            cRPJieliDfuPackageLengthCallback.onPackageLength(i8);
        }
    }

    public void b(CRPJieliDfuPackageLengthCallback cRPJieliDfuPackageLengthCallback) {
        this.f12835a = cRPJieliDfuPackageLengthCallback;
    }

    public void a(CRPJieliDfuPackageLengthCallback cRPJieliDfuPackageLengthCallback) {
        f.e().c(m1.a());
        this.f12835a = cRPJieliDfuPackageLengthCallback;
    }
}
