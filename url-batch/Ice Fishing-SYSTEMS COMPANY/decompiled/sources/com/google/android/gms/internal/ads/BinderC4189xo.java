package com.google.android.gms.internal.ads;

import java.util.Objects;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4189xo extends AbstractBinderC3319hf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4243yo f35252n;

    public BinderC4189xo(C4243yo c4243yo) {
        Objects.requireNonNull(c4243yo);
        this.f35252n = c4243yo;
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void A(int i) {
        C4243yo c4243yo = this.f35252n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onRewardedAdFailedToShow";
        q82.f27122w = Integer.valueOf(i);
        c3562m7.s(q82);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void C0(C4927z0 c4927z0) {
        C4243yo c4243yo = this.f35252n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        int i = c4927z0.f40122n;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onRewardedAdFailedToShow";
        q82.f27122w = Integer.valueOf(i);
        c3562m7.s(q82);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void O2(InterfaceC3047cf interfaceC3047cf) {
        C4243yo c4243yo = this.f35252n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onUserEarnedReward";
        q82.f27123x = interfaceC3047cf.c();
        q82.f27124y = Integer.valueOf(interfaceC3047cf.f());
        c3562m7.s(q82);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void c() {
        C4243yo c4243yo = this.f35252n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onRewardedAdOpened";
        c3562m7.s(q82);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void f() {
        C4243yo c4243yo = this.f35252n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onRewardedAdClosed";
        c3562m7.s(q82);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void h() {
        C4243yo c4243yo = this.f35252n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onAdImpression";
        c3562m7.s(q82);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void j() {
        C4243yo c4243yo = this.f35252n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onAdClicked";
        c3562m7.s(q82);
    }
}
