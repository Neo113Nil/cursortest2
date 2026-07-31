package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class sf0 implements z2.q {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ zzcaf f11804f;

    sf0(zzcaf zzcafVar) {
        this.f11804f = zzcafVar;
    }

    @Override // z2.q
    public final void B3() {
        io0.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // z2.q
    public final void E(int i7) {
        c3.n nVar;
        io0.b("AdMobCustomTabsAdapter overlay is closed.");
        nVar = this.f11804f.f15365b;
        nVar.m(this.f11804f);
    }

    @Override // z2.q
    public final void a() {
        c3.n nVar;
        io0.b("Opening AdMobCustomTabsAdapter overlay.");
        nVar = this.f11804f.f15365b;
        nVar.q(this.f11804f);
    }

    @Override // z2.q
    public final void b() {
    }

    @Override // z2.q
    public final void k6() {
        io0.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // z2.q
    public final void o4() {
        io0.b("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
