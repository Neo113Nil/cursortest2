package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2303Gh implements InterfaceC3038dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2300Ge A01;

    public C2303Gh(C2300Ge c2300Ge, int i) {
        this.A01 = c2300Ge;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3038dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3038dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3038dm
    public final void ADc(int i) {
        C2300Ge.A03(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3038dm
    public final void ADw(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0L(f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3038dm
    public final void AFw(boolean z) {
        this.A01.A0W(z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3038dm
    public final void AGQ(String str) {
        C3218gi c3218gi;
        C3377jT c3377jT;
        InterfaceC2759Yh interfaceC2759Yh;
        ZU zu;
        int i;
        C3377jT c3377jT2;
        C3218gi c3218gi2;
        c3218gi = this.A01.A0D;
        c3218gi.A0F().A3a(str);
        c3377jT = this.A01.A0A;
        if (c3377jT.A2H()) {
            i = this.A01.A00;
            c3377jT2 = this.A01.A0A;
            if (i < c3377jT2.A23()) {
                c3218gi2 = this.A01.A0D;
                c3218gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC2759Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC2759Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3038dm
    public final void AKc() {
        AbstractC2753Yb abstractC2753Yb;
        AbstractC2753Yb abstractC2753Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC2753Yb = this.A01.A0H;
        abstractC2753Yb.setProgressImmediate(0.0f);
        abstractC2753Yb2 = this.A01.A0H;
        abstractC2753Yb2.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3038dm
    public final void AKd(float f) {
        AbstractC2753Yb abstractC2753Yb;
        abstractC2753Yb = this.A01.A0H;
        abstractC2753Yb.setProgress(100.0f * f);
    }
}
