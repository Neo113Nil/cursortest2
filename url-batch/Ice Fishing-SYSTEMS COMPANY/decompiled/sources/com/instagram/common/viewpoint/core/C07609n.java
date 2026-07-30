package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07609n extends AbstractC2254nv implements DI {
    public long A00;
    public InterfaceC06705t A01;
    public InterfaceC2080ku<InterfaceExecutorC0893Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2388q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C07609n(C2388q7 c2388q7, C5Y c5y, DC dc, A6 a62, FF ff, int i, InterfaceC2080ku<InterfaceExecutorC0893Fb> interfaceC2080ku) {
        this.A07 = (AnonymousClass32) AbstractC06233y.A01(c2388q7.A03);
        this.A08 = c2388q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a62 == null ? A6.A00 : a62;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = b.f6539b;
        this.A02 = interfaceC2080ku;
    }

    private void A00() {
        final Timeline c07599m = new C07599m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c07599m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2366pl A0I(int i, C2366pl c2366pl, boolean z8) {
                    super.A0I(i, c2366pl, z8);
                    c2366pl.A05 = true;
                    return c2366pl;
                }

                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2364pj A0L(int i, C2364pj c2364pj, long j9) {
                    super.A0L(i, c2364pj, j9);
                    c2364pj.A0F = true;
                    return c2364pj;
                }
            };
            c07599m = timeline;
        }
        A05(c07599m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2254nv
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2254nv
    public final void A0A(InterfaceC06705t interfaceC06705t) {
        this.A01 = interfaceC06705t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC06233y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0837Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2248np A5W(C2247no c2247no, F0 f02, long j9) {
        InterfaceExecutorC0893Fb interfaceExecutorC0893Fb;
        InterfaceC2335pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD A5X = this.A0B.A5X(C8O.A03);
        A6 a62 = this.A0A;
        A1 A01 = A01(c2247no);
        FF ff = this.A0C;
        D8 A02 = A02(c2247no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0893Fb = this.A02.get();
        } else {
            interfaceExecutorC0893Fb = null;
        }
        return new C07629p(uri, A5I, A5X, a62, A01, ff, A02, this, f02, str, i, interfaceExecutorC0893Fb);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0837Cx
    public final void ACT() {
    }

    @Override // com.instagram.common.viewpoint.core.DI
    public final void AG0(long j9, boolean z8, boolean z9) {
        if (j9 == b.f6539b) {
            j9 = this.A00;
        }
        if (!this.A04 && this.A00 == j9 && this.A05 == z8 && this.A03 == z9) {
            return;
        }
        this.A00 = j9;
        this.A05 = z8;
        this.A03 = z9;
        this.A04 = false;
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0837Cx
    public final void AHk(InterfaceC2248np interfaceC2248np) {
        ((C07629p) interfaceC2248np).A0a();
    }
}
