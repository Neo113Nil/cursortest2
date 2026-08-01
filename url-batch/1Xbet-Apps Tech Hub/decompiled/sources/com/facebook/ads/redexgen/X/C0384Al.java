package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0384Al implements UI {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C0384Al(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0580Iu
    public final void AAN() {
        C0608Jz.A00(new UE(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0580Iu
    public final void AAR() {
        C0608Jz.A00(new UF(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0580Iu
    public final void ABH(JG jg) {
        C0608Jz.A00(new UH(this, jg));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0580Iu
    public final void ABy() {
        C0608Jz.A00(new UD(this));
    }

    @Override // com.facebook.ads.redexgen.X.UI
    public final void AC3() {
        C0608Jz.A00(new UG(this));
    }
}
