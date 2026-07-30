package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0976Ih implements InterfaceC1495b8 {
    public final /* synthetic */ C06585h A00;

    public C0976Ih(C06585h c06585h) {
        this.A00 = c06585h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1495b8
    public final void AE7(C1494b7 c1494b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c1494b7.A00() != null);
        this.A00.A07();
    }
}
