package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2392Jt implements InterfaceC2896bU {
    public final /* synthetic */ C2381Ji A00;

    public C2392Jt(C2381Ji c2381Ji) {
        this.A00 = c2381Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2896bU
    public final void ADY() {
        VI vi;
        AbstractC2470Mt abstractC2470Mt;
        C2935c7 c2935c7;
        C2895bT c2895bT;
        C2895bT c2895bT2;
        C2935c7 c2935c72;
        AbstractC2470Mt abstractC2470Mt2;
        vi = this.A00.A0Y;
        vi.A04(VH.A0J, null);
        abstractC2470Mt = this.A00.A0W;
        if (abstractC2470Mt != null) {
            C2381Ji c2381Ji = this.A00;
            abstractC2470Mt2 = this.A00.A0W;
            c2381Ji.A0m(((AnonymousClass85) abstractC2470Mt2).A0M().toString());
        }
        c2935c7 = this.A00.A0b;
        if (c2935c7.A0D() != null) {
            c2935c72 = this.A00.A0b;
            c2935c72.A0D().ACQ();
        }
        c2895bT = this.A00.A09;
        if (c2895bT != null) {
            c2895bT2 = this.A00.A09;
            c2895bT2.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
