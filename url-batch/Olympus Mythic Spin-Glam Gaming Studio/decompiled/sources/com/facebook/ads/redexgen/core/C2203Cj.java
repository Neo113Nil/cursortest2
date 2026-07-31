package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2203Cj implements InterfaceC3205gV {
    @Override // com.facebook.ads.redexgen.core.InterfaceC3205gV
    public final long A5m() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3205gV
    public final void AK4(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
