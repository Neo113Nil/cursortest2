package com.instagram.common.viewpoint.core;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: assets/audience_network.dex */
public class VK extends AbstractRunnableC0846Vt {
    public final /* synthetic */ VJ A00;

    public VK(VJ vj) {
        this.A00 = vj;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
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
