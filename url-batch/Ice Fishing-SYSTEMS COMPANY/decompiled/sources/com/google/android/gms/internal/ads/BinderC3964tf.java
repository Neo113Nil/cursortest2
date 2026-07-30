package com.google.android.gms.internal.ads;

import k2.AbstractC4642m;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3964tf extends AbstractBinderC3319hf {

    /* renamed from: n, reason: collision with root package name */
    public AbstractC4642m f34424n;

    /* renamed from: u, reason: collision with root package name */
    public k2.q f34425u;

    @Override // com.google.android.gms.internal.ads.Cif
    public final void A(int i) {
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void C0(C4927z0 c4927z0) {
        AbstractC4642m abstractC4642m = this.f34424n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdFailedToShowFullScreenContent(c4927z0.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void O2(InterfaceC3047cf interfaceC3047cf) {
        k2.q qVar = this.f34425u;
        if (qVar != null) {
            qVar.onUserEarnedReward(new Vx(12, interfaceC3047cf));
        }
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void c() {
        AbstractC4642m abstractC4642m = this.f34424n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void f() {
        AbstractC4642m abstractC4642m = this.f34424n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void h() {
        AbstractC4642m abstractC4642m = this.f34424n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void j() {
        AbstractC4642m abstractC4642m = this.f34424n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdClicked();
        }
    }
}
