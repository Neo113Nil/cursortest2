package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C20806y implements InterfaceC2648Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C20806y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACm() {
        WT.A00(new C2643Tq(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACq() {
        WT.A00(new C2644Tr(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ADp(C2690Vm c2690Vm) {
        WT.A00(new C2646Tt(this, c2690Vm));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void AEl() {
        WT.A00(new C2642Tp(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2648Tv
    public final void AEq() {
        WT.A00(new C2645Ts(this));
    }
}
