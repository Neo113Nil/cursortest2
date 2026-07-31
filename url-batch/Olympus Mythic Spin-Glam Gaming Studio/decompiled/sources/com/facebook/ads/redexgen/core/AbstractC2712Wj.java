package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2712Wj {
    public static final AtomicReference<InterfaceC2711Wi> A00 = new AtomicReference<>(null);

    public static InterfaceC2711Wi A00() {
        InterfaceC2711Wi errorLogger = A00.get();
        if (errorLogger == null) {
            return new R1();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC2711Wi interfaceC2711Wi) {
        A00.set(interfaceC2711Wi);
    }
}
