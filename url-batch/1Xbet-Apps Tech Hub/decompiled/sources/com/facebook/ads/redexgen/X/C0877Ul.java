package com.facebook.ads.redexgen.X;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.redexgen.X.Ul, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0877Ul extends K8 {
    public final /* synthetic */ C0876Uk A00;

    public C0877Ul(C0876Uk c0876Uk) {
        this.A00 = c0876Uk;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
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
