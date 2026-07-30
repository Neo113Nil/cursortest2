package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class FP implements InterfaceC0872Wv {
    public final /* synthetic */ C01393r A00;

    public FP(C01393r c01393r) {
        this.A00 = c01393r;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0872Wv
    public final void AEQ(String str) {
        Handler handler;
        handler = this.A00.A0G;
        handler.postDelayed(new RunnableC1113ca(this), 2000L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0872Wv
    public final void AER(String str) {
        this.A00.A0I(UZ.A0c);
    }
}
