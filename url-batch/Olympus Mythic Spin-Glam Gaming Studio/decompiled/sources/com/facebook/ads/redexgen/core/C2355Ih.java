package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2355Ih implements InterfaceC2874b8 {
    public final /* synthetic */ C20375h A00;

    public C2355Ih(C20375h c20375h) {
        this.A00 = c20375h;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2874b8
    public final void AE7(C2873b7 c2873b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c2873b7.A00() != null);
        this.A00.A07();
    }
}
