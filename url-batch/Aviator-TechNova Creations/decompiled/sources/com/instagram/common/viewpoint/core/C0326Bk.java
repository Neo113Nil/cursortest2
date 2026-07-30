package com.instagram.common.viewpoint.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0326Bk implements InterfaceC1239ee {
    public final /* synthetic */ C00891r A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C0326Bk(C00891r c00891r, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c00891r;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1239ee
    public final void ACo(InterfaceC1237ec interfaceC1237ec) {
        C00891r.A06(interfaceC1237ec.A6v(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1239ee
    public final void ADC(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
