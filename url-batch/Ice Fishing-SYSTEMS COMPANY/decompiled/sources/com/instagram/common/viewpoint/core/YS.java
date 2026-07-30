package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1162Pp A00;
    public final YU A01;

    public YS(C1839gi c1839gi, Executor executor, C1270Tw c1270Tw) {
        this.A01 = new YU(c1839gi);
        this.A00 = new C1162Pp(executor, c1270Tw, c1839gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1839gi c1839gi, Executor executor, C1270Tw c1270Tw) {
        if (!C1289Up.A1c(c1839gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c1839gi, executor, c1270Tw);
            A02.A00();
        } else {
            A02.A02(c1270Tw);
        }
    }

    private void A02(C1270Tw c1270Tw) {
        this.A00.A07(c1270Tw);
    }
}
