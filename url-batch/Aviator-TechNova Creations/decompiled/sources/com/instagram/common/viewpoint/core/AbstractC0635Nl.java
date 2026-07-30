package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0635Nl {

    @Nullable
    public static HandlerC0634Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC0634Nk A00(C1133cu c1133cu) {
        if (A00 == null) {
            A00 = new HandlerC0634Nk(c1133cu);
        }
        return A00;
    }

    public static void A01(C1133cu c1133cu) {
        if (UA.A0F(c1133cu)) {
            A03(c1133cu);
        }
    }

    public static void A02(C1133cu c1133cu) {
        if (UA.A0E(c1133cu)) {
            A03(c1133cu);
        }
    }

    public static void A03(C1133cu c1133cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C1369go(c1133cu));
        }
    }
}
