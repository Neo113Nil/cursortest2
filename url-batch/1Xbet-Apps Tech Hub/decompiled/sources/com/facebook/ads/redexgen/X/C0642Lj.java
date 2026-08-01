package com.facebook.ads.redexgen.X;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0642Lj {
    public static C0642Lj A02;
    public final C0855Tp A00;
    public final C0644Ll A01;

    public C0642Lj(YA ya, Executor executor, C8F c8f) {
        this.A01 = new C0644Ll(ya);
        this.A00 = new C0855Tp(executor, c8f, ya);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(YA ya, Executor executor, C8F c8f) {
        if (!IP.A1D(ya)) {
            return;
        }
        C0642Lj c0642Lj = A02;
        if (c0642Lj == null) {
            C0642Lj c0642Lj2 = new C0642Lj(ya, executor, c8f);
            A02 = c0642Lj2;
            c0642Lj2.A00();
            return;
        }
        c0642Lj.A02(c8f);
    }

    private void A02(C8F c8f) {
        this.A00.A07(c8f);
    }
}
