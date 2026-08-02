package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class C6 implements InterfaceC1267fD {
    @Override // com.instagram.common.viewpoint.core.InterfaceC1267fD
    public final long A5e() {
        return System.nanoTime();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1267fD
    public final void AJK(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
