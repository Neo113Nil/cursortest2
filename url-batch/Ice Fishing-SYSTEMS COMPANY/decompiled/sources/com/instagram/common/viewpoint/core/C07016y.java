package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07016y implements InterfaceC1269Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C07016y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACm() {
        WT.A00(new C1264Tq(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACq() {
        WT.A00(new C1265Tr(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ADp(C1311Vm c1311Vm) {
        WT.A00(new C1267Tt(this, c1311Vm));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void AEl() {
        WT.A00(new C1263Tp(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1269Tv
    public final void AEq() {
        WT.A00(new C1266Ts(this));
    }
}
