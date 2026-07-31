package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C21399n extends AbstractC3633nv implements DI {
    public long A00;
    public InterfaceC20495t A01;
    public InterfaceC3459ku<InterfaceExecutorC2272Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C3767q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C21399n(C3767q7 c3767q7, C5Y c5y, DC dc, A6 a6, FF ff, int i, InterfaceC3459ku<InterfaceExecutorC2272Fb> interfaceC3459ku) {
        this.A07 = (AnonymousClass32) AbstractC20023y.A01(c3767q7.A03);
        this.A08 = c3767q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a6 == null ? A6.A00 : a6;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC3459ku;
    }

    private void A00() {
        final Timeline c21389m = new C21389m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c21389m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C3745pl A0I(int i, C3745pl c3745pl, boolean z) {
                    super.A0I(i, c3745pl, z);
                    c3745pl.A05 = true;
                    return c3745pl;
                }

                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C3743pj A0L(int i, C3743pj c3743pj, long j) {
                    super.A0L(i, c3743pj, j);
                    c3743pj.A0F = true;
                    return c3743pj;
                }
            };
            c21389m = timeline;
        }
        A05(c21389m);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3633nv
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3633nv
    public final void A0A(InterfaceC20495t interfaceC20495t) {
        this.A01 = interfaceC20495t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC20023y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2216Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC3627np A5W(C3626no c3626no, F0 f0, long j) {
        InterfaceExecutorC2272Fb interfaceExecutorC2272Fb;
        InterfaceC3714pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD A5X = this.A0B.A5X(C8O.A03);
        A6 a6 = this.A0A;
        A1 A01 = A01(c3626no);
        FF ff = this.A0C;
        D8 A02 = A02(c3626no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC2272Fb = this.A02.get();
        } else {
            interfaceExecutorC2272Fb = null;
        }
        return new C21419p(uri, A5I, A5X, a6, A01, ff, A02, this, f0, str, i, interfaceExecutorC2272Fb);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2216Cx
    public final void ACT() {
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void AG0(long j, boolean z, boolean z2) {
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

    @Override // com.facebook.ads.redexgen.core.InterfaceC2216Cx
    public final void AHk(InterfaceC3627np interfaceC3627np) {
        ((C21419p) interfaceC3627np).A0a();
    }
}
