package com.instagram.common.viewpoint.core;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.ii, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1474ii extends AbstractRunnableC0846Vt {
    public final /* synthetic */ MW A00;

    public C1474ii(MW mw) {
        this.A00 = mw;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        MV mv;
        CountDownLatch countDownLatch;
        this.A00.A07();
        mv = this.A00.A02;
        mv.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
