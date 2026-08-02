package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0629Nl {

    @Nullable
    public static HandlerC0628Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC0628Nk A00(C1127cu c1127cu) {
        if (A00 == null) {
            A00 = new HandlerC0628Nk(c1127cu);
        }
        return A00;
    }

    public static void A01(C1127cu c1127cu) {
        if (UA.A0F(c1127cu)) {
            A03(c1127cu);
        }
    }

    public static void A02(C1127cu c1127cu) {
        if (UA.A0E(c1127cu)) {
            A03(c1127cu);
        }
    }

    public static void A03(C1127cu c1127cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C1363go(c1127cu));
        }
    }
}
