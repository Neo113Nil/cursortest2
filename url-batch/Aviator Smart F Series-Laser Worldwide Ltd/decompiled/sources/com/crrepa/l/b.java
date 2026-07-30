package com.crrepa.l;

import androidx.annotation.NonNull;
import com.crrepa.ble.trans.upgrade.bean.FirmwareVersionInfo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<FirmwareVersionInfo> f13148a;

    /* renamed from: com.crrepa.l.b$b, reason: collision with other inner class name */
    private static class C0223b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f13149a = new b();

        private C0223b() {
        }
    }

    private b() {
        this.f13148a = new AtomicReference<>();
    }

    public static b b() {
        return C0223b.f13149a;
    }

    public FirmwareVersionInfo a() {
        return this.f13148a.get();
    }

    public void a(@NonNull FirmwareVersionInfo firmwareVersionInfo) {
        h0.a.a(firmwareVersionInfo);
        this.f13148a.set(firmwareVersionInfo);
    }
}
