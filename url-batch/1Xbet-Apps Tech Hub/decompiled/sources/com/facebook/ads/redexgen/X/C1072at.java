package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1072at extends K8 {
    public final /* synthetic */ C01500v A00;

    public C1072at(C01500v c01500v) {
        this.A00 = c01500v;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        C01490u c01490u;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c01490u = this.A00.A02;
        c01490u.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
