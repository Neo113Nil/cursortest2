package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0934Zf implements Runnable {
    public final /* synthetic */ C0935Zg A00;
    public final /* synthetic */ InterfaceC0936Zh A01;

    public RunnableC0934Zf(C0935Zg c0935Zg, InterfaceC0936Zh interfaceC0936Zh) {
        this.A00 = c0935Zg;
        this.A01 = interfaceC0936Zh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
