package com.google.android.gms.internal.ads;

import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.mw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3604mw implements InterfaceC3336hw {

    /* renamed from: d, reason: collision with root package name */
    public static C3604mw f32777d;

    /* renamed from: a, reason: collision with root package name */
    public float f32778a;

    /* renamed from: b, reason: collision with root package name */
    public C3118dw f32779b;

    /* renamed from: c, reason: collision with root package name */
    public C3282gw f32780c;

    public static C3604mw a() {
        if (f32777d == null) {
            C3604mw c3604mw = new C3604mw();
            c3604mw.f32778a = 0.0f;
            f32777d = c3604mw;
        }
        return f32777d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3336hw
    public final void b(boolean z8) {
        if (z8) {
            C4197xw.f35273g.getClass();
            C4197xw.b();
            return;
        }
        C4197xw.f35273g.getClass();
        Handler handler = C4197xw.i;
        if (handler != null) {
            handler.removeCallbacks(C4197xw.f35276k);
            C4197xw.i = null;
        }
    }
}
