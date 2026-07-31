package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: com.unity3d.player.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0014f0 {
    private Context a;
    private C0012e0 b;

    public C0014f0(Context context) {
        this.a = context;
    }

    public final void a() {
        if (this.b != null) {
            this.a.getContentResolver().unregisterContentObserver(this.b);
            this.b = null;
        }
    }

    public final void a(InterfaceC0010d0 interfaceC0010d0) {
        this.b = new C0012e0(new Handler(Looper.getMainLooper()), interfaceC0010d0);
        this.a.getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, this.b);
    }
}
