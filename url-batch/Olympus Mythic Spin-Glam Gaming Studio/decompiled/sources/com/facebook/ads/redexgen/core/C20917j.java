package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C20917j extends AbstractC3353j0 {
    public C20917j(C3218gi c3218gi, O7 o7) {
        super(c3218gi, o7);
    }

    private C3351iy A00(Runnable runnable) {
        return new C3351iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3353j0
    public final NQ A0I() {
        C3405jz successfullyLoadedAdapter = (C3405jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3353j0
    public final void A0P() {
        C3405jz interstitialAdapter = (C3405jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3353j0
    public final void A0R(N1 n1, C2649Tw c2649Tw, C2647Tu c2647Tu, O8 o8) {
        C3405jz c3405jz = (C3405jz) n1;
        C3352iz c3352iz = new C3352iz(this, o8, c3405jz);
        A0H().postDelayed(c3352iz, c2649Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c3405jz.A0A(this.A0B, A00(c3352iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
