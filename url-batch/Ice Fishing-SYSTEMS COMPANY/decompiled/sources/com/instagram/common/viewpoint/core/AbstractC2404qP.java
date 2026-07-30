package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.qP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2404qP implements InterfaceC06023b {
    public final C2364pj A00 = new C2364pj();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i, long j9);

    public final int A00() {
        long A77 = A77();
        long A7s = A7s();
        if (A77 == b.f6539b || A7s == b.f6539b) {
            return 0;
        }
        if (A7s == 0) {
            return 100;
        }
        return C5C.A07((int) ((100 * A77) / A7s), 0, 100);
    }

    public void A01() {
        AKG(false);
    }

    public final void A02() {
        A03(A7h());
    }

    public final void A03(int i) {
        A0H(i, b.f6539b);
    }

    public final void A04(long j9) {
        A0H(A7h(), j9);
    }
}
