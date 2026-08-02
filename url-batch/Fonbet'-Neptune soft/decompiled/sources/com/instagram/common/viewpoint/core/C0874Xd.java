package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0874Xd {
    public static C0874Xd A02;
    public final C0654Om A00;
    public final C0876Xf A01;

    public C0874Xd(C1153dL c1153dL, Executor executor, TE te) {
        this.A01 = new C0876Xf(c1153dL);
        this.A00 = new C0654Om(executor, te, c1153dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1153dL c1153dL, Executor executor, TE te) {
        if (!U7.A1X(c1153dL)) {
            return;
        }
        if (A02 == null) {
            A02 = new C0874Xd(c1153dL, executor, te);
            A02.A00();
        } else {
            A02.A02(te);
        }
    }

    private void A02(TE te) {
        this.A00.A07(te);
    }
}
