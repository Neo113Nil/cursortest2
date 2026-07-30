package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.eG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1215eG implements Runnable {
    public final /* synthetic */ C1218eJ A00;

    public RunnableC1215eG(C1218eJ c1218eJ) {
        this.A00 = c1218eJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            handler = this.A00.A01;
            handler.removeCallbacks(this);
            handler2 = this.A00.A01;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
