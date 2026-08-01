package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class ID implements Runnable {
    public final /* synthetic */ C0393Au A00;
    public final /* synthetic */ IK A01;

    public ID(IK ik, C0393Au c0393Au) {
        this.A01 = ik;
        this.A00 = c0393Au;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IL il;
        if (K0.A02(this)) {
            return;
        }
        try {
            il = this.A01.A01;
            il.ADM(this.A00);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
