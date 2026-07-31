package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C21067y extends AbstractC3357j4 {
    public final /* synthetic */ C21047w A00;
    public final /* synthetic */ AbstractC3387jh A01;
    public final /* synthetic */ C20937l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21067y(C21047w c21047w, boolean z, boolean z2, C20937l c20937l, AbstractC3387jh abstractC3387jh) {
        super(z);
        this.A00 = c21047w;
        this.A03 = z2;
        this.A02 = c20937l;
        this.A01 = abstractC3387jh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3357j4
    public final void A00() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3357j4
    public final void A01(boolean z) {
        C3218gi c3218gi;
        WK wk;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C3218gi c3218gi2;
        C3218gi c3218gi3;
        c3218gi = this.A00.A04;
        if (!C2668Up.A1t(c3218gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == WK.A0J) {
                c3218gi2 = this.A00.A04;
                c3218gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        C21047w c21047w = this.A00;
        c3218gi3 = this.A00.A04;
        c21047w.A06 = AbstractC3003dD.A01(c3218gi3, this.A02, 0, new C3396jq(this));
    }
}
