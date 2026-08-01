package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0967Ya extends AbstractRunnableC0604Jv {
    public final /* synthetic */ YX A00;
    public final /* synthetic */ JG A01;

    public C0967Ya(YX yx, JG jg) {
        this.A00 = yx;
        this.A01 = jg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0604Jv
    public final void A01() {
        C02565a c02565a;
        C02565a c02565a2;
        c02565a = this.A00.A00;
        if (c02565a.A00() != null) {
            c02565a2 = this.A00.A00;
            c02565a2.A00().onAdError(C0614Kf.A00(this.A01));
        }
    }
}
