package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UH extends AbstractRunnableC0604Jv {
    public final /* synthetic */ C0384Al A00;
    public final /* synthetic */ JG A01;

    public UH(C0384Al c0384Al, JG jg) {
        this.A00 = c0384Al;
        this.A01 = jg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0604Jv
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, C0614Kf.A00(this.A01));
    }
}
