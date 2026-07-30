package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends AbstractC1690mS implements InterfaceC0346Cg {
    public long A00;
    public C5H A01;
    public InterfaceC1512jM<InterfaceExecutorC0417Ez> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C2Q A07;
    public final C1827oi A08;
    public final InterfaceC01704w A09;
    public final C9U A0A;
    public final InterfaceC0340Ca A0B;
    public final InterfaceC0395Ed A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public AnonymousClass98(C1827oi c1827oi, InterfaceC01704w interfaceC01704w, InterfaceC0340Ca interfaceC0340Ca, C9U c9u, InterfaceC0395Ed interfaceC0395Ed, int i, InterfaceC1512jM<InterfaceExecutorC0417Ez> interfaceC1512jM) {
        this.A07 = (C2Q) C3M.A01(c1827oi.A03);
        this.A08 = c1827oi;
        this.A09 = interfaceC01704w;
        this.A0B = interfaceC0340Ca;
        this.A0A = c9u == null ? C9U.A00 : c9u;
        this.A0C = interfaceC0395Ed;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC1512jM;
    }

    private void A00() {
        final Timeline anonymousClass97 = new AnonymousClass97(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9C(anonymousClass97) { // from class: com.facebook.ads.redexgen.X.12
                @Override // com.instagram.common.viewpoint.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C1807oN A0I(int i, C1807oN c1807oN, boolean z) {
                    super.A0I(i, c1807oN, z);
                    c1807oN.A05 = true;
                    return c1807oN;
                }

                @Override // com.instagram.common.viewpoint.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C1805oL A0L(int i, C1805oL c1805oL, long j) {
                    super.A0L(i, c1805oL, j);
                    c1805oL.A0F = true;
                    return c1805oL;
                }
            };
            anonymousClass97 = timeline;
        }
        A05(anonymousClass97);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1690mS
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1690mS
    public final void A0A(C5H c5h) {
        this.A01 = c5h;
        this.A0A.AGK();
        this.A0A.AIu((Looper) C3M.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.CL
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC1684mM A5O(C1683mL c1683mL, EO eo, long j) {
        InterfaceExecutorC0417Ez interfaceExecutorC0417Ez;
        InterfaceC1771nl A5A = this.A09.A5A();
        if (this.A01 != null) {
            A5A.A3v(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC0341Cb A5P = this.A0B.A5P(C02387m.A03);
        C9U c9u = this.A0A;
        C9P A01 = A01(c1683mL);
        InterfaceC0395Ed interfaceC0395Ed = this.A0C;
        CW A02 = A02(c1683mL);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0417Ez = this.A02.get();
        } else {
            interfaceExecutorC0417Ez = null;
        }
        return new C9A(uri, A5A, A5P, c9u, A01, interfaceC0395Ed, A02, this, eo, str, i, interfaceExecutorC0417Ez);
    }

    @Override // com.instagram.common.viewpoint.core.CL
    public final void ABu() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0346Cg
    public final void AFH(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.CL
    public final void AH0(InterfaceC1684mM interfaceC1684mM) {
        ((C9A) interfaceC1684mM).A0a();
    }
}
