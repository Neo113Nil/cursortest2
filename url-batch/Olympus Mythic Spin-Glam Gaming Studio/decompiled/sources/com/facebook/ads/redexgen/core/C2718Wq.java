package com.facebook.ads.redexgen.core;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.redexgen.X.Wq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2718Wq extends AbstractRunnableC2705Wc {
    public final /* synthetic */ Wm A00;

    public C2718Wq(Wm wm) {
        this.A00 = wm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
