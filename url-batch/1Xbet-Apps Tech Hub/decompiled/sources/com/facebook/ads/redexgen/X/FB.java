package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class FB extends AbstractC1030aD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FA A01;
    public final /* synthetic */ C1043aQ A02;
    public final /* synthetic */ C0482Ey A03;
    public final /* synthetic */ YA A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FB(FA fa, boolean z, YA ya, C0482Ey c0482Ey, C1043aQ c1043aQ, int i) {
        super(z);
        this.A01 = fa;
        this.A04 = ya;
        this.A03 = c0482Ey;
        this.A02 = c1043aQ;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1030aD
    public final void A00() {
        AnonymousClass15 anonymousClass15;
        anonymousClass15 = this.A01.A01;
        anonymousClass15.ACq(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1030aD
    public final void A01(boolean z) {
        AtomicBoolean atomicBoolean;
        AnonymousClass15 anonymousClass15;
        FA.A0D = null;
        if (z) {
            this.A04.A00().AF6(this.A03.A11(), this.A02.A0u());
        }
        if (this.A00 == 0) {
            atomicBoolean = this.A01.A0C;
            atomicBoolean.set(true);
            anonymousClass15 = this.A01.A01;
            anonymousClass15.ACn(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
