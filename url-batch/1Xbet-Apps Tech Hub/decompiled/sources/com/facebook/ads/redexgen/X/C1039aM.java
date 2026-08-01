package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1039aM implements InterfaceC01591e {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1045aS A01;
    public final /* synthetic */ C1043aQ A02;
    public final /* synthetic */ InterfaceC01591e A03;
    public final /* synthetic */ C01601f A04;
    public final /* synthetic */ YA A05;
    public final /* synthetic */ EnumSet A06;

    public C1039aM(C01601f c01601f, YA ya, AbstractC1045aS abstractC1045aS, C1043aQ c1043aQ, int i, InterfaceC01591e interfaceC01591e, EnumSet enumSet) {
        this.A04 = c01601f;
        this.A05 = ya;
        this.A01 = abstractC1045aS;
        this.A02 = c1043aQ;
        this.A00 = i;
        this.A03 = interfaceC01591e;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0q()) {
            return;
        }
        C01601f c01601f = this.A04;
        YA ya = this.A05;
        EnumSet enumSet = this.A06;
        C1043aQ c1043aQ = this.A02;
        c01601f.A0A(ya, enumSet, c1043aQ, c1043aQ.A0t(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01591e
    public final void AAP(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAP(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01591e
    public final void AAQ() {
        this.A05.A00().AF6(this.A01.A11(), this.A02.A0u());
        if (this.A00 == 0) {
            this.A03.AAQ();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01591e
    public final void AEL() {
        if (this.A00 == 0) {
            this.A03.AEL();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01591e
    public final void AG1() {
        if (this.A00 == 0) {
            this.A03.AG1();
        }
    }
}
