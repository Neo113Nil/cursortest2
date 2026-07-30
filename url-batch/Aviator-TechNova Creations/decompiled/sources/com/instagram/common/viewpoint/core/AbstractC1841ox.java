package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1841ox implements InterfaceC01212z {
    public final C1805oL A00 = new C1805oL();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i, long j);

    public final int A00() {
        long A6z = A6z();
        long A7k = A7k();
        if (A6z == -9223372036854775807L || A7k == -9223372036854775807L) {
            return 0;
        }
        if (A7k == 0) {
            return 100;
        }
        return AbstractC01484a.A07((int) ((100 * A6z) / A7k), 0, 100);
    }

    public void A01() {
        AJV(false);
    }

    public final void A02() {
        A03(A7Z());
    }

    public final void A03(int i) {
        A0H(i, -9223372036854775807L);
    }

    public final void A04(long j) {
        A0H(A7Z(), j);
    }
}
