package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class U implements InterfaceC4040v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f27899b;

    public U(X x3) {
        Objects.requireNonNull(x3);
        this.f27899b = x3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4040v0
    public final void a() {
        C3147eO c3147eO = this.f27899b.f30417p0;
        if (c3147eO != null) {
            c3147eO.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4040v0
    public final void d() {
        X x3 = this.f27899b;
        Surface surface = x3.f28546C1;
        if (surface != null) {
            C3932t0 c3932t0 = x3.n1;
            Handler handler = c3932t0.f34332a;
            if (handler != null) {
                handler.post(new RunnableC3878s0(c3932t0, surface, SystemClock.elapsedRealtime()));
            }
            x3.f28548F1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4040v0
    public final void i() {
        X x3 = this.f27899b;
        if (x3.f28546C1 != null) {
            x3.v0(0, 1);
        }
    }
}
