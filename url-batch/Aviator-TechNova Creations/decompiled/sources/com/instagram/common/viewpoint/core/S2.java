package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class S2 extends Thread {
    public final long A00;

    public S2(long j) {
        this.A00 = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    Thread.sleep(this.A00);
                } catch (Throwable th) {
                    AbstractC0838Vl.A00(th, this);
                    return;
                }
            } catch (InterruptedException unused) {
            }
            S0.A01();
        }
    }
}
