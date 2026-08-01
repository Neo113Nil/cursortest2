package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class GI implements InterfaceC0771Qi {
    public final /* synthetic */ C02203p A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public GI(C02203p c02203p, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c02203p;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0771Qi
    public final void AAu(InterfaceC0769Qg interfaceC0769Qg) {
        C02203p.A06(interfaceC0769Qg.A64(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0771Qi
    public final void ABI(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
