package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1068ap implements InterfaceC02715p {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1063ak A01;
    public final /* synthetic */ C1063ak A02;
    public final /* synthetic */ C8G A03;

    public C1068ap(C1063ak c1063ak, int i, C8G c8g, C1063ak c1063ak2) {
        this.A01 = c1063ak;
        this.A00 = i;
        this.A03 = c8g;
        this.A02 = c1063ak2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02715p
    public final void AAW() {
        this.A01.A0B(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02715p
    public final void AAX() {
        InterfaceC01510w interfaceC01510w;
        interfaceC01510w = this.A01.A00;
        interfaceC01510w.ABm(this.A02, JG.A00(AdErrorType.NO_FILL));
    }
}
