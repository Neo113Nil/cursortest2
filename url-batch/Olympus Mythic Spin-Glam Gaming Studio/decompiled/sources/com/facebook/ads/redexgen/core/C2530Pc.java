package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2530Pc implements InterfaceC2586Rk {
    public final /* synthetic */ PZ A00;

    public C2530Pc(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2586Rk
    public final boolean AAI() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
