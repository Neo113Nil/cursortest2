package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0880Xd {
    public static C0880Xd A02;
    public final C0660Om A00;
    public final C0882Xf A01;

    public C0880Xd(C1159dL c1159dL, Executor executor, TE te) {
        this.A01 = new C0882Xf(c1159dL);
        this.A00 = new C0660Om(executor, te, c1159dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1159dL c1159dL, Executor executor, TE te) {
        if (!U7.A1X(c1159dL)) {
            return;
        }
        if (A02 == null) {
            A02 = new C0880Xd(c1159dL, executor, te);
            A02.A00();
        } else {
            A02.A02(te);
        }
    }

    private void A02(TE te) {
        this.A00.A07(te);
    }
}
