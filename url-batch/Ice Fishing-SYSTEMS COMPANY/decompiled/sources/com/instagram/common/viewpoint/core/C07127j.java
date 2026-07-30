package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07127j extends AbstractC1974j0 {
    public C07127j(C1839gi c1839gi, O7 o72) {
        super(c1839gi, o72);
    }

    private C1972iy A00(Runnable runnable) {
        return new C1972iy(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1974j0
    public final NQ A0I() {
        C2026jz successfullyLoadedAdapter = (C2026jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1974j0
    public final void A0P() {
        C2026jz interstitialAdapter = (C2026jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1974j0
    public final void A0R(N1 n1, C1270Tw c1270Tw, C1268Tu c1268Tu, O8 o82) {
        C2026jz c2026jz = (C2026jz) n1;
        C1973iz c1973iz = new C1973iz(this, o82, c2026jz);
        A0H().postDelayed(c1973iz, c1270Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2026jz.A0A(this.A0B, A00(c1973iz), o82, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
