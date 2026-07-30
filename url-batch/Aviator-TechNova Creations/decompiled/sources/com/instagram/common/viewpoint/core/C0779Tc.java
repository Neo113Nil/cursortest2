package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0779Tc implements InterfaceC0812Uk {
    public WeakReference<C0702Qc> A00;

    public C0779Tc(C0702Qc c0702Qc) {
        this.A00 = new WeakReference<>(c0702Qc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0812Uk
    public final void AEW(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z, false);
        }
    }
}
